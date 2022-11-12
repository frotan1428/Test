package arrays3;

import java.util.Arrays;

public class Arrays04 {
    public static void main(String[] args) {

        int arr[] = {32, 14, 2, 11,8};
        //Bir dizide eleman  olup olmadığı nasıl kontrol edilir

        //1 yontem
        for (int w:arr){
            if (w==14){
                System.out.println(w + " Var");
                break;
            }
        }

        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));//[2, 8, 11, 14, 32]

        System.out.println(Arrays.binarySearch(arr,16));  //-5







        //2. yontem



    }
}
