package Assignment3_3;
import java.time.LocalDate;
import java.util.*;
public class Driver {
    public static void main(String[] args) {
        Electronics laptop = new Electronics(1, "Laptop", 100659.05,
                "Ryzen 5, 32GB RAM, 512GB SSD", 24);

        Clothing tshirt = new Clothing(2, "T-shirt", 500.00,
                "Turtle Neck", "36", "Denim");

        Groceries rice = new Groceries(3, "rice", 200.00,
                "Premium", LocalDate.now().plusMonths(12));

        //product
        List<Product> catalog = new ArrayList<>();
        catalog.add(laptop);
        catalog.add(tshirt);
        catalog.add(rice);

        //all product
        System.out.println("----------Product Catalog----------");
        for (Product p : catalog) {
            p.displayProductDetails();
            System.out.println("-----------------------");
        }
    }
}