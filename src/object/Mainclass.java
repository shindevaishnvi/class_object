package object;

public class Mainclass {

    public static void main(String[] args) {

        Employee e = new Employee();

        e.employee_name = "Vaishnavi";
        e.employee_type = "Permanent";
        e.employee_id = 101;
        e.email = "vaishnavi@gmail.com";
        e.job_role = "Java Developer";
        e.gender = 'F';
        e.department = "IT";
        e.phone_no = 9876543210L;
        e.shift = "Day Shift";
        e.city = "Pune";
        e.address = "Maharashtra";
        e.employee_status = "Active";
        e.salary = 35000;
        e.dateofbirth = "15-08-2003";
        e.joing_date = "22-10-2026";

        e.information();
        e.job_detail();
        e.takeBreak();
        e.logout();
        e.work();
    }
}