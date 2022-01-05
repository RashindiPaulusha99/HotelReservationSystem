package controller;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXTextField;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import model.Guests;
import view.tm.GuestTM;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Optional;

public class BookingFormController {
    public JFXTextField txtId;
    public JFXTextField txtName;
    public JFXTextField txtContact;
    public JFXTextField txtNIC;
    public JFXTextField txtEmail;
    public JFXTextField txtAddress;
    public JFXTextField txtCheckIn;
    public JFXTextField txtCheckOut;
    public JFXTextField txtAdults;
    public JFXTextField txtChildren;
    public JFXTextField txtRooms;
    public JFXTextField txtRoomType;
    public JFXTextField txtPrice;

    public TableView<GuestTM> tblGuest;
    public TableColumn colId;
    public TableColumn colName;
    public TableColumn colContact;
    public TableColumn colAddress;
    public TableColumn colNIC;
    public TableColumn colEmail;
    public TableColumn colCheckIn;
    public TableColumn colCheckOut;
    public TableColumn colAdults;
    public TableColumn colChildren;
    public TableColumn colRooms;
    public TableColumn colRoomType;
    public TableColumn colPrice;
    public TableColumn colDelete;
    public AnchorPane bookingContext;

    static ArrayList<Guests> guestsList = new ArrayList();
    public JFXButton btnSave;
    public JFXButton btnBook;

    public void initialize() {
        colId.setCellValueFactory(new PropertyValueFactory<>("id"));
        colName.setCellValueFactory(new PropertyValueFactory<>("name"));
        colContact.setCellValueFactory(new PropertyValueFactory<>("contact"));
        colAddress.setCellValueFactory(new PropertyValueFactory<>("address"));
        colNIC.setCellValueFactory(new PropertyValueFactory<>("nic"));
        colEmail.setCellValueFactory(new PropertyValueFactory<>("email"));
        colCheckIn.setCellValueFactory(new PropertyValueFactory<>("checkin"));
        colCheckOut.setCellValueFactory(new PropertyValueFactory<>("checkout"));
        colAdults.setCellValueFactory(new PropertyValueFactory<>("adults"));
        colChildren.setCellValueFactory(new PropertyValueFactory<>("children"));
        colRooms.setCellValueFactory(new PropertyValueFactory<>("rooms"));
        colRoomType.setCellValueFactory(new PropertyValueFactory<>("roomtype"));
        colPrice.setCellValueFactory(new PropertyValueFactory<>("price"));
        colDelete.setCellValueFactory(new PropertyValueFactory<>("btn"));

        
    }

    public void backToRoomSelectionOnAction(ActionEvent actionEvent) throws IOException {
        URL resource = getClass().getResource("../view/RoomSelectionForm.fxml");
        Parent load = FXMLLoader.load(resource);
        Stage window = (Stage) bookingContext.getScene().getWindow();
        window.setScene(new Scene(load));
    }

    public boolean isExists(Guests guests) {
        for (Guests t : guestsList
        ) {
            if (t.getId().equalsIgnoreCase(guests.getId())) {
                return false;
            }
        }
        return true;
    }

    public void saveGuestsOnAction(ActionEvent actionEvent) {
        Guests guests= new Guests(txtId.getText(),txtName.getText(),txtContact.getText(),txtAddress.getText(),txtNIC.getText(),txtEmail.getText(),txtCheckIn.getText(),txtCheckOut.getText(),txtAdults.getText(),txtChildren.getText(),txtRooms.getText(),txtRoomType.getText(),txtPrice.getText());

        if (isExists(guests)) {
            if (guestsList.add(guests)){
                loadAllGuests();
            new Alert(Alert.AlertType.CONFIRMATION,"Saved A Guest..", ButtonType.CLOSE).show();
        }else{
            new Alert(Alert.AlertType.WARNING,"Try Again..", ButtonType.CLOSE).show();
        }
        } else {
            new Alert(Alert.AlertType.WARNING, "Already Exists..", ButtonType.CLOSE).show();
        }
    }

    private void loadAllGuests(){
        ObservableList<GuestTM> tmObservableList = FXCollections.observableArrayList();
        for (Guests temp: guestsList) {
            Button btn= new Button("Delete");
            tmObservableList.add(new GuestTM(temp.getId(),temp.getName(),temp.getContact(),temp.getAddress(),temp.getEmail(),temp.getNic(),temp.getCheckIn(),temp.getCheckOut(),temp.getAdults(),temp.getChildren(),temp.getRooms(),temp.getRoomtype(),temp.getPrice(),btn));

            btn.setOnAction((e) -> {
                ButtonType yes= new ButtonType("Yes", ButtonBar.ButtonData.OK_DONE);
                ButtonType no= new ButtonType("No", ButtonBar.ButtonData.CANCEL_CLOSE);
                Alert alert = new Alert(Alert.AlertType.CONFIRMATION,"Are you sure whether you want to delete this Guest?",yes,no);
                alert.setTitle("Confirmation Alert");
                Optional<ButtonType> result = alert.showAndWait();

                if (result.orElse(no)==yes){
                    guestsList.remove(temp);
                    loadAllGuests();
                }else{
                }
            });
        }
        tblGuest.setItems(tmObservableList);
    }

    private void loadGuestsData(GuestTM tm) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("../view/PrintForm.fxml"));
        Parent parent = loader.load();
        PrintFormController controller = loader.getController();
        controller.setData(tm);
        Scene scene= new Scene(parent);
        Stage stage = new Stage();
        stage.setScene(scene);
        stage.show();
    }

    public void backToHomePageOnAction(ActionEvent actionEvent) throws IOException {
        Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
        alert.setTitle("Confirm");
        alert.setHeaderText("This is a confirmation.");
        alert.setResizable(false);
        alert.setContentText("Are you sure whether you want to exit?");

        Optional<ButtonType> result = alert.showAndWait();
        ButtonType button = result.orElse(ButtonType.CANCEL);

        if (button == ButtonType.OK) {
            URL resource = getClass().getResource("../view/HomePageForm.fxml");
            Parent load = FXMLLoader.load(resource);
            Stage window = (Stage) bookingContext.getScene().getWindow();
            window.setScene(new Scene(load));
        } else {

        }
    }

    public void moveToName(ActionEvent actionEvent) {
        txtName.requestFocus();
    }

    public void moveToContact(ActionEvent actionEvent) {
        txtContact.requestFocus();
    }

    public void moveToNIC(ActionEvent actionEvent) {
        txtNIC.requestFocus();
    }

    public void moveToEmail(ActionEvent actionEvent) {
        txtEmail.requestFocus();
    }

    public void moveToAddress(ActionEvent actionEvent) {
        txtAddress.requestFocus();
    }

    public void moveToRooms(ActionEvent actionEvent) {
        txtRooms.requestFocus();
    }

    public void moveToRoomType(ActionEvent actionEvent) {
        txtRoomType.requestFocus();
    }

    public void moveToAdults(ActionEvent actionEvent) {
        txtAdults.requestFocus();
    }

    public void moveToChildren(ActionEvent actionEvent) {
        txtChildren.requestFocus();
    }

    public void moveToPrice(ActionEvent actionEvent) {
        txtPrice.requestFocus();
    }

    public void moveToCheckOut(ActionEvent actionEvent) {
        txtCheckOut.requestFocus();
    }

    public void bookRoomOnAction(ActionEvent actionEvent) {
        Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
        alert.setTitle("Confirm");
        alert.setHeaderText("This is a confirmation.");
        alert.setResizable(false);
        alert.setContentText("Do you want to book this room?");

        Optional<ButtonType> result = alert.showAndWait();
        ButtonType button = result.orElse(ButtonType.CANCEL);

        if (button == ButtonType.OK) {
            loadAllGuests();
        } else {

        }
    }
}
