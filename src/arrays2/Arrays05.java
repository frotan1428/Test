package arrays2;

public class Arrays05 {
    public static void main(String[] args) {

        // Verilen array'de istenen bir elementin var olup olmadigini  method true/false yazdirarak

        int arr[]= {3,5,6,1,9,45,25,4,9,0};
        int isteneSayi=100;
        istenenElemanVarMi(arr,isteneSayi);


    }

    public static void istenenElemanVarMi(int arr[] ,int isteneSayi){

        boolean sonuc= false;
        for (int i=0; i<arr.length; i++){
            if (arr[i]==isteneSayi){
                sonuc=true;
                break;
            }
        }
        System.out.println(sonuc);

    }
}
