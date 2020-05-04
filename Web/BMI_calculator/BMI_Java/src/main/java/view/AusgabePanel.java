package view;

import javax.swing.*;
import java.awt.*;

public class AusgabePanel extends JPanel{

    private JLabel result;
    private JLabel bmiValue;

    private static JPanel ausgabePanel;

    private AusgabePanel(){
        ausgabePanel = this;
        JLabel bmi = new JLabel("BMI:");
        JLabel bmiText = new JLabel("Ihr BMI ist: ");
        result = BmiResult.getInstance();
        bmiValue = BmiDescription.getInstance();

        this.setLayout(new GridLayout(2,2));
        this.add(bmi);
        this.add(result);
        this.add(bmiText);
        this.add(bmiValue);

    }
    //Design Pattern Singleton
    public static JPanel getInstance(){
        if(ausgabePanel == null){
            ausgabePanel = new AusgabePanel();
        }
        return ausgabePanel;
    }

    public void setResult(String result) {
        this.result.setText(result);
    }

    public void setBmiValue(String bmiValue) {
        this.bmiValue.setText(bmiValue);
    }
}
