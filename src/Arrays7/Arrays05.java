package Arrays7;

import java.util.Arrays;

public class Arrays05 {
    public static void main(String[] args) {


        String cumle= "Nerede o 'hello world' yazdiramayan Ogrenciler?";
        char harf='o';

        // Verilen bir cumlede istenen harfin kac defa kullanildigini yazdiran
        // bir method olusturun
        harfKarakterKackareKullanilmis(cumle,harf);
    }
    public static void harfKarakterKackareKullanilmis(String cumle,char harf){
        int sayi=0;
        String  harfstr= ""+ harf;

        String karekteler[]= cumle.split("");
        System.out.println(Arrays.toString(karekteler));
        for (int i=0; i<karekteler.length; i++){
            if (karekteler[i].equals(harfstr)){
                sayi++;
            }
        }
        System.out.println("aradiginiz " +harf+ "verilern cumle de "+ sayi+ " kare kullnilmis ");

    }
}
