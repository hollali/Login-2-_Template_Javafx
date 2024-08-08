package com.example.srom_form;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class SplashController {
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }
}