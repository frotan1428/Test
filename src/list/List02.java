package list;

import java.util.ArrayList;
import java.util.List;

public class List02 {

    //Create a String ArrayList, add 5 elements into it, remove a specific element
    public static void main(String[] args) {
//
//        List<Integer> al5= new ArrayList<>();
//        al5.add(12);
//        al5.add(1);
//        al5.add(14);
//        al5.add(15);
//        al5.add(16);
//
//        System.out.println(al5);//[12, 1, 14, 15, 16]
//
//
//
//        System.out.println(al5.remove(4));
//        System.out.println(al5);//[12, 14, 15, 16]//[12, 1, 14, 15]


        //Create a String ArrayList, add 5 elements into it, remove the elements whose lengths are less than 5

        List<String> al7 = new ArrayList<String>();
        al7.add("Christian");
        al7.add("Alex");
        al7.add("Tommy");
        al7.add("Adriana");
        al7.add("Tomttt");
        System.out.println(al7);//[Christian, Alex, Tommy, Adriana, Tomtt5]

        List<String> newList= new ArrayList<>(al7);

        for (String w:newList){
            if (w.length()<5){
                al7.remove(w);
            }
        }
        System.out.println(al7);

        // //Create 5 an Integer List  and add 5 elements into it.


    }
}
