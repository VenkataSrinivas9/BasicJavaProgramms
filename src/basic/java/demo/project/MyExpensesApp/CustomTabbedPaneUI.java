package basic.java.demo.project.MyExpensesApp;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Insets;
import java.awt.Rectangle;

import javax.swing.UIManager;
import javax.swing.plaf.basic.BasicGraphicsUtils;
import javax.swing.plaf.basic.BasicTabbedPaneUI;

// This custom UI removes the 'raised bevel border' around the tabbed pane and 
// hides the tabs if there are less than 2 tabs open. No warranties!!! 
// 
// Use: 
//JTabbedPane tabbedPane = new JTabbedPane();
// tabbedPane.setUI(new CustomTabbedPaneUI());

public class CustomTabbedPaneUI
        extends BasicTabbedPaneUI {
    // Removes the tiny space that would have been taken up by the border
    protected Insets getContentBorderInsets(int tabPlacement) {
        return new Insets(0, 0, 0, 0);
    }

    // Override and paint nothing for the border instead
//    protected void paintContentBorder(Graphics g, int tabPlacement, int selectedIndex) {
//
//    }

    // If there are less than 2 tabs don't reserve any space for the tabs
//    protected int calculateTabHeight(int tabPlacement, int tabIndex, int fontHeight) {
//        if (super.tabPane.getTabCount() < 2)
//            return 0;
//        else
//            return super.calculateTabHeight(tabPlacement, tabIndex, fontHeight);
//    }
//
//    protected int calculateTabWidth(int tabPlacement, int tabIndex, FontMetrics metrics) {
//        if (super.tabPane.getTabCount() < 2)
//            return 0;
//        else
//            return super.calculateTabWidth(tabPlacement, tabIndex, metrics);
//    }

    // Removes the tiny 1 or 2 pixels reserved due to a 'selcted tab' being
    // a bit larger than the other tabs
//    protected Insets getTabAreaInsets(int tabPlacement) {
//        if (super.tabPane.getTabCount() < 2)
//            return new Insets(0, 0, 0, 0);
//        else
//            return super.getTabAreaInsets(tabPlacement);
//    }
//
//    // Don't paint if there are less than 2 tabs
//    protected void paintTabArea(Graphics g, int tabPlacement, int selectedIndex) {
//        if (super.tabPane.getTabCount() < 2)
//            return;
//        else
//            super.paintTabArea(g, tabPlacement, selectedIndex);
//    }

//    private Color selectedColor = Color.LIGHT_GRAY;
    private Color selectedColor = UIManager.getColor ( "Panel.background" );
    private Color defaultColor = Color.GRAY;
    protected void paintTabBackground(Graphics g, int tabPlacement,
            int tabIndex, int x, int y, int w, int h, boolean isSelected) {
//        g.setColor(!isSelected || selectedColor == null ? tabPane
//                .getBackgroundAt(tabIndex) : selectedColor);
        g.setColor(!isSelected || selectedColor == null ? defaultColor : selectedColor);
        switch (tabPlacement) {
            case LEFT:
                g.fillRect(x + 1, y + 1, w - 1, h - 1);
//                g.setColor(Color.RED);
//                g.drawRect(x-1, y-1, w, h);
                break;
            case RIGHT:
                g.fillRect(x, y + 1, w - 1, h - 1);
//                g.setColor(Color.RED);
//                g.drawRect(x-1, y-1, w, h);
                break;
            case BOTTOM:
                g.fillRect(x + 1, y, w - 1, h - 1);
//                g.setColor(Color.RED);
//                g.drawRect(x-1, y-1, w, h);
                break;
            case TOP:
            default:
                g.fillRect(x + 1, y + 1, w - 1, h - 1);
//                g.setColor(Color.RED);
//                g.drawRect(x-1, y-1, w, h);
        }
    }

    protected void paintTabBorder(Graphics g, int tabPlacement, int tabIndex,
            int x, int y, int w, int h, boolean isSelected) {
    }
    protected void paintFocusIndicator(Graphics g, int tabPlacement,
            Rectangle[] rects, int tabIndex, Rectangle iconRect,
            Rectangle textRect, boolean isSelected) {
    }
}
