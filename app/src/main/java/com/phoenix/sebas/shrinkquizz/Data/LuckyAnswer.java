package com.phoenix.sebas.shrinkquizz.Data;


import android.support.v4.app.Fragment;

/**
 * A simple {@link Fragment} subclass.
 */
public class LuckyAnswer {
    private boolean happy, luckyDay;

    public LuckyAnswer(boolean happy) {
        this.happy = happy;
        luckyDay = new LuckyDate().day();

    }
    public boolean isHappy() { return happy; }

    public boolean isLuckyDay(){ return luckyDay; }


}
