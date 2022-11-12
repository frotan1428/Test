package arrays3;

import java.util.Arrays;

public class Arrays03 {

    // dizideki  kucuk  element ve buyuk  elemen toplami yaziniz

    public static void main(String[] args) {

        int [] array = new int [] {90, 23, 5, 109, 12, 22, 67, 34};//5+109=114;

        Arrays.sort(array);
        System.out.println(Arrays.toString(array));//[5, 12, 22, 23, 34, 67, 90, 109]
        System.out.println(array[0]+ array[array.length-1]);//114




    }
}
