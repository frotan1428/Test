package abstarction;

public class Honda extends Car {

    String make = "Honda";
    String model = "Accord";
    int year = 2021;


    @Override
    public void make() {
        System.out.println("this is my model "+make);
    }

    @Override
    public void model() {

    }

    @Override
    public void year() {

    }
}

