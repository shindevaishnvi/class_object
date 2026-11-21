package object;

public class Mainclass_stud {

    public static void main(String[] args) {

        Student s = new Student();

        s.student_id = 101;
        s.student_name = "Vaishnavi";
        s.age = 22;
        s.gender = 'F';
        s.course = "BE";
        s.branch = "E&TC";
        s.college_name = "Jaihind College of Engineering";
        s.email = "vaishnavi@gmail.com";
        s.phone_no = 9876543210L;
        s.city = "Pune";
        s.state = "Maharashtra";
        s.semester = 8;
        s.percentage = 85.5;
        s.blood_group = "O+";
        s.admission_date = "15-07-2022";

        s.information();

        System.out.println("--------------------------------");

        s.education_detail();

        System.out.println("--------------------------------");

        s.personal_detail();

        System.out.println("--------------------------------");

        s.study();
        s.attendLecture();
    }
}