package AkilliCihaz;

import static AkilliCihaz.parcaTipi.eyleyici;
import static AkilliCihaz.parcaTipi.sicaklikAlgilayici;

public class ParcaFactory implements IParcaFactory{
    public Observer parcaOlustur(parcaTipi tip) {
        Observer parca = null;
        switch (tip)
        {
            case eyleyici:
                parca = new Eyleyici();
                break;
            case sicaklikAlgilayici:
                parca = new SicaklikAlgilayici();
                break;
        }
        return parca;
    }
}
