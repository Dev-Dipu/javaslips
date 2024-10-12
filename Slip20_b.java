//Write a package for Operation, which has two classes, Addition and Maximum. Addition has
//two methods add () and subtract (), which are used to add two integers and subtract two,
//float values respectively. Maximum has a method max () to display the maximum of two
//integers


import Operations.*;

//class Addition{
//    static int add(int a, int b){
//        return a+b;
//    }
//    static float sub(float a, float b){
//        return a-b;
//    }
//}
//
//class Maximum{
//    static int max(int a, int b){
//        return Math.max(a,b);
//    }
//}


public class Slip20_b {
    public static void main(String[] args) {
        System.out.println(Addition.add(5,8));
        System.out.println(Addition.sub(5.8f,2.6f));
        System.out.println(Maximum.max(10, 15));
    }
}
