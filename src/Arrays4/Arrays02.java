package Arrays4;

import java.util.Arrays;

public class Arrays02 {
    public static void main(String[] args) {

//        int [] array = new int [] {90, 23, 5, 109, 12, 22, 67, 34};
//
//        // 1 way
//        for (int i=0; i<array.length; i++){
//            System.out.print(array[i] +" ");
//        }
//        System.out.println();
//        for (int w:array){
//            System.out.print(w+ " ");
//        }
      //Bir eleman dizide olup olmadığı nasıl kontrol edilir


        // String  length()
        // String  length

        System.out.println();
        int arr[] = {32, 14, 2, 11,8};

        for (int w:arr){
            if (w==14){
                System.out.println(w+ " var");
                break;
            }
        }

        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));//[2, 8, 11, 14, 32]

        System.out.println(Arrays.binarySearch(arr,35));//3==?> -6










    }
}
