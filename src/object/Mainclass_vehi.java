package object;

public class Mainclass_vehi {

    public static void main(String[] args) {

        Vehicle v = new Vehicle();

        v.vehicle_id = 101;
        v.vehicle_name = "Swift";
        v.vehicle_type = "Car";
        v.brand = "Maruti Suzuki";
        v.model = "Swift VXi";
        v.color = "White";
        v.fuel_type = "Petrol";
        v.model_year = 2026;
        v.registration_no = "MH14AB1234";
        v.engine_cc = 1197;
        v.seating_capacity = 5;
        v.price = 750000;
        v.owner_name = "Vaishnavi";
        v.registration_city = "Pune";
        v.transmission_type = "Manual";

        v.information();

        System.out.println("--------------------------------");

        v.vehicle_detail();

        System.out.println("--------------------------------");

        v.start();
        v.stop();
        v.applyBrake();
    }
}
