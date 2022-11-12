package Lambda_String;

import java.util.ArrayList;
import java.util.List;

public class LambadaString01 {

    public static void main(String[] args) {

        List<String> l=new ArrayList<>();
        l.add("Java");
        l.add("was");
        l.add("fun");
        l.add("to");
        l.add("leran ,");
        l.add("it was");
        l.add("even");
        l.add("more fun");
        l.add("when");
        l.add("it come");
        l.add("to lamda");
        printElementsStructure(l);
        printElementsFuncationalP(l);
        printElementsFuncationalWithMethodRefrence(l);



    }

    //1)Create a method to print the elements on the console in the same line with a space
    //between two each  elements. (Structured P)

    public static void printElementsStructure(List<String> list1){

        for (String w:list1){
            System.out.print(w+ " ");
        }
    }
    //1)Create a method to print the list elements on the console in the same line with a space
    //  between two consecutive elements.(Functional)

    public static void printElementsFuncationalP(List<String> list2){
        System.out.println();
        list2.stream().forEach(t-> System.out.print(t+ " "));
    }
    public static void printElementsFuncationalWithMethodRefrence(List<String> list2){
        System.out.println();
        list2.stream().forEach(Methods::printInNextLineWithSpace);
    }


}
