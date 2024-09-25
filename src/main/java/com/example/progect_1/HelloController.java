package com.example.progect_1;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.beans.binding.Bindings;


public class HelloController {
    @FXML
    private Label procent, onCountPr, onCountSum, onCountSumrnd;

    @FXML
    private TextField sumInput;

    @FXML
    protected void onCountPr() {
        float sum = Float.parseFloat(sumInput.getText());
        Procent f1 = new Procent(sum);
        onCountPr.setText(String.valueOf(f1.countPr(10)));
    }

    @FXML
    protected void onCountSum() {
        float sum = Float.parseFloat(sumInput.getText());
        Procent f1 = new Procent(sum);
        onCountSum.setText("" + f1.countSum(100, 10));
    }

    @FXML
    protected void onCountSumrnd() {
        float sum = Float.parseFloat(sumInput.getText());
        Procent f1 = new Procent(sum);
        onCountSumrnd.setText(String.valueOf(f1.countSumrnd(20)));
    }

//    @FXML
//    private Button countPrButton;

//    @FXML
//    public void initialize() {
//        countPrButton.disableProperty().bind(Bindings.isEmpty(sumInput.textProperty()));
//    }



}