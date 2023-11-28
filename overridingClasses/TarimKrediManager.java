package overridingClasses;

public class TarimKrediManager extends BaseKrediManager {

    public double hesapla(double tutar) {
        double sonuc = tutar * 0.99;
        System.out.println(+tutar + " Tarım Kredi Faiz Sonuç: " + sonuc);
        return sonuc;

    }
}
