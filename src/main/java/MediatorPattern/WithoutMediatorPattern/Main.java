package MediatorPattern.WithoutMediatorPattern;

public class Main {

    public static void main(String[] args) {
        Fan fan = new Fan();
        Switch s = new Switch(fan);

        s.press();
        s.press();


    }


}
