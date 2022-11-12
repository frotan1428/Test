package IFStatements1;

import java.util.Scanner;

public class If01 {

    public static void main(String[] args) {
        // kullanicidan yasini isteyin
        // 65 veya daha buyukse emekli olabilirsin
        // 65'den kucukse emekli olamazsin yazdirin

        Scanner input = new Scanner(System.in);
        System.out.println("Yasinizi giriniz..");
        int yas = input.nextInt();

        if (yas>65){
            System.out.println("emekli olabilirsin");
        }else
            System.out.println("emekli olamazsin yazdirin");
            System.out.println(65-yas +" sen daha calisabilir sin ");



    }
}
