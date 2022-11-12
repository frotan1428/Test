package abstraction1;

public class CarRunner {

    public static void main(String[] args) {

        Toyota car= new Toyota();
        car.make();
        car.model();
        car.year();
        System.out.println(car.make);
        System.out.println("==================");
        Car car1= new Honda();
        car1.model();
        car1.make();
        car1.year();


    }
}
