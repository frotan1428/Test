package StringManipulation2;

public class Sm03 {
    public static void main(String[] args) {

        // Soru 4) Kullanicidan email adresini girmesini isteyin,
        // mail @gmail.com icermiyorsa  “lutfen gmail adresi giriniz”,
        // @gmail.com ile bitiyorsa  “Email adresiniz kaydedildi “ ,
        // @gmail.com ile bitmiyorsa "lutfen yazimi kontol edin" yazdirin
        // frotan@gmail.com

        String email = "frotan";
        String aranaMetin = "@gmail.com";

        if (!email.contains(aranaMetin)){
            System.out.println("lutfen gmail adresi giriniz");
        }else if(email.endsWith(aranaMetin)){
            System.out.println("Email adresiniz kaydedildi ");
        }else{
            System.out.println("lutfen yazimi kontol edin");
        }


    }
}
