package arrays3;

import java.util.Arrays;

public class Arrays01 {

    public static void main(String[] args) {

        String arr1[]={"Ali", "Veli","Ayse","neriman"};  // veli ==> AliCan

        System.out.println(arr1);
        System.out.println(Arrays.toString(arr1));//[Ali, Veli, Ayse]

        System.out.println(arr1[0]);//Ali
     //   System.out.println(arr1[5]);//ArrayIndexOutOfBoundsException
        System.out.println(arr1[arr1.length-1]);//neriman

        //length;
        System.out.println(arr1.length);//4

        arr1[1]="AliCan";
        System.out.println(Arrays.toString(arr1));//[Ali, AliCan, Ayse, neriman]

        //

        int arr2[]= new int[4];

        System.out.println(Arrays.toString(arr2));//[0, 0, 0, 0]==>[0, 15, 0, 20];
        arr2[1]= 15;
        arr2[3]=20;
        System.out.println(Arrays.toString(arr2));//[0, 15, 0, 20]

    }
}
