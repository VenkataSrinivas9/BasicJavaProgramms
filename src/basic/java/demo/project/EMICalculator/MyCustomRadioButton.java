package basic.java.demo.project.EMICalculator;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.BufferedImage;

import javax.imageio.ImageIO;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JRadioButton;

public class MyCustomRadioButton extends JRadioButton {

    public MyCustomRadioButton(String text, boolean selected) {
        super(text, selected);
        ImageIcon icon1 = new ImageIcon("C:\\Users\\Venkata Srinivas\\Desktop\\EMI\\radio-button-off-icon.png"); 
        Image img1 = icon1.getImage(); 
        BufferedImage bi1 = new BufferedImage(img1.getWidth(null), img1.getHeight(null), BufferedImage.TYPE_INT_ARGB); 
        Graphics g1 = bi1.createGraphics(); 
        g1.drawImage(img1, 15, 8, 17, 17, null); 
        ImageIcon iconImgIcon = new ImageIcon(bi1);
        
        ImageIcon icon2 = new ImageIcon("C:\\Users\\Venkata Srinivas\\Desktop\\EMI\\radio-button-on-icon.png"); 
        Image img2 = icon2.getImage(); 
        BufferedImage bi2 = new BufferedImage(img2.getWidth(null), img2.getHeight(null), BufferedImage.TYPE_INT_ARGB); 
        Graphics g2 = bi2.createGraphics(); 
        g2.drawImage(img2, 15, 8, 17, 17, null); 
        ImageIcon pressedIcon = new ImageIcon(bi2);
        
        ImageIcon icon3 = new ImageIcon("C:\\Users\\Venkata Srinivas\\Desktop\\EMI\\radio-button-off-rollover-icon.png"); 
        Image img3 = icon3.getImage(); 
        BufferedImage bi3 = new BufferedImage(img3.getWidth(null), img3.getHeight(null), BufferedImage.TYPE_INT_ARGB); 
        Graphics g3 = bi3.createGraphics(); 
        g3.drawImage(img3, 15, 8, 17, 17, null); 
        ImageIcon rolloverIcon = new ImageIcon(bi3);
        
        ImageIcon icon4 = new ImageIcon("C:\\Users\\Venkata Srinivas\\Desktop\\EMI\\radio-button-on-rollover-icon.png"); 
        Image img4 = icon4.getImage(); 
        BufferedImage bi4 = new BufferedImage(img4.getWidth(null), img4.getHeight(null), BufferedImage.TYPE_INT_ARGB); 
        Graphics g4 = bi4.createGraphics(); 
        g4.drawImage(img4, 15, 8, 17, 17, null); 
        ImageIcon rolloverSelectedIcon = new ImageIcon(bi4);
        
        setIcon(iconImgIcon);
        setRolloverIcon(rolloverIcon);
        setPressedIcon(pressedIcon);
//        setDisabledIcon(disabledIcon);
        setRolloverSelectedIcon(rolloverSelectedIcon);
        setSelectedIcon(pressedIcon);
        

    }
}