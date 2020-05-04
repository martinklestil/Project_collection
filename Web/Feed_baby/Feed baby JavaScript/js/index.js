"use strict";

window.addEventListener("load", function(){
    let weightValue = document.getElementById("weight");
    let drunk1 = document.getElementById("meal1");
    let drunk2 = document.getElementById("meal2");
    let drunk3 = document.getElementById("meal3");
    let drunk4 = document.getElementById("meal4");
    let drunk5 = document.getElementById("meal5");
    let drunk6 = document.getElementById("meal6");
    let drunk7 = document.getElementById("meal7");
    let drunk8 = document.getElementById("meal8");
    
    let goal = document.getElementById("goal");

    //Methode
    let calculateFunction = function(){
        let weightData = parseInt(weightValue.value);
        let value1 = parseInt(drunk1.value);
        let value2 = parseInt(drunk2.value);
        let value3 = parseInt(drunk3.value);
        let value4 = parseInt(drunk4.value);
        let value5 = parseInt(drunk5.value);
        let value6 = parseInt(drunk6.value);
        let value7 = parseInt(drunk7.value);
        let value8 = parseInt(drunk8.value);

        let aim = document.getElementById("aim");
        aim.style.display ="none";

        if(!Number.isNaN(weightData)){
            
            let babyData = weightData /6;
            goal.innerText = babyData.toFixed(0);
            
            aim.style.display ="block";

            if(!Number.isNaN(value1) && !Number.isNaN(value2) 
            && !Number.isNaN(value3) && !Number.isNaN(value4) 
            && !Number.isNaN(value5)  && !Number.isNaN(value5)  
            && !Number.isNaN(value6) && !Number.isNaN(value7) 
            && !Number.isNaN(value8)){

            
            let result = (value1 + value2 + value3 + value4 + value5 + value6 + value7 + value8) ;
            if(result < babyData){
                let sendResult = document.getElementById("result");
                sendResult.innerText = "Your baby has been drinking less than 1/6. " + "Only: " + result;
            }else if(result > babyData){
                let sendResult = document.getElementById("result");
                sendResult.innerText = "Congratulate your baby has drunk more than 1/6. "  + result;
            }
        
        
        } else{
            let sendResult = document.getElementById("result");
            sendResult.innerText = "Please enter data.";
        }

        }
        
    }

    //Aktion bei Eingabe
    weightValue.addEventListener("change", calculateFunction);
    drunk1.addEventListener("change", calculateFunction);
    drunk2.addEventListener("change", calculateFunction);
    drunk3.addEventListener("change", calculateFunction);
    drunk4.addEventListener("change", calculateFunction);
    drunk5.addEventListener("change", calculateFunction);
    drunk6.addEventListener("change", calculateFunction);
    drunk7.addEventListener("change", calculateFunction);
    drunk8.addEventListener("change", calculateFunction);

    //Aktion bei Eingabe
    weightValue.addEventListener("keyup", calculateFunction);
    drunk1.addEventListener("keyup", calculateFunction);
    drunk2.addEventListener("keyup", calculateFunction);
    drunk3.addEventListener("keyup", calculateFunction);
    drunk4.addEventListener("keyup", calculateFunction);
    drunk5.addEventListener("keyup", calculateFunction);
    drunk6.addEventListener("keyup", calculateFunction);
    drunk7.addEventListener("keyup", calculateFunction);
    drunk8.addEventListener("keyup", calculateFunction);

});