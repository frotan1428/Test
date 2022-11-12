package abstarction;

public class RunnerClass {

    public static void main(String[] args) {

        Loss loss= new Loss();

        int n=12;
        int n2=34;
        System.out.println( loss.add(3,6));
        System.out.println(loss.add(23,56));
        profit profit =new profit();
        System.out.println(profit.divided(n,n2));
        System.out.println(profit.product(40,6));



    }
}
