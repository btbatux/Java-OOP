package NesneYonelimliProgramlama;

public class Main {

    public static void main(String[] args) {

        // Nesne tanımlama
        // New Car ram'de o nesne için yer ayırır.
        Car car = new Car("Renault", "Megane", "Black", 100, 145000);
        Car car2 = new Car("Ford", "Focus", "Blue", 130, 233000);
        // car = car2;
       
        car.printStates();
        car2.printStates();

    }
}

/*
 * 
 * car.brand = "Ford";
 * car2.brand = "Renault";
 * 
 * car.model = "Focus";
 * car2.model = "Megane";
 * 
 * car.color = "Siyah";
 * car2.color = "Gri";
 * 
 * car.price = 243000;
 * car2.price = 134000;
 * 
 * car.speed = 100;
 * car2.speed = 140;
 * 
 * // Hız arttır
 * car.speedUp(50);
 * car2.speedUp(40);
 * // Hız azalt
 * car.applyBrakes(50);
 * car2.applyBrakes(40);
 * // Nitelikleri ekrana yazdır.
 * car.printStates();
 * car2.printStates();
 * 
 */