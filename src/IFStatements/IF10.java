package IFStatements;

import java.util.Scanner;

public class IF10 {

    //BU SORU BENI ASAR
    //1.Soru:Tam isim için dilbilgisi kurallarını kontrol etmek için kodu yazınız.
    //a) Kodunuz "ali Can",  "ali can" için "Baş harflerinde hata" yazmalıdır.
    //b) Kodunuz, aşağıdaki gibi tek kelimeler için "Ad veya soyadı eksik" yazmalıdır.
    //c) "Ali" veya "Can" veya "ali"Kodunuz "ALI CAN" gibi tüm formatlar için "Format hatası" yazmalıdır.
    //d) Kodunuz bir veya daha fazla boşluk (" " veya " " gibi karakterler) için " Isim girilmedi"
    //yazmalıdır.
    //e) Ad, harfler ve boşluktan başka herhangi bir karakteri içeriyorsa, kodunuz "Geçersiz Ad"
    //yazmalıdır.
    //Not : Kısaltmada 1'den fazla hata varsa, ilgili tüm hata mesajları çıktı olarak konsolda görünmelidir.
    // Örneğin; "ali3" için kodunuz "Baş harflerinde hata", "Ad veya soyadı eksik" ve"Geçersiz Ad"
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Isminizi yaziniz");
        String isim = input.nextLine();


        String adIlkHarf = isim.substring(0, 1);
        int boslukIndex = isim.trim().indexOf(" ");

        String adilkh = isim.trim().substring(0, 1);
        boolean adinilkharfibuyukmu = adilkh.charAt(0) >= 'A' && adilkh.charAt(0) <= 'Z';

        String soyIlkHarf = isim.substring(isim.indexOf(" ") + 1, isim.indexOf(" ") + 2);

        boolean soyIlkHarfBuyukMu = soyIlkHarf.charAt(0) >= 'A' && soyIlkHarf.charAt(0) <= 'Z';


        if (boslukIndex == -1) {
            System.out.println("Ad veya soyadı eksik");
        }
        if (!(adinilkharfibuyukmu && !soyIlkHarfBuyukMu)) {
            System.out.println("Baş harflerinde hata");
        }
        if (isim.equals(isim.toUpperCase())) {
            System.out.println("Format hatası");
        }

        if (isim.replaceAll("[a-zA-Z ]", "").replaceAll("\\s", "").length() > 0) {
            System.out.println("Geçersiz Ad");
        }
        if (isim.replaceAll("\\s", "").length() == 0) {

            System.out.println("isim girilmedi");
        }
    }
}
