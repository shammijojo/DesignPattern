package NullObjectPattern;


public class CarFactory {

    public Car getCar(String name) {
        switch (name) {
            case "AUDI":
                return new Audi();
            case "MERCEDES":
                return new Mercedes();
            default:
                return new NullCar();
        }
    }

}
