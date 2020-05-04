package view;

import javafx.scene.control.Label;

public class BmiResult extends Label {

    private static Label gewicht;

    private BmiResult(){
        gewicht = this;
    }

    public static Label getInstance(){
        if(gewicht == null){
            gewicht = new BmiResult();
        }
        return gewicht;
    }
}
