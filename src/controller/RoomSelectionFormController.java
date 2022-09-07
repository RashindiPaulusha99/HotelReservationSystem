package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;

public class RoomSelectionFormController {
    public AnchorPane roomSelectionContext;

    public void openBookingForm(ActionEvent actionEvent) throws IOException {
        URL resource = getClass().getResource("../view/BookingForm.fxml");
        Parent load = FXMLLoader.load(resource);
        Stage window = (Stage) roomSelectionContext.getScene().getWindow();
        window.setScene(new Scene(load));
    }

    public void backToGalleryOnAction(ActionEvent actionEvent) throws IOException {
        URL resource = getClass().getResource("../view/GalleryForm.fxml");
        Parent load = FXMLLoader.load(resource);
        Stage window = (Stage) roomSelectionContext.getScene().getWindow();
        window.setScene(new Scene(load));
    }

    public void backToHomePageOnAction(ActionEvent actionEvent) throws IOException {
        URL resource = getClass().getResource("../view/HomePageForm.fxml");
        Parent load = FXMLLoader.load(resource);
        Stage window = (Stage) roomSelectionContext.getScene().getWindow();
        window.setScene(new Scene(load));
    }
}
