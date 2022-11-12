package StringBuilder5;

public class StringBuilder02 {
    public static void main(String[] args) {

        StringBuilder sb1=new StringBuilder("Prize cok dikkat  ");//ediniz
        //sb1.append("ediniz");
        System.out.println(sb1.length());//16
        System.out.println(sb1.capacity());//32  === 2*16+2

        System.out.println(sb1.reverse());
        System.out.println(sb1.reverse());

        System.out.println(sb1.substring(0,5));//Prize

        System.out.println(sb1.substring(5));// cok dikkat ediniz;

        System.out.println(sb1.insert(17,"ediniz"));//Prize cok dikkat ediniz





    }
}
