package AkilliCihaz;

import java.util.Scanner;

public class AgArayuzu {

    public void Arayuz()
    {
        Scanner a = new Scanner(System.in);
        String KullaniciAdi;
        String Sifre;
        AnaIslemPlatformu sogutucuCihazi = new AnaIslemPlatformu();
        while(true)
        {
            System.out.println("******Sistem Girişi******");
            System.out.println("Sisteme giriş yapmak için lütfen kullanıcı adı ve şifrenizi giriniz.");
            System.out.print("Kullanıcı Adı: ");
            KullaniciAdi = a.next();
            System.out.print("Şifre: ");
            Sifre = a.next();
            System.out.println("Doğrulanıyor...");
            if(SogutucuVeriTabani.getInstance().Kontrol(KullaniciAdi , Sifre))
            {
                System.out.println("Giriş başarılı.");
                break;
            }


            else
                System.out.println("Kullanıcı adı veya şifre yanlış.");
        }

        // MENU KISMI
        while(true)
        {
            int secim;
            Scanner scanner = new Scanner(System.in);
            System.out.println("******************");
            System.out.println("   *ANA MENÜ*    ");
            System.out.println("1-) Soğutucuyu Aç");
            System.out.println("2-) Soğutucuyu Kapat");
            System.out.println("3-) Sıcaklık Görüntüle");
            System.out.println("4-) Çıkış Yap");
            System.out.print("Secim: ");
            secim = scanner.nextByte();

            switch (secim) {
                case 1:
                    System.out.println("1. seçenek seçildi.");
                    sogutucuCihazi.sogutucuAc();
                    break;
                case 2:
                    System.out.println("2. seçenek seçildi.");
                    sogutucuCihazi.sogutucuKapat();
                    break;
                case 3:
                    System.out.println("3. seçenek seçildi.");
                    sogutucuCihazi.sicaklikGonder();
                    break;
                case 4:
                    System.out.println("4. seçenek seçildi.");
                    System.out.println("Çıkış yaptınız.İyi günler dileriz");
                    System.exit(1);
                    break;
            }
        }
    }
}