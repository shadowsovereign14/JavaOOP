import model.Student;

public class Main {

    public static void main (String[] args) {
        Student student = new Student("Ryan Jay", 'M', 25, 8665);
        System.out.println("Student Name: " + student.getStudentName());
        System.out.println("Age: " + student.getAge());
        System.out.println("Gender: " + student.getGender());
        System.out.println("Student ID number: " + student.getIdNum());
    }
}
