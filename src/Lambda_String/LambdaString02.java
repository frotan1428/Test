package Lambda_String;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class LambdaString02 {
    public static void main(String[] args) {
        List<String> l=new ArrayList<>();
        l.add("Java");//* java *
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
        System.out.println(wordStartWithDC(l));
        printStringWithStar(l);
        System.out.println(OrderElements(l));
        deleteL(l);
       printEContainsElements(l);
       firstLetters3Times(l);

    }
    // S1: Create new  list from the elements the first letter  has d or c

    public static List<String> wordStartWithDC(List<String> l){
      return   l.stream().filter(t-> t.startsWith("t")|| t.startsWith("i")).collect(Collectors.toList());

    }

     //S2:  print by adding an asterisk to the beginning and end of all elements.

    public static void printStringWithStar(List<String> l){
        l.stream().map(t-> "*" + t + "*").forEach(Methods::printInNextLineWithSpace);
    }

    ////S3: order the element list alphabetically

    public static List<String> OrderElements(List<String> l){
        System.out.println();
        return l.stream().sorted().collect(Collectors.toList());

    }

    //S4:  Delete l letter from the list

    public static  void  printEContainsElements(List<String> l){
        System.out.println();
//        return  l.stream().filter(t-> t.contains("e")).collect(Collectors.toList());
        l.stream().map(t-> t.replaceAll("l" ,"")).forEach(t-> System.out.println(t +" "));

    }
        // omer 's way: delete elements contains l
    public static void deleteL(List<String> l){
        l.removeIf(t-> t.contains("l"));
        System.out.println(l);
    }


    // S6 :  repeat the first letter 3 times and write it like jjjava

    public static void firstLetters3Times(List<String> l){
        System.out.println();
        l.stream().map(t->
                t.substring(0,1).toUpperCase() + t.substring(0,1).toLowerCase() +t.toUpperCase()).forEach(t-> System.out.println(t+ " "));
    }

















}
