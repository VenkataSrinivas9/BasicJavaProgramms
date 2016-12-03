package basic.java.demo.project.MyExpensesApp;

import java.awt.Color;
import java.awt.Graphics2D;

import javax.swing.JComponent;
import javax.swing.Painter;

public class BackgroundPainter implements Painter<JComponent> {

  private Color color = null;

  BackgroundPainter(Color c) {
    color = c;
  }

  public void paint(Graphics2D g, JComponent object, int width, int height) {
    if (color != null) {
        g.setColor(color);
        g.fillRect(0, 0, width - 1, height - 1);
    }
  }
}