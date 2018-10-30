package libraryPackage;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;


public class Main extends Application {
    static Stage window;

    @Override

    public void start(Stage primaryStage) throws Exception {
        window = primaryStage;
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        window.setTitle("Welcome, User");
        window.setScene(new Scene(root, 1000, 700));

        Image projectIcon = new Image("https://images.cdn3.stockunlimited.net/preview1300/reading-book-icon_1577769.jpg");
        window.getIcons().add(projectIcon);

        window.show();
    }


    public static void main(String[] args) {
        launch(args);
    }

}

