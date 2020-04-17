package day56;

import java.util.*;

public class StoreTest {
    public static void main(String[] args) {
        Store s1 = new Store();
        System.out.println(s1.name);
        System.out.println(s1.allProducts);
        List<Product> denisList = Arrays.asList(
                new Product("cookie", 38),
                new Product("tea", 4),
                new Product("cofee", 5));
        Store s2 = new Store("Denis Store", denisList);
        System.out.println("s2= "+s2);

        s2.displayProducts();
        System.out.println("How many? "+s2.getProductCount() );
        System.out.println("Exists? " + s2.checkIfProductExists(new Product("cookie", 3)) );

        System.out.println(s2.getAllProductsWithMoreThanAveragePrice());
    }
}
