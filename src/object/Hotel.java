package object;

public class Hotel {

    int hotel_id;
    String hotel_name;
    String hotel_type;
    String owner_name;
    String address;
    String city;
    String state;
    long phone_no;
    String email;
    int total_rooms;
    int available_rooms;
    int total_floors;
    double room_price;
    String opening_time;
    String closing_time;

    public void information() {
        System.out.println("Hotel Name --> " + hotel_name);
        System.out.println("Hotel ID --> " + hotel_id);
        System.out.println("Hotel Type --> " + hotel_type);
        System.out.println("Owner Name --> " + owner_name);
        System.out.println("Address --> " + address);
        System.out.println("City --> " + city);
        System.out.println("State --> " + state);
        System.out.println("Phone No --> " + phone_no);
    }

    public void hotel_detail() {
        System.out.println("Email --> " + email);
        System.out.println("Total Rooms --> " + total_rooms);
        System.out.println("Available Rooms --> " + available_rooms);
        System.out.println("Total Floors --> " + total_floors);
        System.out.println("Room Price --> " + room_price);
    }

    public void timing() {
        System.out.println("Opening Time --> " + opening_time);
        System.out.println("Closing Time --> " + closing_time);
    }

    public void bookRoom() {
        System.out.println("Room booked successfully.");
    }

    public void checkOut() {
        System.out.println("Guest checked out successfully.");
    }
}
