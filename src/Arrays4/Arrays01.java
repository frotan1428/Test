package Arrays4;

import java.util.Arrays;

public class Arrays01 {

    public static void main(String[] args) {

            /*
           1) When you create an array you have to declare the length otherwise you cannot create an array
           2) After declaring the length it is impossible to store more elements in it, this is not good.
           3) Java created another structure to store multiple elements, it is "ArrayLists".
              ArrayLists are flexible in length. It means while you create an ArrayList no need to declare the length.
              After creating ArrayList you may store any number of elements, there is no any restriction about it.
           4) Arrays can contain "primitive" data types and "references" but ArrayLists can contain just "non-primitive" data types
              int ==> Array but Integer ==> ArrayList
        */

        String arr1[]={"Ali", "Veli","Ayse"};
        System.out.println(arr1);//[Ljava.lang.String;@58ceff1
        System.out.println(Arrays.toString(arr1));//[Ali, Veli, Ayse]

        System.out.println(arr1[0]);//Ali
        System.out.println(arr1[2]);//Ayse

        System.out.println(arr1[arr1.length-1]);//Ayse

        int arr2[]= new int[4];

        System.out.println(Arrays.toString(arr2));//[0, 12, 0, 15]

        arr2[1]=12;
        arr2[3]=15;

        System.out.println(Arrays.toString(arr2));//[0, 12, 0, 15]



    }
}
