//Write a program to read the First Name and Last Name of a person, his weight and height using
//command line arguments. Calculate the BMI Index which is defined as the individual's body mass
//divided by the square of their height.
//        (Hint : BMI = Wts. In kgs / (ht)^2


public class Slip2_a {
    public static void main(String[] args) {
        String fname, lname;
        float weight, height, BMI;
        fname = args[0];
        lname = args[1];
        weight = Float.parseFloat(args[2]);
        height = Float.parseFloat(args[3]);
        BMI = weight/ (height*height);

        System.out.println("name: "+fname+" "+lname);
        System.out.println("BMI: "+BMI);
    }
}
