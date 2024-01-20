package NullObjectPattern;

public class Main {

    public static void main(String[] args) {
        CarFactory carFactory = new CarFactory();
        Car car = carFactory.getCar("AUDI");
        System.out.println(car.getCarName());

        car = carFactory.getCar("MERCEDES");
        System.out.println(car.getCarName());

        car = carFactory.getCar("TATA");
        System.out.println(car.getCarName());
    }


}
