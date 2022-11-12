package stringbuilder2;

public class StringBuilder02 {

    public static void main(String[] args) {
        StringBuilder sb1=new StringBuilder("Prize dikkat ");

        System.out.println(sb1.length());//27
        System.out.println(sb1.capacity());//43  2*c +2

        sb1.trimToSize();

        System.out.println(sb1.length());//27
        System.out.println(sb1.capacity());//27

        System.out.println(sb1.reverse());//nide takkid ezirP
        System.out.println(sb1.reverse());
        //Prize
        System.out.println(sb1.substring(0,5));//Prize
        System.out.println(sb1.substring(6));//dikkat edin
        System.out.println(sb1.substring(sb1.indexOf(" ")));// dikkat edin

//        System.out.println(sb1);//Prize dikkat edininiz
//
//        System.out.println(sb1.insert(12,"ediniz"));//Prize dikkatediniz iniz

        System.out.println(sb1.replace(13,13,"ediniz"));//Prize dikkat ediniz









    }
}
