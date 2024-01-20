package FlyWeightPattern;

import java.util.HashMap;
import java.util.Map;

public class PlayerFactory {

    private static Map<String, Player> playersByType = new HashMap<>();

    public static Player getPlayers(String type) {
        if(playersByType.containsKey(type)) {
            System.out.println(type+" already exists");
            return playersByType.get(type);
        }

        Player player = null;
        switch (type) {
            case "TERRORIST":
                System.out.println("Creating new "+type);
                player = new Terrorist();
                break;
            case "COUNTER-TERRORIST":
                System.out.println("Creating new "+type);
                player = new CounterTerrorist();
        }

        playersByType.put(type,player);
        return player;
    }



}
