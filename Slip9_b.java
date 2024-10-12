//Write a program to using marker interface create a class Product (product_id, product_name,
//product_cost, product_quantity) default and parameterized constructor. Create objectsof class
//product and display the contents of each object and Also display the object count.



interface MarkerInterface {}

class Product implements MarkerInterface {
    int product_id;
    String product_name;
    double product_cost;
    int product_quantity;
    static int objectCount = 0;

    Product() {
    }

    Product(int product_id, String product_name, double product_cost, int product_quantity) {
        this.product_id = product_id;
        this.product_name = product_name;
        this.product_cost = product_cost;
        this.product_quantity = product_quantity;
        objectCount++;
    }

    void display() {
        System.out.println("Product ID: " + product_id);
        System.out.println("Product Name: " + product_name);
        System.out.println("Product Cost: " + product_cost);
        System.out.println("Product Quantity: " + product_quantity);
    }

    static void displayObjectCount() {
        System.out.println("Total number of objects created: " + objectCount);
    }
}


class Slip9_b{
    public static void main(String[] args) {
        Product p1 = new Product(101, "Laptop", 50000, 10);
        Product p2 = new Product(102, "Mobile", 15000, 20);
        p1.display();
        p2.display();
        Product.displayObjectCount();
    }
}
