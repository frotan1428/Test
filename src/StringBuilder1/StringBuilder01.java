package StringBuilder1;

public class StringBuilder01 {

    public static void main(String[] args) {

        String str= "Ali Can";
         str="java guzel";
         System.out.println(str);//java guzel

         StringBuilder sb1= new StringBuilder("java guzel");
         sb1.append("bir program");
         sb1.append(".");
         System.out.println(sb1);//java guzelbir program


         String st1=sb1.toString();

         StringBuilder sb2= new StringBuilder(st1);
         System.out.println(sb2);

        StringBuffer sb3= new StringBuffer();
         sb3.append("Java").append(" ").append("guzel").append("."); //method chain
        System.out.println(sb3);






    }
}
