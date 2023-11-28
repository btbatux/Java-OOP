package abstractClasses;

public class Main

{
    public static void main(String[] args) {

        GameCalculator gameCalculator = new ManGameCalculator();
        gameCalculator.hesapla();

        // GameCalculator[] gameCalculators = new GameCalculator[] { new
        // ManGameCalculator(), new WomanGameCalculator(),
        // new KidsGameCalculator() };

        // for (GameCalculator calculator : gameCalculators) {
        // calculator.hesapla();
        // }

        GameCalculator womanCalculator = new WomanGameCalculator();
        womanCalculator.hesapla();
    }
}
