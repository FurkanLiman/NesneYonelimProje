package AkilliCihaz;

import java.util.Random;

public class SicaklikAlgilayici implements ISicaklikAlgilayici {

    private int sicaklik;
    private Random rnd = new Random();

    public SicaklikAlgilayici()
    {
        sicaklik = rnd.nextInt(15) + 15;
    }
    @Override
    public void sicaklikOku()
    {
        sicaklikOku(this);
    }
    public void sicaklikOku(Observer observer) {
        observer.Duyuru();
    }

    @Override
    public void Duyuru(){
        System.out.println("Sıcaklık: " + this.sicaklik);
    }
}