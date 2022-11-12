package exception;

public class EX02 {
    public static void main(String[] args) {

        //Create a method to find element by index ?
        String arr[]={"Ali","Can","Veli","Han"};
        getAnElementsFromAnArray(arr,2);//veli
        getAnElementsFromAnArray(arr,0);//Ali
        getAnElementsFromAnArray(arr,3);//ArrayIndexOutOfBoundsException==> Index 4 out of bands for length 4

    }
    public static void getAnElementsFromAnArray(String  arr[],int idx){

        System.out.println(arr[idx]);

    }

}
