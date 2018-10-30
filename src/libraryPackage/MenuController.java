package libraryPackage;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.MenuItem;
import javafx.scene.control.ScrollPane;
import javafx.scene.image.Image;
import javafx.stage.Stage;

import java.util.ResourceBundle;
//CONTROLLER FOR sample.fxml

public class MenuController implements Initializable {
    @FXML
    private MenuItem fullScreenId;
    @FXML
    private ScrollPane scrollPane;


    //method for about
    public void aboutAction() {
        Label aboutLabel = new Label("Welcome to our Library System. You can find your favourite book titles here and you can take them home for 2 weeks. After that time, you can either reserve them longer or return them. Have a pleasant time with us! :)");
        Image windowIcon = new Image("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTaSaNvirtAiYJusWkqqoT6XeNrB2I2SRDoJHg_2QH-kjFxYA4u");
        Window.showWindow(aboutLabel, "About...", windowIcon);
    }

    //method for exit
    public void exitAction() {
        System.exit(0);
    }

    //method for fullscreen
    public void fullScreenAction() {
        if (State.fullScreen == false) {
            enableFullScreen(Main.window);
            fullScreenId.setText("Maximize");

        } else
            disableFullScreen(Main.window);
        fullScreenId.setText("Restore Down");

    }

    //method for enable full screen
    private static void enableFullScreen(Stage window) {
        window.setFullScreen(true);
        State.fullScreen = true;
    }

    //method for disable full screen
    private static void disableFullScreen(Stage window) {
        window.setFullScreen(false);
        State.fullScreen = false;
    }

    public void deleteAccountAction() {
        Label deleteLabel = new Label("Your account has been deleted.");
        Image deleteIcon = new Image("http://cdn.onlinewebfonts.com/svg/img_198571.png");
        Window.showWindow(deleteLabel, "Deleting account...", deleteIcon);
    }

    public void logoutAction() {
        Label logoutLabel = new Label("You have been logged out.");
        Image logoutIcon = new Image("https://image.freepik.com/free-icon/logout_318-10026.jpg");
        Window.showWindow(logoutLabel, "Logging out...", logoutIcon);
        //TODO LOGOUT ACTION
        Main.window.close();
        //TODO RETURN TO REGISTER+LOGIN WINDOW
    }

    public void accountInfo() {
        try {
            Parent root = FXMLLoader.load(getClass().getResource("accountFXML.fxml"));
            Stage stage = new Stage();
            stage.setTitle("My Account");
            Image accountIcon = new Image("https://static.thenounproject.com/png/219377-200.png");
            stage.getIcons().add(accountIcon);
            stage.setScene(new Scene(root));
            stage.show();
        } catch (Exception e) {
            System.out.print("cant load new window");
        }

    }

    @Override
    public void initialize(java.net.URL arg0, ResourceBundle arg1) {
    }


}
