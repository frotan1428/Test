package abstarction;

public class Toyota extends  Car{
    String make="Toyota";
    String model="Camry";
    int year =2022;
    @Override
    public void   make() {
        System.out.println("The car model is "+model);

    }

    @Override
    public void model() {
        System.out.println("My car is "+model+"Model ");
    }

    @Override
    public void year() {
        System.out.println("this is My year Car "+year);
    }
}
