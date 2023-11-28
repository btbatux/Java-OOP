package overriding;

public class OgretmenKrediManager extends BaseKrediManager {

    public double hesapla(double tutar) {
        double sonuc = tutar * 1.21;
        System.out.println(+tutar + " Öğretmen Kredi Faiz Sonuç: " + sonuc);
        return sonuc;

    }
}
