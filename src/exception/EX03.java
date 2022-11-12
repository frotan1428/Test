package exception;

public class EX03 {

    public static void main(String[] args) {
        String st="";
        getNumOfCharacterInString(st);//0

        String s="Ali";
        getNumOfCharacterInString(s);//3

        String t=null;
        getNumOfCharacterInString(t);

    }

    public static void getNumOfCharacterInString(String str){// the name of method should have verb
        try {
            System.out.println(str.length());
        }catch (NullPointerException e){
            System.err.println("issue occurred when I count the number of Character :");
            // e.printStackTrace();// if you want to see details you can use "printStackTrace().
        }



    }
}
