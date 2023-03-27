package org.example.student;

public class Student {
    private  int studentId;
    private  String studentName;
    private  String studentParentName;
    private String studentContact;
    private String studentAadharNumber;
    private String StudentAddress;

    public Student(int studentId, String studentName, String studentParentName, String studentContact,String studentAadharNumber, String studentAddress) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.studentParentName = studentParentName;
        this.studentContact = studentContact;
        this.studentAadharNumber = studentAadharNumber;
        StudentAddress = studentAddress;
    }

    public Student(String studentName, String studentParentName, String studentContact, String studentAadharNumber, String studentAddress) {
        this.studentName = studentName;
        this.studentParentName = studentParentName;
        this.studentContact = studentContact;
        this.studentAadharNumber = studentAadharNumber;
        StudentAddress = studentAddress;
    }

    public Student() {
        super();
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

     public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getStudentParentName() {
        return studentParentName;
    }

    public void setStudentParentName(String studentParentName) {
        this.studentParentName = studentParentName;
    }

    public String getStudentContact() {
        return studentContact;
    }

    public void setStudentContact(String studentContact) {
        this.studentContact = studentContact;
    }

    public String getStudentAadharNumber() {
        return studentAadharNumber;
    }

    public void setStudentAadharNumber(String studentAadharNumber) {
        this.studentAadharNumber = studentAadharNumber;
    }

    public String getStudentAddress() {
        return StudentAddress;
    }

    public void setStudentAddress(String studentAddress) {
        StudentAddress = studentAddress;
    }

    @Override
    public String toString() {
        return "Student{" +
                "studentId=" + studentId +
                ", studentName='" + studentName + '\'' +
                ", studentParentName='" + studentParentName + '\'' +
                ", studentContact='" + studentContact + '\'' +
                ", studentAadharNumber=" + studentAadharNumber +
                ", StudentAddress='" + StudentAddress + '\'' +
                '}';
    }
}
