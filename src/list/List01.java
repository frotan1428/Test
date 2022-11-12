package list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class List01 {

    public static void main(String[] args) {

//        ArrayList<Integer> list1= new ArrayList<>();
//
//        ArrayList<Integer> list2= new ArrayList<Integer>();
//
//        List<Integer> list3= new ArrayList<Integer>();
//
//        System.out.println(list3);
//        list3.add(2);
//        list3.add(30);
//        list3.add(-10);
//        System.out.println(list3);//[2, 30, -10]
//        list3.add(1,40);
//        System.out.println(list3);//[2, 40, 30, -10]
//
//        System.out.println(list3.size());//4
//
//        //How to check if an ArrayList is empty or not
//        //1.way
//        if (list3.size()==0){
//            System.out.println("it is empty");
//        }else {
//            System.out.println("it is not empty");
//        }

//        System.out.println(list3.isEmpty());//flase
//        // 2 way
//        System.out.println(list2.isEmpty());//true
//
//                // 3 way
//        if (list3.isEmpty()){
//            System.out.println("it is empty");
//        }else {
//            System.out.println("it is not empty");
//        }

        //How to check if an ArrayList has space in it

        List <String> al4= new ArrayList<>();

        al4.add("a");
        al4.add(" ");
        al4.add("e");
        al4.add("f");
        System.out.println(al4);//[a,  ]


        for (String w:al4){
            if (w.equals("")){
                System.out.println("there is a space");
                break;
            }
        }















    }
}
