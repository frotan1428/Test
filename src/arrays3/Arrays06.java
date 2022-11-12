package arrays3;

public class Arrays06 {
    public static void main(String[] args) {

        // Verilen array'de istenen bir elementin var olup olmadigini true/false method ile yazdirarak
        int arr[]= {3,5,6,1,9,45,25,4,9,0};
        int istenenSayi=100;
        istenenElemanVarMI(arr,istenenSayi);
    }

    public static void istenenElemanVarMI(int [] arr,int istenenSayi){

        boolean sonuc=false;

        //1way

        for (int i=0;i<arr.length; i++){
            if (arr[i]==istenenSayi){
                sonuc=true;
                break;
            }
        }

        System.out.println(sonuc);//100 ==> false

        for (int w:arr){
            if (w==istenenSayi){
                sonuc=true;
                break;
            }
        }

        System.out.println(sonuc);//100 ==> false

    }

}
