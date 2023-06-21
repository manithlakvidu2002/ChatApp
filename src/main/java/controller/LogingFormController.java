package controller;

import com.jfoenix.controls.JFXTextField;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class LogingFormController {

    public JFXTextField Txt_Enter_Name;
    static String User_name;

    public void Txt_name_on_action(ActionEvent actionEvent) throws IOException {
        User_name=Txt_Enter_Name.getText();
        Txt_Enter_Name.clear();
        Stage stage = new Stage();
        stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("/view/LoginForm.fxml"))));
        stage.close();
        stage.centerOnScreen();
        stage.show();
    }
}
