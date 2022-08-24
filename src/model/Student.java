package model;

public class Student {
    String studentName;
    char gender;
    int age;
    long idNum;

    public Student(String name, char gender, int age, long idNum) {
        this.studentName = name;
        this.gender = gender;
        this.age = age;
        this.idNum = idNum;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public long getIdNum() {
        return idNum;
    }

    public void setIdNum(long idNum) {
        this.idNum = idNum;
    }
}
