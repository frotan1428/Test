package Arrays4;

import java.util.Arrays;

public class Arrays03 {
    public static void main(String[] args) {

          // verilen bir array'de en kucuk ve en buyuk degerleri yazdirin
             int [] array = new int [] {90, 23, 5, 109, 12, 22, 67, 34};

             Arrays.sort(array);
        System.out.println(Arrays.toString(array));//[5, 12, 22, 23, 34, 67, 90, 109]

        System.out.println(array[0] + " -" +array[array.length-1]);//5 - 109




               String arr[]={"S","b","A","c"};
               Arrays.sort(arr);
            System.out.println(Arrays.toString(arr));//[A, S, b, c]

    }
}
