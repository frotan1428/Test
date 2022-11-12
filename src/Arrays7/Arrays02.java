package Arrays7;

import java.util.ArrayList;
import java.util.Arrays;

public class Arrays02 {

    public static void main(String[] args) {

        int [] array = new int [] {90, 23, 5, 109, 12, 22, 67, 34};// 90,23,5,.....

        //1 yontem
        for (int i=0; i<array.length; i++){
            System.out.print(array[i] + " ");//90 23 5 109 12 22 67 34
        }

        System.out.println();
        for (int x:array){
            System.out.print(x+ " ");//90 23 5 109 12 22 67 34
        }

        //Bir eleman dizide olup olmadığı nasıl kontrol edilir

        //1 yontem

        for (int w:array){
            if (w==120){
                System.out.println(w+ " var");//90 var
                break;
            }
        }

        Arrays.sort(array);
        System.out.println(Arrays.toString(array));//[5, 12, 22, 23, 34, 67, 90, 109]

        System.out.println(Arrays.binarySearch(array,23));//3

        System.out.println(Arrays.binarySearch(array,120));//--9



    }
}
