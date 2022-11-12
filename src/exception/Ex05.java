package exception;

public class Ex05 {
    public static void main(String[] args) {

        String s = "Hello!";
        getCharacterFromAStringByIndex(s, 2);//l
        //getCharacterFromAStringByIndex(s, 6);//StringIndexOutOfBoundsException ==> String index out of range: 6

        divideTheLengths(s, 1, 3, 1);

    }

    public static void getCharacterFromAStringByIndex(String str, int idx) {
        try {
            System.out.println(str.charAt(idx));
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("An issue occured in character selection ==> " + e.getMessage());
        }
    }

    public static void divideTheLengths(String str, int idx1, int idx2, int idx3) {

        try {
            int firstLength = str.substring(idx1, idx2).length();

            int secondLength = str.substring(idx1, idx3).length();

            System.out.println(firstLength/secondLength);

        } catch (ArithmeticException e) {
            System.out.println("An issue occurred in division ==> " + e.getMessage());
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("An issue occurred in character selection ==> " + e.getMessage());
        }
    }
}


