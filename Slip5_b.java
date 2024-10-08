//Write a menu driven program to perform the following operations on multidimensional array
//ie matrices :
//         Addition
//         Multiplication
//         Exit

import java.util.Scanner;

public class Slip5_b {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int rows = scanner.nextInt();
        System.out.print("Enter number of columns: ");
        int cols = scanner.nextInt();

        int[][] matrix1 = new int[rows][cols];
        int[][] matrix2 = new int[rows][cols];
        int[][] result = new int[rows][cols];

        System.out.println("Enter elements of Matrix 1:");
        for (int i = 0; i < rows; i++)
            for (int j = 0; j < cols; j++)
                matrix1[i][j] = scanner.nextInt();

        System.out.println("Enter elements of Matrix 2:");
        for (int i = 0; i < rows; i++)
            for (int j = 0; j < cols; j++)
                matrix2[i][j] = scanner.nextInt();

        int choice;
        do {
            System.out.println("\n1. Addition\n2. Multiplication\n3. Exit");
            System.out.print("Enter choice: ");
            choice = scanner.nextInt();

            if (choice == 1) {
                System.out.println("Result of Addition:");
                for (int i = 0; i < rows; i++) {
                    for (int j = 0; j < cols; j++) {
                        result[i][j] = matrix1[i][j] + matrix2[i][j];
                        System.out.print(result[i][j] + " ");
                    }
                    System.out.println();
                }
            } else if (choice == 2) {
                if (rows == cols) {
                    System.out.println("Result of Multiplication:");
                    for (int i = 0; i < rows; i++) {
                        for (int j = 0; j < cols; j++) {
                            result[i][j] = 0;
                            for (int k = 0; k < cols; k++)
                                result[i][j] += matrix1[i][k] * matrix2[k][j];
                            System.out.print(result[i][j] + " ");
                        }
                        System.out.println();
                    }
                } else {
                    System.out.println("Multiplication not possible");
                }
            }
        } while (choice != 3);

        scanner.close();
    }
}
