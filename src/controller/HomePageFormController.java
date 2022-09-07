package controller;

import com.jfoenix.controls.JFXTextField;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;

public class HomePageFormController {
    public AnchorPane homePageContext;
    public JFXTextField txtCheckIn;
    public JFXTextField txtCheckOut;
    public JFXTextField txtRooms;
    public JFXTextField txtAdults;
    public JFXTextField txtChildren;

    public void backToLoginOnAction(ActionEvent actionEvent) throws IOException {
        URL resource = getClass().getResource("../view/DashBoardForm.fxml");
        Parent load = FXMLLoader.load(resource);
        Stage window = (Stage) homePageContext.getScene().getWindow();
        window.setScene(new Scene(load));
    }

    public void openPackagesForm(ActionEvent actionEvent) throws IOException {
        URL resource = getClass().getResource("../view/PackagesForm.fxml");
        Parent load = FXMLLoader.load(resource);
        Stage window = (Stage) homePageContext.getScene().getWindow();
        window.setScene(new Scene(load));
    }

    public void openPackagesAgainForm(ActionEvent actionEvent) throws IOException {
        URL resource = getClass().getResource("../view/PackagesForm.fxml");
        Parent load = FXMLLoader.load(resource);
        Stage window = (Stage) homePageContext.getScene().getWindow();
        window.setScene(new Scene(load));
    }

    public void openRoomSelectionForm(ActionEvent actionEvent) throws IOException {
        URL resource = getClass().getResource("../view/RoomSelectionForm.fxml");
        Parent load = FXMLLoader.load(resource);
        Stage window = (Stage) homePageContext.getScene().getWindow();
        window.setScene(new Scene(load));
    }

    public void openRoomsForm(ActionEvent actionEvent) throws IOException {
        URL resource = getClass().getResource("../view/RoomsForm.fxml");
        Parent load = FXMLLoader.load(resource);
        Stage window = (Stage) homePageContext.getScene().getWindow();
        window.setScene(new Scene(load));
    }

    public void openMealsForm(ActionEvent actionEvent) throws IOException {
        URL resource = getClass().getResource("../view/MealsForm.fxml");
        Parent load = FXMLLoader.load(resource);
        Stage window = (Stage) homePageContext.getScene().getWindow();
        window.setScene(new Scene(load));
    }

    public void openGalleryForm(ActionEvent actionEvent) throws IOException {
        URL resource = getClass().getResource("../view/GalleryForm.fxml");
        Parent load = FXMLLoader.load(resource);
        Stage window = (Stage) homePageContext.getScene().getWindow();
        window.setScene(new Scene(load));
    }

    public void moveToCheckOut(ActionEvent actionEvent) {
        txtCheckOut.requestFocus();
    }

    public void moveToRooms(ActionEvent actionEvent) {
        txtRooms.requestFocus();
    }

    public void moveToAdults(ActionEvent actionEvent) {
        txtAdults.requestFocus();
    }

    public void moveToChildren(ActionEvent actionEvent) {
        txtChildren.requestFocus();
    }
}
