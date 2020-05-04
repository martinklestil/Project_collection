package view;

import javax.swing.*;

public class BmiDescription extends JLabel {

    private static JLabel bmiDescription;

    private BmiDescription(){
        bmiDescription = this;
    }

    public static JLabel getInstance(){
        if(bmiDescription == null){
            bmiDescription = new BmiDescription();
        }
        return bmiDescription;
    }
}
