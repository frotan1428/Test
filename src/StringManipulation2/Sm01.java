package StringManipulation2;

import java.util.Scanner;

public class Sm01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("yazi yaziniz");
        String str = scan.nextLine();

        //1 way
//        char ilkKarakter =str.charAt(0);
//        System.out.print(ilkKarakter);
//        char sonKarakter=str.charAt(str.length()-1);
//        System.out.println(sonKarakter);
//
//        System.out.println(""+ ilkKarakter + sonKarakter);//

        //2 way

        String ilkKarakter1= str.substring(0,1);
        System.out.print(ilkKarakter1);
        String sonKarakter = str.substring(str.length()-1);
        System.out.println(sonKarakter);











    }
}
