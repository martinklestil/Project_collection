package controll;

import javafx.scene.control.Label;
import model.BmiBerechnen;
import view.BmiDescriLabel;
import view.BmiResult;

/**
 * This class controls the entries and delivers the BMI calculation.
 * @author Martin Klestil
 *
 */
public class Auswertung {
    private Double height;
    private Double weight;

    public Auswertung(String valueBody, String valueSize){
        Label bmiLabel = BmiResult.getInstance();
        Label bmiDescriLabel = BmiDescriLabel.getInstance();

        if(!valueBody.equals(null) && !valueSize.equals(null)
            && !valueBody.equals("") && !valueSize.equals("")){

            System.out.println(valueBody);

            //Achtung Double wird benötigt für z.B.: 1.80
            height = Double.parseDouble(valueBody);
            weight = Double.parseDouble(valueSize);

            BmiBerechnen bmi = new BmiBerechnen(height, weight);

            int bmiValue = bmi.getBmi();
            String bmiDescription = bmi.getBmiDescription();

            //Ausgabe
            bmiLabel.setText(String.valueOf(bmi.getBmi()));
            bmiDescriLabel.setText(bmi.getBmiDescription());
        }else{
            //Ausgabe
            bmiLabel.setText("Bitte Werte eingeben!");
            bmiDescriLabel.setText("Bitte Werte eingeben!");
        }

    }
}
