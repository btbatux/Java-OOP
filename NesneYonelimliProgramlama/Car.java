package NesneYonelimliProgramlama;

public class Car {

    public String brand;
    public String model;
    public String color;
    public int speed;
    public int price;

    public Car(String brand, String model, String color, int speed, int price) {
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.speed = speed;
        this.price = price;
    }

    // Hızlanma
    public void speedUp(int increment) {
        this.speed = this.speed + increment;
    }

    // Yavaslama
    public void applyBrakes(int decrement) {
        this.speed = this.speed - decrement;
    }

    // Bilgileri Görüntüle
    public void printStates() {
        System.out.println("Marka: " + this.brand + " " + "Model: " + this.model + " " + "Renk: " + this.color + " "
                + "Hız: " + this.speed + " " + " Fiyat: " + this.price);
    }

}
