package view.tm;

import javafx.scene.control.Button;

public class GuestTM {
    private String id;
    private String name;
    private String address;
    private String contact;
    private String nic;
    private String email;
    private String checkin;
    private String checkout;
    private String adults;
    private String children;
    private String rooms;
    private String roomtype;
    private String price;
    private Button btn;

    public GuestTM() {
    }

    public GuestTM(String id, String name, String address, String contact, String nic, String email,String checkin,String checkout,String adults,String children,String rooms,String roomtype,String price, Button btn) {
        this.setId(id);
        this.setName(name);
        this.setAddress(address);
        this.setContact(contact);
        this.setNic(nic);
        this.setEmail(email);
        this.setCheckIn(checkin);
        this.setCheckOut(checkout);
        this.setAdults(adults);
        this.setChildren(children);
        this.setRooms(rooms);
        this.setRoomType(roomtype);
        this.setPrice(price);
        this.setBtn(btn);
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public String getNic() {
        return nic;
    }

    public void setNic(String nic) {
        this.nic = nic;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCheckIn() {
        return checkin;
    }

    public void setCheckIn(String checkin) {
        this.checkin = checkin;
    }

    public String getCheckOut() {
        return checkout;
    }

    public void setCheckOut(String checkout) {
        this.checkout = checkout;
    }

    public String getAdults() {
        return adults;
    }

    public void setAdults(String adults) {
        this.adults = adults;
    }

    public String getChildren() {
        return children;
    }

    public void setChildren(String children) {
        this.children = children;
    }

    public String getRooms() {
        return rooms;
    }

    public void setRooms(String rooms) {
        this.rooms = rooms;
    }

    public String getRoomtype() {
        return roomtype;
    }

    public void setRoomType(String roomtype) {
        this.roomtype = roomtype;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public Button getBtn() {
        return btn;
    }

    public void setBtn(Button btn) {
        this.btn = btn;
    }
}
