package chapter18_generic;

public class ProductController {
    public static void main(String[] args) {
        Product<String> product1 = new Product<>("Laptop", "Intel i7, 16GB RAM, 512GB SSD");
        System.out.println(product1);

        Product<Double> product2 = new Product<>("SmartPhone", 799.99);
        System.out.println(product2);

        Product<Boolean> product3 = new Product<>("Available", true);
        System.out.println(product3);
    }
}
