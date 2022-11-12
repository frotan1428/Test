package typecastingwrapperclass;

public class TypeCasting01 {

    public static void main(String[] args) {

       // byte < short < int < long < float < double

        byte b=17;
        int i=b;

        System.out.println(i);//

        double d=1.3;
        short s= (short)d;
        System.out.println(s);//1

        //Example 3: short'u 257  byte 'a ceviren kodu yaziniz

        short s1=250;
        byte b1=(byte)s1;   // 256    --- -128    0  127

        System.out.println(b1);

        //Example 4: byte 'u 23  int  'e  ceviren kodu yaziniz

        byte yas=23;
        int yeniYas=yas;
        System.out.println(yeniYas);//23

        // Example 5: float'i byte yapan kodu yaziniz. 12.5?

        float price =12.5f;
        byte  newprice = (byte)price;
        System.out.println(newprice);//1

    }
}
