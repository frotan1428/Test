package StringBuilder3;

public class StringBuilder03 {
    public static void main(String[] args) {

        StringBuilder sb1=new StringBuilder("Prize diktat ");//edin
//        sb1.append("edin");
        System.out.println(sb1);//Prize diktat edin

        System.out.println(sb1.insert(12," edin"));  //Prize diktatedin edin

        System.out.println(sb1.substring(0,5));//Prize

        System.out.println(sb1.substring(5));// diktat edin

        StringBuilder sb2=new StringBuilder("        Prize dikkat     ");

        sb2.trimToSize();
        System.out.println(sb2.length());//25
        System.out.println(sb2.capacity());//25



    }
}
