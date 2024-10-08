//Write a program to accept ‘n’ name of cities from the user and sort them in ascending order

import java.util.Arrays;
import java.util.Scanner;

public class Slip3_a {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no of cities: ");
        int n = sc.nextInt();

        String[] cities = new String[n];

        for(int i = 0; i < n; i++)
            cities[i] = sc.next();

        Arrays.sort(cities);

        System.out.println("Cities in Sorted order: ");

        for(String city: cities){
            System.out.println(city);
        }

    }
}
