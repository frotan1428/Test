package list;

import java.util.ArrayList;
import java.util.List;

public class List03 {
    public static void main(String[] args) {

        List<Integer> al1 = new ArrayList<>();
        al1.add(12);//30
        al1.add(5);//777
        al1.add(13);
        al1.add(9);//777
        al1.add(6);
        System.out.println(al1);//[11, 5, 13, 15, 14]
//
        List<Integer> al2 = new ArrayList<>();
         al2.add(12);
//        al1.addAll(al2);
//        System.out.println(al1);//
//        al2.addAll(al1);
//        System.out.println(al2);//[12, 11, 5, 13, 15, 14, 12];
//        boolean b1= al1.contains(60);
//        System.out.println(b1);//true

         al1.removeAll(al2);
         System.out.println(al2);//[30, 13, 9, 14]

        System.out.println(al1.set(0,30));
        System.out.println(al1);//[30, 13, 15, 14]
        for (int i=0; i<al1.size(); i++){
            if (al1.get(i)<10) {
                al1.set(i, 777);
            }
        }
        System.out.println(al1);//[30, 13, 777, 777]

        ArrayList<String> sl1=new ArrayList<>();
        sl1.add("lamba");
        sl1.add("Java");

        ArrayList<String> sl2=new ArrayList<>();
        sl2.add("Java");
        sl2.add("lamba");


        boolean r1= sl2.equals(sl1);
        System.out.println(r1);//true




















    }
}
