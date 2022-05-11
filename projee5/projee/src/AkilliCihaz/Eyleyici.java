package AkilliCihaz;

public class Eyleyici implements IEyleyici{

    public boolean sogutucuAcik;

    public Eyleyici(){
        sogutucuAcik = false;
    }

    @Override
    public void sogutucuAcikUyariMesaji()
    {
        System.out.println("UYARI: Soğutucu zaten açık.Bu yüzden bu işlem gerçekleştirilemez.");
    }
    @Override
    public void sogutucuKapaliUyariMesaji()
    {
        System.out.println("UYARI: Soğutucu zaten kapalı.Bu yüzden bu işlem gerçekleştirilemez.");
    }

    @Override
    public void sogutucuAc() {
        sogutucuAc(this);
    }


    @Override
    public void sogutucuKapat() {
        sogutucuKapat(this);
    }


    public void sogutucuAc(Observer observer)
    {
        observer.Duyuru();
        this.sogutucuAcik = true;
    }


    public void sogutucuKapat(Observer observer)
    {
        observer.Duyuru();
        this.sogutucuAcik = false;
    }

    @Override
    public void Duyuru() {
        if(this.sogutucuAcik) {
            System.out.println("Soğutucu Kapatılıyor...");
            System.out.println("Soğutucu Kapatıldı");
        }
        else {
            System.out.println("Soğutucu Açılıyor...");
            System.out.println("Soğutucu açıldı.");
        }
    }
}