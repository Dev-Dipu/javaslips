//Write a program to find the Square of given number using function interface.

@FunctionalInterface
interface SquareInterface {
    int square(int num);
}

class SquareImplementation implements SquareInterface {
    public int square(int num) {
        return num * num;
    }
}

class Slip16_a {
    public static void main(String[] args) {
        SquareInterface op = new SquareImplementation();
        int num = 6;
        int res = op.square(num);
        System.out.println("The square of number is "+res);
    }
}