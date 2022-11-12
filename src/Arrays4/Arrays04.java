package Arrays4;

import java.util.Arrays;

public class Arrays04 {
    public static void main(String[] args) {

        String str="Java gun gectikce guzellesiyor";

        String kelimler[]= str.split(" ");
        System.out.println(Arrays.toString(kelimler));//[Java, gun, gectikce, guzellesiyor];


        String kelimler2[]= str.split("");
        System.out.println(Arrays.toString(kelimler2));//[J, a, v, a,  , g, u, n,  , g, e, c, t, i, k, c, e,  , g, u, z, e, l, l, e, s, i, y, o, r]
        String kelimle3[]= str.split("gectikce");
        System.out.println(Arrays.toString(kelimle3));//[Java gun ,  guzellesiyor]


    }
}
