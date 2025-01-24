package flyweight;

import java.util.Random;

public class FlyWeightDemo {

    private static final String[] playerTypes = {"Terrorist", "AntiTerrorist"};

    public static void main(String[] args) {
        //flyweight.FlyWeightPlayerFactory flyWeightPlayer = new flyweight.FlyWeightPlayerFactory() ;
        FlyWeightPlayer player = null;
        FlyWeightCoordinates coordinates = null;
        for (int i = 0; i < 10; i++) {
            coordinates = new FlyWeightCoordinates((i + 10), (i + 20));
            player = FlyWeightPlayerFactory.getPlayer(getRandPlayer(), coordinates);
            player.viewMission();
        }
    }

    private static String getRandPlayer() {
        Random random = new Random();
        int randInt = random.nextInt(playerTypes.length);
        String playerType = playerTypes[randInt];
        return playerType;
    }
}
