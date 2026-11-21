package object;

public class Employee {
 String employee_name;
 String employee_type;
 int employee_id;
 String email;
 String job_role;
 char gender;
 String department;
 long phone_no;
 String shift;
 String city;
 String address;
 String employee_status;
 double salary;
 String dateofbirth;
 String joing_date;
 
 public void information() {
	    System.out.println("Employee Name --> " + employee_name);
	    System.out.println("Email --> " + email);
	    System.out.println("Gender --> " + gender);
	    System.out.println("Phone No --> " + phone_no);
	    System.out.println("Date of Birth --> " + dateofbirth);
	}

	public void job_detail() {
	    System.out.println("Job Role --> " + job_role);
	    System.out.println("Department --> " + department);
	}
 public void takeBreak() {
     System.out.println("Employee is taking a break.");
 }
 public void logout() {
     System.out.println("Employee has logged out.");
 }	
 public void work() {
     System.out.println("Employee is working.");
 }
}

