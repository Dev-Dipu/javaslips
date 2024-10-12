//Write a program to accept a text file from user and display the contents of a file in
//reverse order and change its case.


import java.io.*;
import java.util.Scanner;

public class Slip7_b {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter file path: ");
        String filepath = sc.nextLine();

        try{
            Scanner file = new Scanner(new File(filepath));
            file.useDelimiter("\\Z");
            String content = file.next();
            System.out.println("file content: "+content);

            System.out.println("reverse order: "+new StringBuilder(content).reverse());
            System.out.println("upper case: "+content.toUpperCase());
            System.out.println("lower case: "+content.toLowerCase());


        }catch (FileNotFoundException e){
            System.out.println("Error: "+e.getMessage());
        }

    }
}
