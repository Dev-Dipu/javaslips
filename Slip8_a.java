//Create a class Sphere, to calculate the volume and surface area of sphere.
//(Hint : Surface area=4*3.14(r*r), Volume=(4/3)3.14(r*r*r))


class Sphere {
    double radius;

    Sphere(double radius) {
        this.radius = radius;
    }

    double surfaceArea() {
        return 4 * 3.14 * radius * radius;
    }

    double volume() {
        return (4.0 / 3.0) * 3.14 * radius * radius * radius;
    }
}

public class Slip8_a{
    public static void main(String[] args) {
        Sphere s = new Sphere(5);
        System.out.println("Surface Area: " + s.surfaceArea());
        System.out.println("Volume: " + s.volume());
    }
}