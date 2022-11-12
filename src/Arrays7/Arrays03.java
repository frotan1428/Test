package Arrays7;

import java.util.Arrays;

public class Arrays03 {
    public static void main(String[] args) {
        int [] array = new int [] {90, 23, 5, 109, 12, 22, 67, 34};
        // verilen bir array'de en kucuk ve en buyuk degerleri  toplamini yazdirin

        Arrays.sort(array);
        System.out.println(Arrays.toString(array));//[5, 12, 22, 23, 34, 67, 90, 109]

        System.out.println(array[0] + array[array.length-1]);//114

        String str="Java gun gectikce guzellesiyor";

        String kelimler[] =str.split(" ");

        System.out.println(Arrays.toString(kelimler));//[Java, gun, gectikce, guzellesiyor]

        String kelimler2[] =str.split("");


        System.out.println(Arrays.toString(kelimler2));//[J, a, v, a,  , g, u, n,  , g, e, c, t, i, k, c, e,  , g, u, z, e, l, l, e, s, i, y, o, r]




    }
}
