package stringbuilder;

import java.util.Arrays;

public class StringBuilder02 {
    public static void main(String[] args) {

        StringBuilder sb1= new StringBuilder("Java");
        StringBuilder sb2= new StringBuilder("java");
        //If the first one comes before the second one the result will be negative

        System.out.println(sb1.compareTo(sb2));//

        System.out.println(sb1.equals(sb2));//false
        System.out.println(sb1.equals(sb1));//ture

        System.out.println(sb1.toString().equals(sb2.toString()));//true =>  Java Java
        System.out.println(sb1.toString().equals(sb2.toString()));//false => Java java

        //System.out.println(sb1.deleteCharAt(3)); //jav
      //  System.out.println(sb1.delete(1,2));//jva

        //JAVA

        System.out.println(sb1.toString().toUpperCase());//JAVA
        int[] intArray = new int[5];
        System.out.println(Arrays.toString(intArray));


    }
}
