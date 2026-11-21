package object;

	public class Hospital {

	    int hospital_id;
	    String hospital_name;
	    String hospital_type;
	    String address;
	    String city;
	    String state;
	    long phone_no;
	    String email;
	    int total_beds;
	    int available_beds;
	    int total_doctors;
	    int total_nurses;
	    String emergency_status;
	    String opening_time;
	    String closing_time;

	    public void information() {
	        System.out.println("Hospital Name --> " + hospital_name);
	        System.out.println("Hospital ID --> " + hospital_id);
	        System.out.println("Hospital Type --> " + hospital_type);
	        System.out.println("Address --> " + address);
	        System.out.println("City --> " + city);
	        System.out.println("State --> " + state);
	        System.out.println("Phone No --> " + phone_no);
	        System.out.println("Email --> " + email);
	    }

	    public void hospital_detail() {
	        System.out.println("Total Beds --> " + total_beds);
	        System.out.println("Available Beds --> " + available_beds);
	        System.out.println("Total Doctors --> " + total_doctors);
	        System.out.println("Total Nurses --> " + total_nurses);
	    }

	    public void emergencyService() {
	        System.out.println("Emergency Status --> " + emergency_status);
	    }

	    public void openingTime() {
	        System.out.println("Opening Time --> " + opening_time);
	    }

	    public void closingTime() {
	        System.out.println("Closing Time --> " + closing_time);
	    }
	}

