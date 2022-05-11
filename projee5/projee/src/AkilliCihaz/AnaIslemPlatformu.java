package AkilliCihaz;

public class AnaIslemPlatformu{
    ParcaFactory parcaFactory = new ParcaFactory();
    ISicaklikAlgilayici olcer =(ISicaklikAlgilayici) parcaFactory.parcaOlustur(parcaTipi.sicaklikAlgilayici);
    IEyleyici eyleyici =(IEyleyici) parcaFactory.parcaOlustur(parcaTipi.eyleyici);
    boolean sogutucuAcik = false;

    public void sogutucuAc()
    {
        if(sogutucuAcik == false)
        {
            eyleyici.sogutucuAc();
            sogutucuAcik = true;
        }
        else
            eyleyici.sogutucuAcikUyariMesaji();
    }

    public void sogutucuKapat()
    {
        if(sogutucuAcik == true)
        {
            eyleyici.sogutucuKapat();
            sogutucuAcik = false;
        }
        else
            eyleyici.sogutucuKapaliUyariMesaji();
    }

    public void sicaklikGonder()
    {
        olcer.sicaklikOku();
    }

}