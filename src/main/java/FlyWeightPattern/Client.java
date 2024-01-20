package FlyWeightPattern;

import java.util.ArrayList;
import java.util.List;

public class Client {

    public static void main(String[] args) {
        System.out.println("Creating 10 TERRORISTS...");
        List<Player> terrorists = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            Player terrorist = PlayerFactory.getPlayers("TERRORIST");
            terrorist.assignWeapon("KNIFE");
            terrorist.getInfo();
            terrorists.add(terrorist);
        }

        System.out.println("Creating 10 COUNTER TERRORISTS...");
        List<Player> counterTerrorists = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            Player counterTerrorist = PlayerFactory.getPlayers("COUNTER-TERRORIST");
            counterTerrorist.assignWeapon("GUN");
            counterTerrorist.getInfo();
            counterTerrorists.add(counterTerrorist);
        }
    }


}
