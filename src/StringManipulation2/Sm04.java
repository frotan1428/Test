package StringManipulation2;

public class Sm04 {
    public static void main(String[] args) {
//Örnek: String  tüm boşluk karakterlerini siliniz

        String str = "Ali!  136 yasinda  , 155 yasında olduğunu dusunuyorum.";

        System.out.println(str.replaceAll(" ",""));//Ali!13yasinda,15yasındaolduğunudusunuyorum.

    //Örnek6: Tüm harfleri  !  değiştirin code yaziniz.

        String harfsiz = str.replaceAll("[A-Za-z]","!");
        System.out.println(harfsiz);//Örnek: Tüm harfleri ! değiştirin code yaziniz
        String harf1 = str.replaceAll("[^A-Za-z]","*");
        System.out.println(harf1);//Ali******yasinda*******yas*nda*oldu*unu*dusunuyorum*

       // Örnek7: tum Rakamları * olarak değiştirin

        System.out.println(str.replaceAll("[0-9]","*"));
        //
        System.out.println(str.replaceAll("\\d","").length());








    }
}
