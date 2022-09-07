package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;

public class MealsFormController {
    public AnchorPane mealsContext;

    public void openGalleryForm(ActionEvent actionEvent) throws IOException {
        URL resource = getClass().getResource("../view/GalleryForm.fxml");
        Parent load = FXMLLoader.load(resource);
        Stage window = (Stage) mealsContext.getScene().getWindow();
        window.setScene(new Scene(load));
    }

    public void backToRoomsOnAction(ActionEvent actionEvent) throws IOException {
        URL resource = getClass().getResource("../view/RoomsForm.fxml");
        Parent load = FXMLLoader.load(resource);
        Stage window = (Stage) mealsContext.getScene().getWindow();
        window.setScene(new Scene(load));
    }

    public void backToHomePageOnAction(ActionEvent actionEvent) throws IOException {
        URL resource = getClass().getResource("../view/HomePageForm.fxml");
        Parent load = FXMLLoader.load(resource);
        Stage window = (Stage) mealsContext.getScene().getWindow();
        window.setScene(new Scene(load));
    }

    public void backToPackagesOnAction(ActionEvent actionEvent) throws IOException {
        URL resource = getClass().getResource("../view/PackagesForm.fxml");
        Parent load = FXMLLoader.load(resource);
        Stage window = (Stage) mealsContext.getScene().getWindow();
        window.setScene(new Scene(load));
    }
}
