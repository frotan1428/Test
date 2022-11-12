package Arrays7;

public class Arrays04 {
    public static void main(String[] args) {
// Verilen array'de istenen bir elementin var olup olmadigini true/false yazdirarak
        // gosteren bir method olusturun

        int arr[]= {3,5,6,1,9,45,25,4,9,0};
        int istenenSayi=125;
        istenenSayiVarMi(arr,istenenSayi);

    }

    public static void istenenSayiVarMi(int [] arr, int intistenenSayi ){
        boolean sonuc=false;
        for (int i=0; i<arr.length; i++){
            if (arr[i]==intistenenSayi){
                sonuc=true;
                break;
            }
        }
        System.out.println(sonuc);//true === 2 ==> false


    }
}
