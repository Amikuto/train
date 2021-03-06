package sch.ami.train.javafx;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;
import sch.ami.train.javafx.controller.MainSceneController;
import sch.ami.train.javafx.controller.RootLayoutController;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;

public class Main extends Application {

    private Stage primaryStage;
    private BorderPane rootLayout;

    @Override
    public void start(Stage primaryStage) throws IOException {
        this.primaryStage = primaryStage;
        this.primaryStage.setTitle("Train application!");
        this.primaryStage.setMaximized(true);

        // Set logo on the top left
        InputStream iconStream = getClass().getResourceAsStream("/static/TLogo.jpeg");
        Image image = new Image(iconStream);
        this.primaryStage.getIcons().add(image);

        showRootLayout();

        showMainScene();
    }

    public void showMainScene() throws IOException {
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(Main.class.getResource("/templates/Main.fxml"));
        AnchorPane mainScene = loader.load();

        rootLayout.setCenter(mainScene);

//        MainSceneController controller = loader.getController();
//        controller.setMainApp(this);
        loader.setController(new RootLayoutController());
    }

    public void showRootLayout() throws IOException {
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(Main.class.getResource("/templates/RootLayout.fxml"));
        rootLayout = loader.load();

        Scene scene = new Scene(rootLayout);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public Stage getPrimaryStage() {
        return primaryStage;
    }

    public static void main(String[] args) {
        launch(args);
    }
}
