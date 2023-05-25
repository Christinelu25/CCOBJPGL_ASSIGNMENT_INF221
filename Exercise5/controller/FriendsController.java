package controller;



import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.image.ImageView;
import model.*;

public class FriendsController {

    @FXML
    ImageView img1, img2, img3, img4, img5;

    @FXML
    Button btn1, btn2, btn3, btn4, btn5;

    Beatriz bea = new Beatriz();
    Jasper per = new Jasper();
    Arjay jay = new Arjay();
    Terrence rensho = new Terrence();
    Carlo lo = new Carlo();

    public void initialize() {

        bea.setGender("Female");
        bea.setAge("19");

        per.setGender("Male");
        per.setAge("20");

        jay.setGender("Prefer not to say");
        jay.setAge("19");
        
        rensho.setGender("Strong Independent woman");
        rensho.setAge("72");

        lo.setGender("Male");
        lo.setAge("19");
    }

    public void showInfo(ActionEvent event) {

        Button sourceButton = (Button) event.getSource();
        Alert alert = new Alert(AlertType.INFORMATION);

        if (sourceButton.equals(btn1)) {
            alert.setContentText("Bea, " + bea.getGender() + " and  " + bea.getAge());
        }

        if (sourceButton == btn2) {
            alert.setContentText("Jasper, " + per.getGender() + " and " + per.getAge());
        }
        if (sourceButton == btn3) {
            alert.setContentText("Arjay, " + jay.getGender() + " and " + jay.getAge());
        }

        if (sourceButton == btn4) {
            alert.setContentText("Terrence, " + rensho.getGender() + " and " + rensho.getAge());
        }

        if (sourceButton == btn5) {
            alert.setContentText("Carlo, " + lo.getGender() + " and " +lo.getAge());
        }



        alert.showAndWait();

    }
}