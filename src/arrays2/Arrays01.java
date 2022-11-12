package arrays2;

import java.util.Arrays;

public class Arrays01 {

    public static void main(String[] args) {

        String arr1[]={"Ali", "Veli","Ayse"};//0

        System.out.println(arr1);//[Ljava.lang.String;@58ceff1
        System.out.println(Arrays.toString(arr1));//[Ali, Veli, Ayse];

        System.out.println(arr1[1]);

        int arr2[]= new int[4];
        System.out.println(Arrays.toString(arr2));//[0, 0, 0, 0] ==[0, 12, 0, 15];

        arr2[1]=12;
        arr2[3]=15;
        System.out.println(Arrays.toString(arr2));//[0, 12, 0, 15]
        System.out.println(arr2.length);//4
        System.out.println(arr2.length-1);







    }
}
