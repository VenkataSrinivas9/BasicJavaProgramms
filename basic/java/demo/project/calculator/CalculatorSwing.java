/*****************************************************************************/
/* SCI */
/* All Rights Reserved. Copyright (C) 2008, Hitachi, Ltd. */
/* Licensed Material of Hitachi, Ltd. */
/* Reproduction, use, modification or disclosure otherwise than */
/* permitted in the License Agreement is strictly prohibited. */
/*****************************************************************************/

package basic.java.demo.project.calculator;

import java.awt.ComponentOrientation;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.UIManager;
import javax.swing.border.Border;

public class CalculatorSwing
        extends JFrame implements ActionListener, MouseListener {

    JPanel[] row = new JPanel[5];

    JButton[] button = new JButton[19];

    String[] buttonString = { "7", "8", "9", "+", "4", "5", "6", "-", "1", "2",
            "3", "*", ".", "/", "C", "V", "+/-", "=", "0" };

    int[] dimW = { 235, 45, 55, 90 };

    int[] dimH = { 40, 40 };

    Dimension displayDimension = new Dimension(dimW[0], dimH[0]);

    Dimension regularDimension = new Dimension(dimW[1], dimH[1]);

    Dimension rColumnDimension = new Dimension(dimW[2], dimH[1]);

    Dimension zeroButDimension = new Dimension(dimW[3], dimH[1]);

    boolean[] function = new boolean[4];

    double[] temporary = { 0, 0 };

    JTextArea display = new JTextArea(0,0);

    Font font1 = new Font("Times new Roman", Font.PLAIN , 14);
    Font font = new Font("Arial Black", Font.BOLD & Font.ITALIC , 16);

    private int border = 5;

    CalculatorSwing() {
        super("Calculator");
        setDesign();
        setSize(250,240);
        setResizable(false);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        GridLayout grid = new GridLayout(5, 5);
        setLayout(grid);

        for (int i = 0; i < 4; i++)
            function[i] = false;
        FlowLayout f1 = new FlowLayout(FlowLayout.CENTER);
        FlowLayout f2 = new FlowLayout(FlowLayout.CENTER, 1, 1);
        for (int i = 0; i < 5; i++)
            row[i] = new JPanel();
        row[0].setLayout(f1);

        for (int i = 1; i < 5; i++)
            row[i].setLayout(f2);
        for (int i = 0; i < 19; i++) {
            button[i] = new JButton();
            button[i].setText(buttonString[i]);
            button[i].setFont(font1);
            button[i].addMouseListener(this);
            button[i].addActionListener(this);
        }

        display.setFont(font);
        display.setEditable(false);
        display.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
        display.setPreferredSize(displayDimension);
        for (int i = 0; i < 14; i++)
            button[i].setPreferredSize(regularDimension);

        for (int i = 14; i < 18; i++)
            button[i].setPreferredSize(rColumnDimension);
        button[18].setPreferredSize(zeroButDimension);
        row[0].add(display);
        add(row[0]);
        for (int i = 0; i < 4; i++)
            row[1].add(button[i]);
        row[1].add(button[14]);
        add(row[1]);

        for (int i = 4; i < 8; i++)
            row[2].add(button[i]);
        row[2].add(button[15]);
        add(row[2]);

        for (int i = 8; i < 12; i++)
            row[3].add(button[i]);
        row[3].add(button[16]);
        add(row[3]);
        row[4].add(button[18]);

        for (int i = 12; i < 14; i++)
            row[4].add(button[i]);
        row[4].add(button[17]);
        add(row[4]);
        setVisible(true);
    }

    public void clear() {
        try {
            display.setText("");
            for (int i = 0; i < 4; i++)
                function[i] = false;
            for (int i = 0; i < 2; i++)
                temporary[i] = 0;
        }
        catch (NullPointerException e) {
        }
    }

    public void getSqrt() {
        try {
            double value = Math.sqrt(Double.parseDouble(display.getText()));
            display.setText(Double.toString(value));
        }
        catch (NumberFormatException e) {
        }
    }

    public void getPosNeg() {
        try {
            double value = Double.parseDouble(display.getText());
            if (value != 0) {
                value = value * (-1);
                display.setText(Double.toString(value));
            }
            else {
            }
        }
        catch (NumberFormatException e) {
        }
    }

    public void getResult() {
        double result = 0;
        temporary[1] = Double.parseDouble(display.getText());
        String temp0 = Double.toString(temporary[0]);
        String temp1 = Double.toString(temporary[1]);
        try {
            if (temp0.contains("-")) {
                String[] temp00 = temp0.split("-", 2);
                temporary[0] = (Double.parseDouble(temp00[1]) * -1);
            }
            if (temp1.contains("-")) {
                String[] temp11 = temp1.split("-", 2);
                temporary[1] = (Double.parseDouble(temp11[1]) * -1);
            }
        }
        catch (ArrayIndexOutOfBoundsException e) {
        }
        try {
            if (function[2] == true)
                result = temporary[0] * temporary[1];
            else if (function[3] == true)
                result = temporary[0] / temporary[1];
            else if (function[0] == true)
                result = temporary[0] + temporary[1];
            else if (function[1] == true) result = temporary[0] - temporary[1];
            display.setText(Double.toString(result));
            for (int i = 0; i < 4; i++)
                function[i] = false;
        }
        catch (NumberFormatException e) {
        }
    }

    public final void setDesign() {
        try {
            UIManager.setLookAndFeel("com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");
        }
        catch (Exception e) {
        }
        
    }

    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == button[0]) display.append("7");
        if (ae.getSource() == button[1]) display.append("8");
        if (ae.getSource() == button[2]) display.append("9");
        if (ae.getSource() == button[3]) {
            // add function[0]
            temporary[0] = Double.parseDouble(display.getText());
            function[0] = true;
            display.setText("");
        }
        if (ae.getSource() == button[4]) display.append("4");
        if (ae.getSource() == button[5]) display.append("5");
        if (ae.getSource() == button[6]) display.append("6");
        if (ae.getSource() == button[7]) {
            // subtract function[1]
            temporary[0] = Double.parseDouble(display.getText());
            function[1] = true;
            display.setText("");
        }
        if (ae.getSource() == button[8]) display.append("1");
        if (ae.getSource() == button[9]) display.append("2");
        if (ae.getSource() == button[10]) display.append("3");
        if (ae.getSource() == button[11]) {
            // multiply function[2]
            temporary[0] = Double.parseDouble(display.getText());
            function[2] = true;
            display.setText("");
        }
        if (ae.getSource() == button[12]) display.append(".");
        if (ae.getSource() == button[13]) {
            // divide function[3]
            temporary[0] = Double.parseDouble(display.getText());
            function[3] = true;
            display.setText("");
        }
        if (ae.getSource() == button[14]) clear();
        if (ae.getSource() == button[15]) getSqrt();
        if (ae.getSource() == button[16]) getPosNeg();
        if (ae.getSource() == button[17]) getResult();
        if (ae.getSource() == button[18]) display.append("0");
    }

    public static void main(String[] arguments) {
        CalculatorSwing c = new CalculatorSwing();
    }

    public void mouseClicked(MouseEvent e) {
        
    }

    public void mousePressed(MouseEvent me) {
        for (int i = 0; i < 19; i++) {
            if (me.getSource() == button[i]) {
            }
        }
    }

    public void mouseReleased(MouseEvent e) {
        
    }
    public void mouseEntered(MouseEvent me) {
        for (int i = 0; i < 19; i++) {
        if (me.getSource() == button[i]) 
            button[i].setFont(font);
            button[i].setToolTipText(" " + button[i].getText() + " ");
            }
    }

    public void mouseExited(MouseEvent me) {
        for (int i = 0; i < 19; i++) {
            if (me.getSource() == button[i]) 
                button[i].setFont(font1 );
            }
    }

}
