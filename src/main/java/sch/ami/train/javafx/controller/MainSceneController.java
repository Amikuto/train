package sch.ami.train.javafx.controller;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import net.rgielen.fxweaver.core.FxmlView;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import sch.ami.train.WeatherService;

@Component
@FxmlView("main-stage.fxml")
public class MainSceneController {

    @FXML
    private WeatherService weatherService;
    @FXML
    private Button mainButton;

//    @Autowired
//    public MainSceneController(WeatherService weatherService) {
//        this.weatherService = weatherService;
//    }

    public void buttonClicked(){
        System.out.println("this.weatherService.getWeatherForecast()");
    }
}
