package object;

public class Mainclass_hos {

	    public static void main(String[] args) {

	        Hospital h = new Hospital();

	        h.hospital_id = 101;
	        h.hospital_name = "City Care Hospital";
	        h.hospital_type = "Multispeciality";
	        h.address = "MG Road";
	        h.city = "Pune";
	        h.state = "Maharashtra";
	        h.phone_no = 9876543210L;
	        h.email = "citycare@gmail.com";
	        h.total_beds = 200;
	        h.available_beds = 50;
	        h.total_doctors = 40;
	        h.total_nurses = 80;
	        h.emergency_status = "Available";
	        h.opening_time = "08:00 AM";
	        h.closing_time = "10:00 PM";

	        h.information();

	        System.out.println("--------------------------------");

	        h.hospital_detail();

	        System.out.println("--------------------------------");

	        h.emergencyService();
	        h.openingTime();
	        h.closingTime();
	    }
	}

