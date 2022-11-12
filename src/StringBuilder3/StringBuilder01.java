package StringBuilder3;

public class StringBuilder01 {

    public static void main(String[] args) {

         String str= "Ali Can";
         str= "Java cok guzel";

         System.out.println(str);

         StringBuilder sb1= new StringBuilder("java cok guzel");//java cok guzel
         sb1.append("dir");//java cok guzeldir
         System.out.println(sb1);

         StringBuffer sb2=new StringBuffer();
         sb2.append("java");
         sb2.append("cok");
         sb2.append("dir");
        System.out.println(sb2);//javacokdir
        sb2.append("Qa ").append(" cok").append("kolay");//method chain





    }
}
