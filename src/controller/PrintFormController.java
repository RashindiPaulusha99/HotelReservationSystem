package controller;

import com.jfoenix.controls.JFXTextField;
import javafx.scene.layout.AnchorPane;
import view.tm.GuestTM;

public class PrintFormController {
    public AnchorPane finalizeContext;
    public JFXTextField txtName;
    public JFXTextField txtId;
    public JFXTextField txtAddress;
    public JFXTextField txtContact;
    public JFXTextField txtNic;
    public JFXTextField txtEmail;
    public JFXTextField txtRoomType;
    public JFXTextField txtPrice;
    public JFXTextField txtRooms;
    public JFXTextField txtCheckIn;
    public JFXTextField txtCheckOut;
    public JFXTextField txtAdults;
    public JFXTextField txtChildren;

    public void setData(GuestTM tm){
        txtId.setText(tm.getId());
        txtName.setText(tm.getName());
        txtAddress.setText(tm.getAddress());
        txtContact.setText(tm.getContact());
        txtNic.setText(tm.getNic());
        txtEmail.setText(tm.getEmail());
        txtRoomType.setText(tm.getRoomtype());
        txtPrice.setText(tm.getPrice());
        txtRooms.setText(tm.getRooms());
        txtCheckIn.setText(tm.getCheckIn());
        txtCheckOut.setText(tm.getCheckOut());
        txtAdults.setText(tm.getAdults());
        txtChildren.setText(tm.getChildren());
    }
}
