package IFStatements1;

import java.util.Scanner;

public class if02 {
    public static void main(String[] args) {

        // kullanicidan mail adresini isteyin @ isareti icermiyorsa gecersiz yazdirin
        // iceriyorsa mailiniz kabul edildi yazdirin

        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen mailiniz yazin");


        String mail=input.nextLine();

        if (mail.indexOf("@")==(-1)){
            System.out.println("Gcersiz");

        }else
            System.out.println("mailiniz kabul edildi");


    }
}
