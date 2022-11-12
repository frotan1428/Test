package typecastingwrapperclass;

public class WrapperClass01 {
    public static void main(String[] args) {

        /*

                   Primitive         Wrapper
                     byte     ==>    Byte
                     short    ==>    Short
                     ** int   ==>    Integer
                     long     ==>    Long
                     float    ==>    Float
                     double   ==>    Double
                     boolean  ==>    Boolean
                     ** char  ==>    Character
         */


            byte primitiveBye=12;
            Byte wrpperByte=12;

        //Example 1: byte data type'inin en kucuk ve en buyuk degerlerini ekrana yazdiriniz.

        System.out.println(Byte.MIN_VALUE);//-128
        System.out.println(Byte.MAX_VALUE);//127
        //Example 2: short, int, long data type'larinin en buyuk ve en kucuk degerlerini ekrana yazdiriniz
//
//        System.out.println(Short.MAX_VALUE);
//        System.out.println(Short.MIN_VALUE);
//
//        System.out.println(Integer.MIN_VALUE);
//        System.out.println(Integer.MAX_VALUE);
//
//        System.out.println(Long.MIN_VALUE);
//        System.out.println(Long.MAX_VALUE);
//        System.out.println(Integer.min(4,6));


        //Example 3: byte data type'inin en kucuk ve en buyuk degerlerini toplami  yazdiriniz.

        System.out.println(Byte.MAX_VALUE+Byte.MIN_VALUE);//-1

        int min =Byte.MIN_VALUE;
        int max= Byte.MAX_VALUE;
        System.out.println(max+min);//-1
        int toplam=min+max;
        System.out.println(toplam);//-1



        int i=13;
        Integer Wi=i;
        System.out.println(Wi);


        Integer w2=13;
        int i2=w2;
        System.out.println(i2);


        Byte Wb=12;
        byte b=Wb;










    }
}
