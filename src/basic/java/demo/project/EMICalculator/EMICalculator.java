package basic.java.demo.project.EMICalculator;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

/**
 * EMI = [P x R x (1+R)^N]/[(1+R)^N-1] where P stands for the loan amount or
 * principal, R is the interest rate per month [if the interest rate per annum
 * is x%, then the rate of interest will be x/(12 x 100)], and N is the number
 * of monthly installments. When you use the above formula, you will get the
 * same result that you will get in the Excel spreadsheet.
 */
public class EMICalculator extends JFrame implements ActionListener {

    JLabel l1, l2, l3, l4, l5, l6, l7, l8, l9, l10, l11, l12, l13, l14;
    JTextField tf2, tf3, tf4;
//    JButton btn1, btn2;
    MyCustomButton mcbtn1, mcbtn2;
    MyCustomRadioButton mcrbtn1, mcrbtn2, mcrbtn3, mcrbtn4;
//    JRadioButton rbtn1, rbtn2;
//    JRadioButton rbtn3, rbtn4;
    // JPasswordField p1, p2;

    EMICalculator() {

        
        setIconImage(image().getImage());
        setSize(580, 470); // Frame size
        setLayout(null); // Frame layout
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("EMI Calculator");
        setLocationRelativeTo(null); // Center the Form on the Desktop
        getContentPane().setBackground(Color.WHITE); // Background color to the panel

        l1 = new JLabel("EMI Calculator :");
        l1.setForeground(new Color(51, 102, 0));
        l1.setFont(new Font("DejaVu Serif", Font.BOLD, 20));

        l2 = new JLabel("Principal ( P ) : ");
        l3 = new JLabel("Interest Rate ( R ) : ");
        l4 = new JLabel("No. of installments ( N ) : ");
        l5 = new JLabel("EMI : ");
        l6 = new JLabel("  % ");
//        Font font = l6.getFont();
        Font boldFont = new Font("DejaVu Serif", Font.BOLD, 15);
        l6.setFont(boldFont);
        l7 = new JLabel(" Rs : ");
        l8 = new JLabel("Total interest payable : ");
        l9 = new JLabel("Total amount payable ( includes  interest ): ");
        l10 = new JLabel("   0   ");
        l11 = new JLabel("   0   ");
        l12 = new JLabel("   0   ");
        l13 = new JLabel(" Rs : ");
        l14 = new JLabel(" Rs : ");
        

        tf2 = new JTextField();
        tf3 = new JTextField();
        tf4 = new JTextField();
        

//        rbtn1 = new JRadioButton("Monthly interest : ", false);
//        rbtn2 = new JRadioButton("Annual interest : ", true);
//        ButtonGroup interestGroup = new ButtonGroup(); // Group the radio buttons
//        interestGroup.add(rbtn1);
//        interestGroup.add(rbtn2);
        
        mcrbtn1 = new MyCustomRadioButton("Monthly interest : ", false);
        mcrbtn2 = new MyCustomRadioButton("Annual interest : ", true);
        ButtonGroup customInterestGroup = new ButtonGroup(); // Group the radio buttons
        customInterestGroup.add(mcrbtn1);
        customInterestGroup.add(mcrbtn2);
        mcrbtn3 = new MyCustomRadioButton("Period in months : ", true);
        mcrbtn4 = new MyCustomRadioButton("Period in years : ", false);
        ButtonGroup customPeriodGroup = new ButtonGroup(); // Group the radio buttons
        customPeriodGroup.add(mcrbtn3);
        customPeriodGroup.add(mcrbtn4);
        mcrbtn1.setBounds(160, 110, 150, 25);
        mcrbtn2.setBounds(160, 135, 150, 25);
        mcrbtn3.setBounds(160, 175, 150, 25);
        mcrbtn4.setBounds(160, 200, 150, 25);
        mcrbtn1.setBackground(Color.WHITE);
        mcrbtn2.setBackground(Color.WHITE);
        mcrbtn3.setBackground(Color.WHITE);
        mcrbtn4.setBackground(Color.WHITE);
        
        mcbtn1 = new MyCustomButton("Calculate");
        mcbtn2 = new MyCustomButton("Clear");
        mcbtn1.setPressedColor(Color.LIGHT_GRAY);
        mcbtn1.setRolloverColor(Color.WHITE);
        mcbtn1.setNormalColor(Color.WHITE);
        mcbtn2.setPressedColor(Color.LIGHT_GRAY);
        mcbtn2.setRolloverColor(Color.WHITE);
        mcbtn2.setNormalColor(Color.WHITE);
        mcbtn1.addActionListener(this);
        mcbtn2.addActionListener(this);
        
//        rbtn3 = new JRadioButton("Period in months : ", true);
//        rbtn4 = new JRadioButton("Period in years : ", false);
//        ButtonGroup periodGroup = new ButtonGroup();
//        periodGroup.add(rbtn3);
//        periodGroup.add(rbtn4);

//        btn1 = new JButton("Calculate");
//        btn2 = new JButton("Clear");
        
//        btn1.addActionListener(this);
//        btn2.addActionListener(this);
//        btn1.addMouseListener(this);
//        btn2.addMouseListener(this);

//        rbtn1.setBackground(Color.WHITE);
//        rbtn2.setBackground(Color.WHITE);
//        rbtn3.setBackground(Color.WHITE);
//        rbtn4.setBackground(Color.WHITE);
//        btn1.setBackground(Color.WHITE); // Background color to the button
//        btn2.setBackground(Color.WHITE);
//        Border blackline = BorderFactory.createLineBorder(Color.black);
        
        l1.setBounds(125, 25, 400, 30);
        l2.setBounds(30, 70, 150, 30);
        l3.setBounds(30, 110, 150, 30);
        l4.setBounds(30, 175, 150, 30);
        l5.setBounds(30, 240, 120, 30);
        l6.setBounds(480, 120, 50, 30);
        l7.setBounds(300, 240, 30, 30);
        l8.setBounds(30, 280, 150, 30);
        l9.setBounds(30, 320, 250, 30);
//        l9.setBorder(blackline);
//        l7.setBorder(blackline);

//        rbtn1.setBounds(180, 110, 130, 25);
//        rbtn2.setBounds(180, 135, 130, 25);
//
//        rbtn3.setBounds(180, 175, 130, 25);
//        rbtn4.setBounds(180, 200, 130, 25);

        tf2.setBounds(330, 70, 150, 30);
        tf3.setBounds(330, 120, 150, 30);
        tf4.setBounds(330, 185, 150, 30);
        l10.setBounds(330, 240, 150, 30);
        l11.setBounds(330, 280, 150, 30);
        l12.setBounds(330, 320, 150, 30);
        l13.setBounds(300, 280, 30, 30);
        l14.setBounds(300, 320, 30, 30);

//        btn1.setBounds(300, 380, 100, 30);
//        btn2.setBounds(430, 380, 100, 30);
        
        mcbtn1.setBounds(300, 380, 100, 30);
        mcbtn2.setBounds(430, 380, 100, 30);

        add(l1);
        add(l2);
        add(tf2);
        add(l3);
//        add(rbtn1);
//        add(rbtn2);
        add(mcrbtn1);
        add(mcrbtn2);
        add(tf3);
        add(l6);
        add(l4);
//        add(rbtn3);
//        add(rbtn4);
        add(mcrbtn3);
        add(mcrbtn4);
        add(tf4);
        add(l5);
        add(l7);
        add(l10);
        add(l8);
        add(l13);
        add(l11);
        add(l9);
        add(l14);
        add(l12);
//        add(btn1);
//        add(btn2);
        add(mcbtn1);
        add(mcbtn2);
        setVisible(true);
    }

    private ImageIcon image() {
        ImageIcon img = new ImageIcon("D:\\VenkataMedapati\\BasicJava_Demos\\src\\basic\\java\\demo\\project\\EMICalculator\\myEMI.png");
        img.setDescription("EMI");
        return img;
    }

    public void actionPerformed(ActionEvent e) {
        int principal;
        double interest;
        double interestRate;
        int installments;

        try {
//          if (e.getSource() == btn1) {
            if (e.getSource() == mcbtn1) {
                principal = Integer.parseInt(tf2.getText());

                interest = Double.parseDouble(tf3.getText());
                interestRate = interest / 100;
//                if (rbtn1.isSelected()) {
                if (mcrbtn1.isSelected()) {
                    interestRate = interestRate;
                }
//                else if (rbtn2.isSelected()) {
                if (mcrbtn2.isSelected()) {
                    interestRate = interestRate / 12;
                }

                installments = Integer.parseInt(tf4.getText());
//                if (rbtn3.isSelected()) {
                if (mcrbtn3.isSelected()) {
                    installments = installments;
                }
//                else if (rbtn4.isSelected()) {
                if (mcrbtn4.isSelected()) {
                    installments = installments * 12;
                }

                double emi = emiCalculation(principal, interestRate, installments);
                String calculatedEMI = Integer.toString((int) Math.floor(emi));
                l10.setText("   " + calculatedEMI);
                
                double totalAmount = emi * (double)installments;
                l12.setText("   " + Integer.toString((int) totalAmount));
                
                double totalInterest = totalAmount - (double) principal;
                l11.setText("   " + Integer.toString((int) totalInterest));
            }
            else {
                tf2.setText("");
                tf3.setText("");
                tf4.setText("");
                l10.setText("   0   ");
                l11.setText("   0   ");
                l12.setText("   0   ");
            }

        } catch (Exception e2) {
            // TODO: handle exception
        }

    }

    public double emiCalculation(int principal, double interest,
            int installments) {
        double rate = 1 + interest;
        double installmentNumerator = Math.pow(rate, installments);
        double installmentDenominator = installmentNumerator - 1;
        double result = (principal * interest) * (installmentNumerator / installmentDenominator);
        return result;
    }

    public static void main(String args[]) {
        new EMICalculator();
    }
}
