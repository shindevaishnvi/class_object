package object;

public class Vehicle {

    int vehicle_id;
    String vehicle_name;
    String vehicle_type;
    String brand;
    String model;
    String color;
    String fuel_type;
    int model_year;
    String registration_no;
    int engine_cc;
    int seating_capacity;
    double price;
    String owner_name;
    String registration_city;
    String transmission_type;

    public void information() {
        System.out.println("Vehicle Name --> " + vehicle_name);
        System.out.println("Vehicle ID --> " + vehicle_id);
        System.out.println("Vehicle Type --> " + vehicle_type);
        System.out.println("Brand --> " + brand);
        System.out.println("Model --> " + model);
        System.out.println("Color --> " + color);
        System.out.println("Fuel Type --> " + fuel_type);
        System.out.println("Model Year --> " + model_year);
    }

    public void vehicle_detail() {
        System.out.println("Registration No --> " + registration_no);
        System.out.println("Engine CC --> " + engine_cc);
        System.out.println("Seating Capacity --> " + seating_capacity);
        System.out.println("Price --> " + price);
        System.out.println("Owner Name --> " + owner_name);
        System.out.println("Registration City --> " + registration_city);
        System.out.println("Transmission Type --> " + transmission_type);
    }

    public void start() {
        System.out.println("Vehicle started.");
    }

    public void stop() {
        System.out.println("Vehicle stopped.");
    }

    public void applyBrake() {
        System.out.println("Vehicle brake applied.");
    }
}
