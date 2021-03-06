package sch.ami.train.javafx.controller;

import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class MainSceneController {

    @FXML
    private Button mainButton;

    public void buttonClicked(){
        System.out.println("Button clicked!!!");
    }
}
