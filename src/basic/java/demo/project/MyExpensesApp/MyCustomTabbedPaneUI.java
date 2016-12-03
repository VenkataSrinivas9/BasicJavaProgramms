package basic.java.demo.project.MyExpensesApp;

import java.awt.Color;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Polygon;
import java.awt.Rectangle;

import javax.swing.JComponent;
import javax.swing.UIManager;
import javax.swing.plaf.ComponentUI;
import javax.swing.plaf.basic.BasicGraphicsUtils;
import javax.swing.plaf.basic.BasicTabbedPaneUI;
import javax.swing.text.View;

public class MyCustomTabbedPaneUI extends BasicTabbedPaneUI {

    private Color defaultColor;
    private Color focusColor;
    private Color selectedColor;
    
    private Polygon shape;

    public static ComponentUI createUI(JComponent c) {
        return new MyCustomTabbedPaneUI();
    }

    @Override
    protected void installDefaults() {
        super.installDefaults();
        
        defaultColor = Color.GRAY;
        focusColor = Color.LIGHT_GRAY;
        selectedColor = Color.WHITE;
    }

//    @Override
//    protected void paintTabArea(Graphics g, int tabPlacement, int selectedIndex) {
//            if (tabPlacement == TOP) {
//                g.setColor(selectedColor);
//            } else {
//                g.setColor(defaultColor);
//            }
//        super.paintTabArea(g, tabPlacement, selectedIndex);
//    }

    @Override
    protected void paintTabBackground(Graphics g, int tabPlacement, int tabIndex, int x, int y, int w, int h, boolean isSelected) {
        Graphics2D g2D = (Graphics2D) g;
        int xp[] = null; // Para la forma
        int yp[] = null;
        switch (tabPlacement) {
            case LEFT:
                xp = new int[]{x, x, x + w, x + w, x};
                yp = new int[]{y, y + h - 3, y + h - 3, y, y};
                break;
            case RIGHT:
                xp = new int[]{x, x, x + w - 2, x + w - 2, x};
                yp = new int[]{y, y + h - 3, y + h - 3, y, y};
                break;
            case BOTTOM:
                xp = new int[]{x, x, x + w - 2, x + w - 2, x};
                yp = new int[]{y, y + h - 3, y + h - 3, y, y};
                break;
            case TOP:
            default:
                xp = new int[]{x, x, x + w - 2, x + w - 2, x};
                yp = new int[]{y, y + h - 3, y + h - 3, y, y};
                break;
        }
        // ;
        shape = new Polygon(xp, yp, xp.length);
        if (isSelected) {
            g2D.setColor(selectedColor);
        } else {
            if (tabPane.isEnabled() && tabPane.isEnabledAt(tabIndex)) {
                g2D.setColor(defaultColor);
            } else {
                g2D.setColor(defaultColor);                
            }
        }
        g2D.fill(shape);
        if (runCount > 1) {
            g2D.setColor(Color.blue);
            g2D.fill(shape);
        }
        g2D.fill(shape);
    }

    @Override
    protected void paintText(Graphics g, int tabPlacement, Font font, FontMetrics metrics, int tabIndex, String title, Rectangle textRect, boolean isSelected) {
        super.paintText(g, tabPlacement, font, metrics, tabIndex, title, textRect, isSelected);
        g.setFont(font);
        View v = getTextViewForTab(tabIndex);
        if (v != null) {
            // html
           v.paint(g, textRect);
        } else {
            // plain text
            int mnemIndex = tabPane.getDisplayedMnemonicIndexAt(tabIndex);
            if (tabPane.isEnabled() && tabPane.isEnabledAt(tabIndex)) {
                g.setColor(tabPane.getForegroundAt(tabIndex));
                BasicGraphicsUtils.drawStringUnderlineCharAt(g, title, mnemIndex, textRect.x, textRect.y + metrics.getAscent());
            } else { // tab disabled
                g.setColor(Color.BLACK);
                BasicGraphicsUtils.drawStringUnderlineCharAt(g, title, mnemIndex, textRect.x, textRect.y + metrics.getAscent());
                g.setColor(tabPane.getBackgroundAt(tabIndex).darker());
                BasicGraphicsUtils.drawStringUnderlineCharAt(g, title, mnemIndex, textRect.x - 1, textRect.y + metrics.getAscent() - 1);
            }
        }
    }

    @Override
    protected int calculateTabWidth(int tabPlacement, int tabIndex, FontMetrics metrics) {
        return 24 + super.calculateTabWidth(tabPlacement, tabIndex, metrics);
    }

    @Override
    protected int calculateTabHeight(int tabPlacement, int tabIndex, int fontHeight) {
        if (tabPlacement == LEFT || tabPlacement == RIGHT) {
            return super.calculateTabHeight(tabPlacement, tabIndex, fontHeight);
        } else {
            return 4 + super.calculateTabHeight(tabPlacement, tabIndex, fontHeight);
        }
    }

    @Override
    protected void paintTabBorder(Graphics g, int tabPlacement, int tabIndex, int x, int y, int w, int h, boolean isSelected) {
    }

    @Override
    protected void paintFocusIndicator(Graphics g, int tabPlacement, Rectangle[] rects, int tabIndex, Rectangle iconRect, Rectangle textRect, boolean isSelected) {
        if (tabPane.hasFocus() && isSelected) {
            g.setColor(focusColor);
            g.drawPolygon(shape);
        }
    }
}