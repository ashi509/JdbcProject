package org.example.connection.service;

import org.example.connection.ConnectionProviders;
import org.example.student.Student;

import java.sql.*;

public class ServiceProvider {
     static boolean f=false;

     public static boolean  insertInToDb(Student student){
        try {
             Connection connection = ConnectionProviders.getInstance().getConnection();

                String q = "Insert into student(studentName,studentFatherName, studentContact,studentAadharNumber,StudentAddress)values(? ,? ,?, ? ,?)";
                PreparedStatement preparedStatement = connection.prepareStatement(q);

                preparedStatement.setString(1, student.getStudentName());
                preparedStatement.setString(2, student.getStudentParentName());
                preparedStatement.setString(3, student.getStudentContact());
                preparedStatement.setString(4, student.getStudentAadharNumber());
                preparedStatement.setString(5, student.getStudentAddress());


                preparedStatement.executeUpdate();
                f = true;

connection.close();

        }catch(Exception exception){
            exception.printStackTrace();
        }
        return f;
    }
    // insert data into database
    public static boolean  deleteStudent(int userId){
        try {
            Connection connection = ConnectionProviders.getInstance().getConnection();

            String q = "delete from student where studentId=?";
            PreparedStatement preparedStatement = connection.prepareStatement(q);

            preparedStatement.setInt(1, userId);



            preparedStatement.executeUpdate();
            f = true;
            connection.close();


        }catch(Exception exception){
            exception.printStackTrace();
         }
        return f;
    }
// delete data into databases;
    public static void displayAllStudent() {
  // display data into databases;
            try {
                Connection connection = ConnectionProviders.getInstance().getConnection();

                String q = "select * from student;";
                Statement statement=connection.createStatement();

              ResultSet set = statement.executeQuery(q);
                System.out.println("     !!!................DISPLAY ALL STUDENT...................!!!!  ");
               while(set.next()) {
                  int studentId=set.getInt(1);
                  String studentName=set.getString(2);
                  String fatherName=set.getString(3);
                  String  studentContact=set.getString(4);
                  String studentAadharNumber=set.getString(5);
                  String studentAddress=set.getString(6);



                   System.out.println("ID :"+studentId);
                   System.out.println("Student Name:"+studentName);
                   System.out.println("Student Father Name :"+fatherName);
                   System.out.println("Student Contact :"+studentContact);
                   System.out.println("Student Aadhar number :"+studentAadharNumber);
                   System.out.println("Student Address :"+studentAddress);
                   System.out.println("       ");
                   System.out.println("........NEW ROW........");
                   System.out.println("        ");

connection.close();
               }
                System.out.println("          ");

            }catch(Exception exception){
                exception.printStackTrace();
            }

        }
     // display all data into databases;


     }



