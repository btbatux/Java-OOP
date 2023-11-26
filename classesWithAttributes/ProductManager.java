package classesWithAttributes;

public class ProductManager {

    public void Add(Product product) {
        System.out.println(product.name + " Ürünü Eklendi, Stok Miktarı " + product.stockAmount);
    }

}
