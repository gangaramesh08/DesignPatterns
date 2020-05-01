import java.util.HashMap;
import java.util.Map;

public class FlyWeightPlayerFactory {
    static Map<String, FlyWeightPlayer> playerMap = new HashMap<>();

    public static FlyWeightPlayer getPlayer(String playerType, FlyWeightCoordinates coordinates) {
        FlyWeightPlayer player = null;
        try {
            if (playerMap.containsKey(playerType)) {
                player = playerMap.get(playerType);
                player.setCoordinates(coordinates);
            } else {
                player = getPlayerObject(playerType);
                player.setCoordinates(coordinates);
                playerMap.put(playerType, player);

            }
        } catch (Exception e) {
            System.out.println("Error");
        }
        return player;
    }

    private static FlyWeightPlayer getPlayerObject(String playerType) {
        if (playerType.equalsIgnoreCase("Terrorist"))
            return new FlyWeightTerrorist();
        else
            return new FlyWeightAntiTerrorist();
    }
}
