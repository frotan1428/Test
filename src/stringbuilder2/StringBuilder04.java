package stringbuilder2;

public class StringBuilder04 {
    public static void main(String[] args) {

        StringBuilder sb1= new StringBuilder("Ali Can");
        StringBuilder sb2= new StringBuilder("Ali Can");

        System.out.println(sb1.compareTo(sb2));//0
        System.out.println(sb2.compareTo(sb1));//32

        System.out.println(sb1.compareTo(sb2));//-32

        System.out.println(sb1.toString().equals(sb2.toString()));//false==> true

          //a.compareTo(b) method'u i)StringBuilder'lar tamamiyla ayni ise 0 verir.
          //     ii)"a" alfabetik sirada "b" den sonra gelirse pozitif olarak aradaki 
                  //alfabetik siralama farkini gosterir
          //    iii)"a" alfabetik sirada "b" den once gelirse negatif olarak aradaki 
                    //alfabetik siralama farkini gosterir


    }
}
