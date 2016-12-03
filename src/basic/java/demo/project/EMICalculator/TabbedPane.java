package basic.java.demo.project.EMICalculator;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;

public class TabbedPane
        extends JFrame {
    public TabbedPane() {
        setTitle("Tabbed Pane");
        JTabbedPane jtp = new JTabbedPane();
        jtp.setUI(new CustomTabbedPaneUI());
        getContentPane().add(jtp);
        JPanel jp1 = new JPanel();
        JPanel jp2 = new JPanel();
        JPanel jp3 = new JPanel();
        JLabel label1 = new JLabel();
        label1.setText("You are in area of Tab1");
        JLabel label2 = new JLabel();
        label2.setText("You are in area of Tab2");
        JLabel label3 = new JLabel();
        label3.setText("You are in area of Tab3");
        jp1.add(label1);
        jp2.add(label2);
        jp3.add(label3);
        jtp.addTab("Tab1", jp1);
        jtp.addTab("Tab2", jp2);
        jtp.addTab("Tab3", jp3);
//        jtp.setBackground(Color.CYAN);
//        jtp.setBackgroundAt(1, Color.RED);
//        jtp.setForeground(Color.BLUE);
    }

    public static void main(String[] args) {
        TabbedPane tp = new TabbedPane();
        tp.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        tp.setVisible(true);
    }
}