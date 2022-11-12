package abstraction1;

public class Toyota extends Car{

    String make="Toyota";
    String model="Ferrari";
    int year = 2021;

    @Override
    public void make() {
        System.out.println("My car is "+make);
    }

    @Override
    public void model() {
        System.out.println("My car is model "+model);
    }

    @Override
    public void year() {
        System.out.println("My car is year "+year);
    }
}
