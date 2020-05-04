"use strict";

jQuery(document).ready(function($){
    let weightValue = $("#weight");
    let goal = $("#goal");
    let sendResult = $("#result");
    

    //Methode
    let calculateFunction = function(){
        let result = 0;
        
        $('input[name="meal"]').each(function(i, elem){
            let temp = ($(elem).val());
            if(!Number.isNaN(temp)){
                let value = parseInt(temp)
                console.log("result: " + result + " vale: " + value);
                result = result + value;
            }
            
        })

        let weightData = parseInt(weightValue.val());
        
        let aim = $("#aim");
        aim.css("display", "none");

        if(!Number.isNaN(weightData)){
            
            let babyData = weightData /6;
            goal.text(babyData.toFixed(0));
            
            aim.css("display", "block");

            if(!Number.isNaN(result)){          
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

    //Add Function
    $(document).on('click', '.add', function(){
        let label = '<td><label id="drunk">Drunk:</label></td>';
        let input = '<td><input type="number" class="meal" name="meal" step="1" min="0" max="1000" placeholder="150"/>ml</td>';
        let addB = '<td><button type="button" class="add"><img src="./webimages/plus.png" /></button></td>';
        let removB = '<td><button type="button" class="remove"><img src="./webimages/minus.png" /></button></td>';
        let html = '<tr>' + label + input + addB + removB + '</tr>';
        $('tbody').append(html);
    })
    
    //Remove Function
    $(document).on('click', '.remove', function(){
        $(this).parents('tr').remove();
        calculateFunction();
    })

    //Aktion bei Eingabe
    weightValue.change(calculateFunction);
    $(document).on('change', '.meal', calculateFunction);

    //Aktion bei Eingabe
    weightValue.keyup(calculateFunction);
    $(document).on('keyup', '.meal', calculateFunction);

});