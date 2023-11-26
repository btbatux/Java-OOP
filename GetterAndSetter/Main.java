package GetterAndSetter;

public class Main {
    public static void main(String[] args) {

        Product product = new Product(99, "Laptop Asus", 12999, 33, "Siyah", "Asus");

        // Ürün yönetimi sınıfı nesne oluştur.
        ProductManager productManager = new ProductManager();
        // product parametre olarak gönderdik ürün nitelikleri barınıyor.
        productManager.Add(product);

    }
}
