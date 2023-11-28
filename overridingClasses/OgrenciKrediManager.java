package overridingClasses;

public class OgrenciKrediManager extends BaseKrediManager {

    public double hesapla(double tutar) {
        double sonuc = tutar * 0.88;
        System.out.println(+tutar + " Öğrenci Kredi Faiz Sonuç: " + sonuc);
        return sonuc;
    }
}
