public class StrategyBike implements StrategyIRouteStrategy {
    String fromLocation;
    String toLocation;

    @Override
    public void findFastestRoute(String from, String to) {
        System.out.println("Finding fastes route via bike from "+from+" to "+to);
    }
}
