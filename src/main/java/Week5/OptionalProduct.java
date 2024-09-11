
package week5;

import java.util.Optional;

class Product {
    private String name;
    private Optional<String> description;


    public Product(String name, String description) {
        this.name = name;
        this.description = Optional.ofNullable(description);
    }

    // Constructor without description
    public Product(String name) {
        this.name = name;
        this.description = Optional.empty();
    }


    public void printProductDetails() {
        System.out.println("Product Name: " + name);

        System.out.println("Description: " + description.orElse("No description available"));

        description.ifPresent(desc -> System.out.println("The product has a description: " + desc));

        String upperCaseDesc = description.map(String::toUpperCase).orElse("No description to convert");
        System.out.println("Uppercase Description: " + upperCaseDesc);
    }
}

public class OptionalProduct{
    public static void main(String[] args) {

        Product prod1 = new Product("Laptop", "A high-end gaming laptop");
        Product prod2 = new Product("Mouse");  // Product without description


        System.out.println("Product 1 Details:");
        prod1.printProductDetails();

        System.out.println("\nProduct 2 Details:");
        prod2.printProductDetails();
    }
}
