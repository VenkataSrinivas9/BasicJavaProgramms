package basic.java.demo.project.MyExpensesApp;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.JTextField;
import javax.swing.RootPaneContainer;
import javax.swing.UIManager;

import basic.java.demo.project.EMICalculator.CustomTabbedPaneUI;

public class ExpensesWithGrid extends JFrame{

    JTabbedPane jtp1;
    JPanel jp1, jp2, jp3;
    JLabel l1, l2, l3, emptyLable;
    JLabel jp1l1, jp1l2;
    JTextField jp1tf1, jp1tf2;
    JButton jp1btn1, jp1btn2;

    ExpensesWithGrid() {

        setSize(580, 470); // Frame size
//        setLayout(null); // Frame layout
//        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("My Expenses");
        setLocationRelativeTo(null); // Center the Form on the Desktop
        jtp1 = new JTabbedPane();
        jtp1.setUI(new CustomTabbedPaneUI());
        getContentPane().add(jtp1);

        jp1 = new JPanel(new GridLayout(5, 2 , 10, 10));
        jp2 = new JPanel();
        jp3 = new JPanel();

        l1 = new JLabel("Dialy Expenses:", 0);
        emptyLable = new JLabel();
        l1.setForeground(Color.BLUE);
        l1.setFont(new Font("DejaVu Serif", Font.BOLD, 20));
        jp1l1 = new JLabel("Expense Name:", 0);
        jp1l2 = new JLabel("Expense Amount:", 0);
        jp1tf1 = new JTextField();
        jp1tf2 = new JTextField();
        jp1btn1 = new JButton("Add");
        jp1btn2 = new JButton("Delete");
        
        jp1tf1.setPreferredSize(new Dimension(150,20));
//        Dimension jTextFieldDimension = new Dimension(5,5);
//        jp1tf1.setPreferredSize(jTextFieldDimension);
//        jp1tf1.setMinimumSize(jTextFieldDimension);
//        jp1tf1.setMaximumSize(jTextFieldDimension);
//        Dimension jButtonDimension = new Dimension(100, 100);
        
        l2 = new JLabel("Monthly Expenses:");
        l2.setForeground(Color.BLUE);
        l2.setFont(new Font("DejaVu Serif", Font.BOLD, 20));
        l2.setBounds(50, 30, 400, 30);

        l3 = new JLabel("Yearly Expenses:");
        l3.setForeground(Color.BLUE);
        l3.setFont(new Font("DejaVu Serif", Font.BOLD, 20));
        l3.setBounds(50, 30, 400, 30);

        jp1.add(l1);
        jp1.add(emptyLable);
        jp1.add(jp1l1);
        jp1.add(jp1tf1);
        jp1.add(jp1l2);
        jp1.add(jp1tf2);
        jp1.add(jp1btn1);
        jp1.add(jp1btn2);
        jp2.add(l2);
        jp3.add(l3);
        jtp1.addTab("Dialy Expenses", jp1);
        jtp1.addTab("Monthly Expenses", jp2);
        jtp1.addTab("Yearly Expenses", jp3);

        setVisible(true);
    }

    public static void main(String args[]) {
        new ExpensesWithGrid();
    }
}
