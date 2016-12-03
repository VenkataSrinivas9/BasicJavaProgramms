package basic.java.demo.project.EMICalculator;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Time;

import javax.swing.JButton;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

public class MyCustomButton extends JButton {

    private Color pressedColor;
    private Color rolloverColor;
    private Color normalColor;
    private Color armedColor;
    private Color enabledColor;

    public Color getEnabledColor() {
        return enabledColor;
    }

    public void setEnabledColor(Color enabledColor) {
        this.enabledColor = enabledColor;
    }

    public Color getArmedColor() {
        return armedColor;
    }

    public void setArmedColor(Color armedColor) {
        this.armedColor = armedColor;
    }

    public Color getPressedColor() {
        return pressedColor;
    }

    public void setPressedColor(Color pressedColor) {
        this.pressedColor = pressedColor;
    }

    public Color getRolloverColor() {
        return rolloverColor;
    }

    public void setRolloverColor(Color rolloverColor) {
        this.rolloverColor = rolloverColor;
    }

    public Color getNormalColor() {
        return normalColor;
    }

    public void setNormalColor(Color normalColor) {
        this.normalColor = normalColor;
    }

    public MyCustomButton(String text) {
        super(text);
        setBorderPainted(true);
        setFocusPainted(false);

        setContentAreaFilled(false);
        setOpaque(true);

        setBackground(normalColor);
        // setForeground(Color.BLACK);
        setFont(new Font("Tahoma", Font.BOLD, 12));
        setText(text);
        
        addChangeListener(new ChangeListener() {
            public void stateChanged(ChangeEvent evt) {
                if (getModel().isPressed()) {
                    setBackground(pressedColor);
                } else if (getModel().isRollover()) {
                    setBackground(rolloverColor);
                } else {
                    setBackground(normalColor);
                }
            }
        });
    }
}