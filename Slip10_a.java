//Write a program to find the cube of given number using functional interface

interface CubeCalculator {
    int calculate(int n);
} //functional interface doesn't need to implements and same as abstract class

class Slip10_a {
    public static void main(String[] args) {
        CubeCalculator cube = (n) -> n * n * n;
        int number = 5;
        int result = cube.calculate(number);
        System.out.println("The cube of " + number + " is: " + result);
    }
}
