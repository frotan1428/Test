package Arrrays5;

import java.util.Scanner;

public class Factorails {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        long factorial = 1L;
        StringBuilder answer = new StringBuilder();

        for (int i=num; i>0; i--) {
            answer.append(i);
            if (i-1>0) {
                answer.append("*");
            } else {
                answer.append("=");
            }
            factorial *= i;
        }
        answer.append(factorial);
        System.out.println(answer);
    }
}
