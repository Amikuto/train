package sch.ami.train.javafx.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
//import net.rgielen.fxweaver.core.FxmlView;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import sch.ami.train.WeatherService;

@Component
//@FxmlView("main-stage.fxml")
public class MyController {

    @FXML
    private Label weatherLabel;
    private WeatherService weatherService;

    @Autowired
    public MyController(WeatherService weatherService) {
        this.weatherService = weatherService;
    }

//    public void loadWeatherForecast() {
//        this.weatherLabel.setText(weatherService.getWeatherForecast());
//    }
}
