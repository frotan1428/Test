package abstarction;

public class Loss extends Calculator{


    @Override
    public int add(int a, int b) {
        return a+b;
    }

    @Override
    public int min(int a, int b, int c) {
        return a-b-c;
    }

    @Override
    public int product(int a, int b) {
        return a*b;
    }

    @Override
    public int divided(int a, int b) {
            return a/b;
    }




}
