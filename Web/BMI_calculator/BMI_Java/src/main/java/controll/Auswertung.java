package controll;

import model.BmiBerechnen;
import view.BmiDescription;
import view.BmiResult;

import javax.swing.*;

/**
 * This class controls the entries and delivers the BMI calculation.
 * @author Martin Klestil
 *
 */
public class Auswertung {
    private Double height;
    private Double weight;

    public Auswertung(String valueBody, String valueSize){
        if(!valueBody.equals(null) && !valueSize.equals(null)){

            //Achtung Double wird benötigt für z.B.: 1.80
            height = Double.parseDouble(valueBody);
            weight = Double.parseDouble(valueSize);

            BmiBerechnen bmi = new BmiBerechnen(height, weight);

            int bmiValue = bmi.getBmi();
            String bmiDescription = bmi.getBmiDescription();

            JLabel bmiLabel = BmiResult.getInstance();
            bmiLabel.setText(String.valueOf(bmi.getBmi()));

            JLabel bmiDescriLabel = BmiDescription.getInstance();
            bmiDescriLabel.setText(bmi.getBmiDescription());
        }

    }
}
