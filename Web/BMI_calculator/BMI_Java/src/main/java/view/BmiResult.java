package view;

import javax.swing.*;

public class BmiResult extends JLabel {

    private static JLabel gewicht;

    private BmiResult(){
        gewicht = this;
    }

    public static JLabel getInstance(){
        if(gewicht == null){
            gewicht = new BmiResult();
        }
        return gewicht;
    }
}
