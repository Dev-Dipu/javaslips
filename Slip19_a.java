//Write a program to accept the two dimensional array from user and display sum of its diagonal
//elements.


import java.util.Scanner;

public class Slip19_a {
    public static void main(String[] args) {
        int n, sum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no of row in matrix");
        n = sc.nextInt();

        int [][] matrix = new int[n][n];

        System.out.println("Enter "+n+"x"+n+" matrix.");
        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++)
                matrix[i][j] = sc.nextInt();

        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++)
                if(i == j)
                    sum += matrix[i][j];

        System.out.println("The sum of digonal elements are "+sum);

    }
}
