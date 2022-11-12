package abstarction;

public class profit extends Calculator{
    @Override
    public int add(int a, int b) {
        return -1;
    }

    @Override
    public int min(int a, int b, int c) {
        return -1;
    }

    @Override
    public int product(int a, int b) {
        return a+b;
    }

    @Override
    public int divided(int a, int b) {
        return a/b;
    }
}
