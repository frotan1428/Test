package arrays3;

import java.util.Arrays;

public class Arrays05 {
    public static void main(String[] args) {

        String str="Java gun gectikce guzellesiyor";

        String kelimeler[] = str.split(" ");//[Java, gun, gectikce, guzellesiyor]
        System.out.println(Arrays.toString(kelimeler));

        String kelimele2[] = str.split("");

        System.out.println(Arrays.toString(kelimele2));//[J, a, v, a,  , g, u, n,  , g, e, c, t, i, k, c, e,  , g, u, z, e, l, l, e, s, i, y, o, r]


        String kelimele3[] = str.split("gectikce");
        System.out.println(Arrays.toString(kelimele3));//[Java gun ,  guzellesiyor]

    }
}
