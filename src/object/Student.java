package object;

public class Student {

    int student_id;
    String student_name;
    int age;
    char gender;
    String course;
    String branch;
    String college_name;
    String email;
    long phone_no;
    String city;
    String state;
    int semester;
    double percentage;
    String blood_group;
    String admission_date;

    public void information() {
        System.out.println("Student Name --> " + student_name);
        System.out.println("Student ID --> " + student_id);
        System.out.println("Age --> " + age);
        System.out.println("Gender --> " + gender);
        System.out.println("Email --> " + email);
        System.out.println("Phone No --> " + phone_no);
        System.out.println("City --> " + city);
        System.out.println("State --> " + state);
    }

    public void education_detail() {
        System.out.println("Course --> " + course);
        System.out.println("Branch --> " + branch);
        System.out.println("College Name --> " + college_name);
        System.out.println("Semester --> " + semester);
        System.out.println("Percentage --> " + percentage);
    }

    public void personal_detail() {
        System.out.println("Blood Group --> " + blood_group);
        System.out.println("Admission Date --> " + admission_date);
    }

    public void study() {
        System.out.println("Student is studying.");
    }

    public void attendLecture() {
        System.out.println("Student is attending a lecture.");
    }
}
