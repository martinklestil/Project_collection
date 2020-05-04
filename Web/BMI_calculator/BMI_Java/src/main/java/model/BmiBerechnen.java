package model;

/**
 * This class provides the logic to calculate the BMI.
 * @author Martin Klestil
 *
 */
public class BmiBerechnen {

    private double bmi = 0;
    private String bmiDescription = "";

    public BmiBerechnen(double valueBody, double valueSize){
        double height = valueBody;
        double weight = valueSize;

        //Berechnen Formel: bmi = körpermasse / (körperhöhe in meter) ^ 2
        System.out.println("Größe: "+ height + " Gewicht: " + weight);
        double temp = (height * height);

        bmi = weight / temp;
        System.out.println("Bmi ist: " + bmi);

        if(bmi < 18.6){
            bmiDescription = "Unter Normalgewicht!";
        }else if (bmi > 18.5 && bmi < 25) {
            bmiDescription = "Normalgewicht!";
        }else if (bmi > 25) {
            bmiDescription = "Ueber Normalgewicht!";
        }
    }


    public int getBmi() {
        return (int) bmi;
    }

    public String getBmiDescription() {
        return bmiDescription;
    }
}
