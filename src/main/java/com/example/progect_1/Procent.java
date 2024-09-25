package com.example.progect_1;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class Procent {
    private float sum;

    public Procent(float initialSum) {
        this.sum = initialSum;
    }

    public float countPr(int pr) {
        return ((float) pr / 100) * sum;
    }

    public float countSum(float sum, float pr) {
        sum = this.sum;
        return sum + (pr / 100) * sum;
    }

    public float countSumrnd(int pr) {
        return sum + (pr / 100.0f) * sum;
    }
}
