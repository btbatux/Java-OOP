package InheritanceDemo;

public class KrediUI {

    public void KrediHesapla(OgretmenKrediManager ogretmenKrediManager)

    { // Arayüz
        ogretmenKrediManager.Hesapla();
        ogretmenKrediManager.ogretmenKredisi();

    }

    public void KrediHesapla(TarimKrediManager tarimKrediManager) {
        tarimKrediManager.Hesapla();
        tarimKrediManager.tarimKredisi();

    }

    public void KrediHesapla(AskerKrediManager askerKrediManager) {
        askerKrediManager.Hesapla();
        askerKrediManager.askerKredisi();
    }
}
