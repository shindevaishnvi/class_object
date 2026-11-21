package object;

public class Mainclass_HOT {
	 public static void main(String[] args) {

	        Hotel h = new Hotel();

	        h.hotel_id = 101;
	        h.hotel_name = "Royal Palace";
	        h.hotel_type = "Five Star";
	        h.owner_name = "Rahul Sharma";
	        h.address = "MG Road";
	        h.city = "Pune";
	        h.state = "Maharashtra";
	        h.phone_no = 9876543210L;
	        h.email = "royalpalace@gmail.com";
	        h.total_rooms = 100;
	        h.available_rooms = 35;
	        h.total_floors = 8;
	        h.room_price = 3500;
	        h.opening_time = "06:00 AM";
	        h.closing_time = "11:00 PM";

	        h.information();

	        System.out.println("--------------------------------");

	        h.hotel_detail();

	        System.out.println("--------------------------------");

	        h.timing();

	        System.out.println("--------------------------------");

	        h.bookRoom();
	        h.checkOut();
	    }
	}

