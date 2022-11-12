package abstraction1;

public class Honda extends Car{

    String make="Honda";
    String model="Accord";
    int year = 2022;

    @Override
    public void make() {
        System.out.println("My car is "+make);
    }

    @Override
    public void model() {
        System.out.println("My ca is an "+model);
    }

    @Override
    public void year() {
        System.out.println("my car is "+year);
    }
}
