//Write a Program to print all Prime numbers in an array of ‘n’ elements.

public class Slip1_a {
    public static Boolean isPrime(int num){
        if(num<2) return false;
        for(int i = 2; i < num/2; i++)
            if(num % i == 0)
                return false;
        return true;
    }
    public static void main(String[] args) {
        System.out.println("all prime numbers are...");
        for(String arg: args){
            int num = Integer.parseInt(arg);
            if(isPrime(num))
                System.out.println(num);
        }
    }
}
