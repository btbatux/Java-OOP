package classesWithAttributes;

public class Main {
    public static void main(String[] args) {
        // Ürünler Sınıfı
        Product product = new Product();
        product.name = "Laptop";
        product.id = 1;
        product.description = "Asus Laptop";
        product.price = 5999;
        product.stockAmount = 8;
        product.renk = "BEYAZ";

        // Ürün yönetimi sınıfı
        ProductManager productManager = new ProductManager();
        // Ürünlerin niteliklerini parametre olark gönderdik.
        productManager.Add(product);

        System.out.println(product.name);
    }
}
