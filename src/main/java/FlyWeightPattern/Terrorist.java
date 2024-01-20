package FlyWeightPattern;

public class Terrorist implements Player {

    private final  String task;
    private final  String uniform;
    private String weapon;

    public Terrorist() {
        task = "DIFFUSE BOMB";
        uniform = "Terrorist Uniform";
    }

    @Override
    public void assignWeapon(String weapon) {
        this.weapon = weapon;
    }

    @Override
    public void getInfo() {
        System.out.println("Terrorist with weapon "+weapon);
    }
}
