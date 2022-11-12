package Arrrays5;

import java.util.ArrayList;
import java.util.Arrays;

public class Arrays01 {
    public static void main(String[] args) {

        String arr1[]={"Ali", "Veli","Ayse"};

        System.out.println(arr1);//[Ljava.lang.String;@58ceff1
        System.out.println(Arrays.toString(arr1));//[Ali, Veli, Ayse]

        ArrayList<Integer> list1= new ArrayList<>();
        list1.add(12);
        list1.add(14);
        list1.add(15);
        System.out.println(list1);//[12, 14, 15]
        System.out.println(arr1[0]);
        System.out.println(arr1[arr1.length-1]);//Ayse

        int arr2[]= new int[4];

        System.out.println(Arrays.toString(arr2));//[0, 14, 0, 15]

        arr2[1]=14;
        arr2[3]=15;
        System.out.println(Arrays.toString(arr2));//[0, 14, 0, 15]


    }
}
