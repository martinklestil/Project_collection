package at.klestil.funfacts;

import android.content.res.Resources;

import java.util.Random;

public class FactBook {


    // Mehtoids - Actions the object can take
    public String getFact(String[] facts){
        // Randomly select a fact
        Random randomGenerator = new Random();
        int randomNumber = randomGenerator.nextInt(facts.length);


        return facts[randomNumber];

    }
}
