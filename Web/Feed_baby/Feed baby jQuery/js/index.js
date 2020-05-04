"use strict";

jQuery(document).ready(function($){
    let weightValue = $("#weight");
    let drunk1 = $("#meal1");
    let drunk2 = $("#meal2");
    let drunk3 = $("#meal3");
    let drunk4 = $("#meal4");
    let drunk5 = $("#meal5");
    let drunk6 = $("#meal6");
    let drunk7 = $("#meal7");
    let drunk8 = $("#meal8");
    
    let goal = $("#goal");
    let sendResult = $("#result");

    //Methode
    let calculateFunction = function(){
        let weightData = parseInt(weightValue.val());
        let value1 = parseInt(drunk1.val());
        let value2 = parseInt(drunk2.val());
        let value3 = parseInt(drunk3.val());
        let value4 = parseInt(drunk4.val());
        let value5 = parseInt(drunk5.val());
        let value6 = parseInt(drunk6.val());
        let value7 = parseInt(drunk7.val());
        let value8 = parseInt(drunk8.val());
        
        let aim = $("#aim");
        aim.css("display", "none");

        if(!Number.isNaN(weightData)){
            
            let babyData = weightData /6;
            goal.text(babyData.toFixed(0));
            
            aim.css("display", "block");

            if(!Number.isNaN(value1) && !Number.isNaN(value2) 
            && !Number.isNaN(value3) && !Number.isNaN(value4) 
            && !Number.isNaN(value5)  && !Number.isNaN(value5)  
            && !Number.isNaN(value6) && !Number.isNaN(value7) 
            && !Number.isNaN(value8)){

            
            let result = (value1 + value2 + value3 + value4 + value5 + value6 + value7 + value8) ;
            if(result < babyData){
                sendResult.text("Your baby has been drinking less than 1/6. " + "Only: " + result);
            }else if(result > babyData){
                sendResult.text("Congratulate your baby has drunk more than 1/6. "  + result);
            }
        
        
        } else{
            $("#result").text("Please enter data.");
        }

        }
        
    }

    //Aktion bei Eingabe
    weightValue.change(calculateFunction);
    drunk1.change(calculateFunction);
    drunk2.change(calculateFunction);
    drunk3.change(calculateFunction);
    drunk4.change(calculateFunction);
    drunk5.change(calculateFunction);
    drunk6.change(calculateFunction);
    drunk7.change(calculateFunction);
    drunk8.change(calculateFunction);

    //Aktion bei Eingabe
    weightValue.keyup(calculateFunction);
    drunk1.keyup(calculateFunction);
    drunk2.keyup(calculateFunction);
    drunk3.keyup(calculateFunction);
    drunk4.keyup(calculateFunction);
    drunk5.keyup(calculateFunction);
    drunk6.keyup(calculateFunction);
    drunk7.keyup(calculateFunction);
    drunk8.keyup(calculateFunction);

});