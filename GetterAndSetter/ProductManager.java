package GetterAndSetter;

public class ProductManager {

    // product parametresinde ürün nitelikleri var.
    public void Add(Product product) {
        System.out.println("Ürün Eklendi Kodu: " + product.get_kod() + " Ürün İsmi: " + product.get_name());
    }

}