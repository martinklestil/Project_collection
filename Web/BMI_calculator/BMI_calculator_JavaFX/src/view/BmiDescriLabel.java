package view;

import javafx.scene.control.Label;

public class BmiDescriLabel extends Label {

    private static Label bmiDescription;

    private BmiDescriLabel(){
        bmiDescription = this;
    }

    public static Label getInstance(){
        if(bmiDescription == null){
            bmiDescription = new BmiDescriLabel();
        }
        return bmiDescription;
    }
}
