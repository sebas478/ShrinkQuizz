package com.phoenix.sebas.shrinkquizz.Data;

/**
 * Created by sebas on 19-04-2017.
 */

public class PartyResult extends PartyAnswer {
    public PartyResult(String answer) {
        super(answer);
    }

    public String score(){
        return procesisng();
    }

    private String procesisng(){
        String answer = getAnswer();
        if (answer.contains("5")){
            return "Eres un bebe";
        } else if (answer.contains("10")){
            return "Bien campeon";
        } else {
            return "Busca ayuda";

        }
    }
}
