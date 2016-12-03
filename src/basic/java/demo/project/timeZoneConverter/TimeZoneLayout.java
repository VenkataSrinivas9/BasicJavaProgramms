// Code is not Completed
package basic.java.demo.project.timeZoneConverter;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

import javax.swing.ButtonGroup;
import javax.swing.ComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JSpinner;
import javax.swing.JTextArea;
import javax.swing.SpinnerDateModel;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

import basic.java.demo.project.EMICalculator.MyCustomButton;
import basic.java.demo.project.EMICalculator.MyCustomRadioButton;

public class TimeZoneLayout implements ActionListener {
    
    JFrame timeZoneFrame = new JFrame();
    JLabel l1, l2, l3, l4, l5, l6;
    MyCustomRadioButton mcrbtn1, mcrbtn2, mcrbtn3, mcrbtn4;
    Calendar localCalendar = Calendar.getInstance(TimeZone.getDefault());
    Date date = localCalendar.getTime();
    SpinnerDateModel sdm = new SpinnerDateModel(date, null, null, Calendar.HOUR_OF_DAY);
    JSpinner jSpinner1 = new JSpinner(sdm);
    JSpinner.DateEditor de = new JSpinner.DateEditor(jSpinner1, "EEE, dd MMM yyyy HH:mm:ss"); // E, dd MMM yyyy HH:mm:ss zzz
    TimeZoneList myTimeZone;
    JComboBox<String> cb1, cb2;
    MyCustomButton mcbtn1, mcbtn2;

//    Date datenow = 
//    SpinnerDateModel smb = new SpinnerDateModel(datenow, null, null, Calendar.HOUR_OF_DAY);
//    SPIN_DATE.setModel(smb);
//    JSpinner.DateEditor d = new JSpinner.DateEditor(SPIN_DATE, "dd-MMM-yyyy");
//    SPIN_DATE.setEditor(d);
    
    int frameWidth = 700;
    int frameHeight = 470;
    int x = 30;
    int y = 70;
    int w = 100;
    int h = 30;
    
    public TimeZoneLayout() {

        timeZoneFrame.setSize(frameWidth, frameHeight);
        timeZoneFrame.setLayout(null);
        timeZoneFrame.setResizable(false);
        timeZoneFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        timeZoneFrame.setTitle("Time Zone Converter");
        timeZoneFrame.setLocationRelativeTo(null);
        timeZoneFrame.getContentPane().setBackground(Color.WHITE);
        
        l1 = new JLabel("Time Zone Converter: ");
        l1.setForeground(new Color(51, 102, 0));
        l1.setFont(new Font("DejaVu Serif", Font.BOLD, 20));
        
        l2 = new JLabel("Local Date Time: ");
        l3 = new JLabel("Local Time Zone: ");
        mcrbtn1 = new MyCustomRadioButton("Current Local Date Time: ", true);
        mcrbtn2 = new MyCustomRadioButton("Custom Local Date Time: ", false);
        ButtonGroup dateTimeGroup = new ButtonGroup();
        dateTimeGroup.add(mcrbtn1);
        dateTimeGroup.add(mcrbtn2);
        jSpinner1.setEditor(de);
        mcrbtn3 = new MyCustomRadioButton("Current Local Time Zone: ", true);
        mcrbtn4 = new MyCustomRadioButton("Custom Local Time Zone: ", false);
        ButtonGroup timeZoneGroup = new ButtonGroup();
        timeZoneGroup.add(mcrbtn3);
        timeZoneGroup.add(mcrbtn4);
        myTimeZone = new TimeZoneList();
        String[] zones = myTimeZone.TimeZoneList().toArray(new String[myTimeZone.TimeZoneList().size()]);
        cb1 = new JComboBox<String>(zones);
        String timeZone = localCalendar.getTimeZone().getID();
        for (String zone : myTimeZone.TimeZoneList()) {
            if(zone.contains(timeZone)){
                cb1.setSelectedItem(zone);
          }
        }
        String presentDate = jSpinner1.getValue().toString();
        
        l4 = new JLabel("Time Zone: ");
        cb2 = new JComboBox<String>(zones);
        
        l5 = new JLabel("Date Time: ");
        l6 = new JLabel("");
        
        mcbtn1 = new MyCustomButton("Convert Time");
        mcbtn2 = new MyCustomButton("Clear Time");
        
        l1.setBounds(200, 25, 300, 30);
        l2.setBounds(x, y, w, h);
        mcrbtn1.setBounds(x+w, y, w+w, h);
        mcrbtn2.setBounds(x+w, y+h, w+w, h);
        mcrbtn1.setBackground(Color.WHITE);
        mcrbtn2.setBackground(Color.WHITE);
        jSpinner1.setBounds(x+w+w+w, y+6, w+w, h);
        
        l3.setBounds(x, y+h+h+10, w, h);
        mcrbtn3.setBounds(x+w, y+h+h+10, w+w, h);
        mcrbtn4.setBounds(x+w, y+h+h+h+10, w+w, h);
        mcrbtn3.setBackground(Color.WHITE);
        mcrbtn4.setBackground(Color.WHITE);
        cb1.setBounds(x+w+w+w, y+h+h+10+6, w+w+w+20, h);
        
        l4.setBounds(x, y+h+h+h+20+h, w, h);
        cb2.setBounds(x+w+w+w, y+h+h+h+20+h, w+w+w+20, h);
        
        l5.setBounds(x, y+h+h+h+30+h+h, w, h);
        l6.setBounds(x+w+w+w, y+h+h+h+30+h+h, w+w+w+20, h);
        
        mcbtn1.setBounds(x+w+w+w, y+h+h+h+40+h+h+h+h, w+h, h);
        mcbtn2.setBounds(x+w+w+w+w+h+h, y+h+h+h+40+h+h+h+h, w+h, h);
        
        cb1.addActionListener(this);
        mcbtn1.addActionListener(this);
        mcbtn2.addActionListener(this);
            
        timeZoneFrame.add(l1);
        timeZoneFrame.add(l2);
//        timeZoneFrame.add(mcrbtn1);
//        timeZoneFrame.add(mcrbtn2);
        timeZoneFrame.add(jSpinner1);
        timeZoneFrame.add(l3);
//        timeZoneFrame.add(mcrbtn3);
//        timeZoneFrame.add(mcrbtn4);
        timeZoneFrame.add(cb1);
        timeZoneFrame.add(l4);
        timeZoneFrame.add(cb2);
        timeZoneFrame.add(l5);
        timeZoneFrame.add(l6);
        timeZoneFrame.add(mcbtn1);
        timeZoneFrame.add(mcbtn2);
        timeZoneFrame.setVisible(true);
    }
    
    public static void main(String[] args) {
        new TimeZoneLayout();
    }

    public void actionPerformed(ActionEvent e) {
        String[] value;
        Date dateTime;
        TimeZone timeZone;
        try {
            if(e.getSource() == cb1){
                value = cb1.getSelectedItem().toString().split(" ");
                String strLocalTimeZone = value[1];
                dateTime = (Date) jSpinner1.getValue();
                timeZone = TimeZone.getTimeZone(strLocalTimeZone);
                DateFormat dateConverter = new SimpleDateFormat("EEE, dd MMM yyyy HH:mm:ss z");
                dateConverter.setTimeZone(TimeZone.getTimeZone(timeZone.getID()));
                System.out.println(dateConverter.format(date));
                SimpleDateFormat simpleDateFormat = new SimpleDateFormat("EEE, dd MMM yyyy HH:mm:ss");
                Date date1 = null;
                try {
                    date1 = simpleDateFormat.parse(dateConverter.format(date));
                } catch (ParseException e1) {
                    e1.printStackTrace();
                }
                System.out.println("date : " + simpleDateFormat.format(date1));
                jSpinner1.setValue(date1);
            } else if(e.getSource() == mcbtn1){
                String[] value2 = cb2.getSelectedItem().toString().split(" ");
                String strTimeZone = value2[1];
                dateTime = (Date) jSpinner1.getValue();
                timeZone = TimeZone.getTimeZone(strTimeZone);
                System.out.println(timeZone.getDefault());
                String strDateTime = (String) jSpinner1.getValue();
                String sourceSDFformatter = "EEE, dd MMM yyyy HH:mm:ss z";
                String destSDFformatter = "EEE, dd MMM yyyy HH:mm:ss z";

                SimpleDateFormat sourceSDF = new SimpleDateFormat(sourceSDFformatter, Locale.US);
                SimpleDateFormat destSDF = new SimpleDateFormat(destSDFformatter, Locale.UK);

                TimeZone sourceTZ = TimeZone.getTimeZone("America/Los_Angeles");
                TimeZone destTZ = TimeZone.getTimeZone("GMT");

                sourceSDF.setTimeZone(sourceTZ);
                destSDF.setTimeZone(destTZ);

                Date myDate = sourceSDF.parse(strDateTime);
                
                DateFormat dateConverter = new SimpleDateFormat("EEE, dd MMM yyyy HH:mm:ss z");
                dateConverter.setTimeZone(TimeZone.getTimeZone(timeZone.getID()));
                System.out.println( dateConverter.format(date));
                l6.setText(dateConverter.format(date));
            } else {
                
            }

        } catch (Exception e2) {
            // TODO: handle exception
        }
    }

}
