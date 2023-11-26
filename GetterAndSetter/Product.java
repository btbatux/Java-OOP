package GetterAndSetter;

public class Product {

    // Parametreli Constructor..
    public Product(int id, String descString, double price, int stockAmount, String renk, String name) {
        this._id = id;
        this._description = descString;
        this._price = price;
        this._stockAmount = stockAmount;
        this._renk = renk;
        this._name = name;
    }

    // Boş Constructor..
    public Product() {

    }

    // Nitelikler
    private int _id;
    private String _description;
    private double _price;
    private int _stockAmount;
    private String _renk;
    private String _name;

    // GETTER SETTER (KOD SADECE OKUNABİLİR)
    public String get_kod() {
        return this._name.substring(0, 1) + _id;

    }

    public String get_name() {
        return _name;
    }

    public void set_name(String name) {
        this._name = name;
    }

    public String get_description() {
        return _description;
    }

    public void set_description(String description) {
        this._description = description;
    }

    public double get_price() {
        return _price;
    }

    public void set_price(double price) {
        this._price = price;
    }

    public int get_stockAmount() {
        return _stockAmount;
    }

    public void set_stockAmount(int stockAmount) {
        this._stockAmount = stockAmount;
    }

    public String get_renk() {
        return _renk;
    }

    public void set_renk(String _renk) {
        this._renk = _renk;
    }

    // Sadece Okunabilir
    public int get_Id() {
        return _id;
    }

    // Yazılabilir.
    public void set_Id(int id) {
        this._id = id;
    }

}
