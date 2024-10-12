//Write a program to create a package name student. Define class StudentInfo with method to
//display information about student such as rollno, class, and percentage. Create another class
//StudentPer with method to find percentage of the student. Accept student details like
//rollno, name, class and marks of 6 subject from user.

import Student.StudentInfo;

import java.util.Scanner;

public class Slip10_b {
    public static void main(String[] args) {
        String name, _class;
        int roll;
        int[] subs = new int[6];

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter name: ");
        name = sc.nextLine();

        System.out.print("Enter class: ");
        _class = sc.nextLine();

        System.out.print("Enter rollno: ");
        roll = sc.nextInt();

        System.out.println("Enter 6 subs marks");
        for(int i = 0; i < subs.length; i++)
            subs[i] = sc.nextInt();


        StudentInfo student = new StudentInfo(name, _class, roll, subs);
        student.display();
    }
}
