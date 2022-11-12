package arrays3;

public class Arrays02 {
    public static void main(String[] args) {

        int arr[]= {3,5,6,1,9,45,25,4,9,0};

        // 1way

        for (int i=0;i<arr.length; i++){
            System.out.print(arr[i] +" ");
        }

        //
        System.out.println();

        for (int w : arr){

            System.out.print(w +" ");
        }

    }
}
