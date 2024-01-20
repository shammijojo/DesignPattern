package FlyWeightPattern;

public class CounterTerrorist implements Player {

    private final String task; //Intrinsic
    private final String uniform; //Intrinsic
    private String weapon; //Extrinsic

    public CounterTerrorist() {
        task = "DIFFUSE BOMB";
        uniform = "Terrorist Uniform";
    }

    @Override
    public void assignWeapon(String weapon) {
        this.weapon = weapon;
    }

    @Override
    public void getInfo() {
        System.out.println("CounterTerrorist with weapon " + weapon);
    }

}
