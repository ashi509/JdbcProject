package org.example;

import org.example.connection.service.ServiceProvider;
import org.example.student.Student;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.SQLOutput;


public class Main {
    public static void main(String[] args) {

        System.out.println("!!...WELCOME...!!");
        System.out.println("!!..MY STUDENT APPLICATION..!!");
        System.out.println("  ");
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            try {
                System.out.println("Press 1 For Adding Any Student");
                System.out.println("Press 2 For delete Any Student");
                System.out.println("Press 3 For Display Any Student");

                System.out.println("Press 4 For Exit My Application");
                System.out.println(" ");

                long c=Long.parseLong(bufferedReader.readLine());

//      for adding any student;
                if (c == 1) {
                    System.out.println("Enter your name:");
                    String name=bufferedReader.readLine();

                    System.out.println("Enter your Father name:");
                    String fatherName=bufferedReader.readLine();

                    System.out.println("Enter your contact number");
                    String contact=bufferedReader.readLine();

                      System.out.println("Enter you AadharCard number");
                      String number=bufferedReader.readLine();

                    System.out.println("Enter your Address:");
                    String address=bufferedReader.readLine();


                    Student st=new Student(name,fatherName,contact,number,address);
                    System.out.println(st);
                    boolean d= ServiceProvider.insertInToDb(st);
                    if(d){
                        System.out.println(" Student data is data insert");
                    }else{
                        System.out.println("something went wrong");
                    }
                    System.out.println("             ");

// for deleting any student
                }




                else if (c == 2) {
                    System.out.println("Enter  Student id whose you want to delete");
                    int userId=Integer.parseInt(bufferedReader.readLine());
                 boolean f=  ServiceProvider.deleteStudent(userId);
                 if(f){
                     System.out.println("student deleted successfully");
                 }
                 else{
                     System.out.println("Something went wrong......");
                 }

                }


                // Display all student for table
                else if (c == 3) {
                    ServiceProvider.displayAllStudent();





                }
                else if (c==4){
                    break;
                }

            } catch (Exception exception) {
                exception.printStackTrace();
            }

        }
        System.out.println("Thanks for visiting my Application");
    }
}