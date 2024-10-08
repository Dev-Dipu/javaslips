//Define an abstract class Staff with protected members id and name. Define a parameterized
//constructor. Define one subclass OfficeStaff with member department. Create n objects of
//OfficeStaff and display all details.

import java.util.Scanner;

abstract class Staff{
    protected int id;
    protected String name;
}

class OfficeStaff extends Staff{
    String department;
    OfficeStaff(int id, String name, String department){
        this.id = id;
        this.name = name;
        this.department = department;
    }

    void display(){
        System.out.println("Id: "+id);
        System.out.println("Name: "+name);
        System.out.println("Department: "+department);
    }
}



public class Slip1_b {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int id, n;
        String name, department;
        System.out.print("Enter no of members: ");
        n = sc.nextInt();
        OfficeStaff[] members = new OfficeStaff[n];

        for(int i = 0; i < n; i++){
            System.out.print("Enter id: ");
            id = sc.nextInt();
            System.out.print("Enter name: ");
            name = sc.next();
            System.out.print("Enter department: ");
            department = sc.next();
            members[i] = new OfficeStaff(id, name, department);
        }

        System.out.println("All Members are...");
        for(OfficeStaff member: members){
            member.display();
        }
    }
}
