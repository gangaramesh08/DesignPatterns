public class StrategyWalk implements StrategyIRouteStrategy {
    String fromLocation;
    String toLocation;

    @Override
    public void findFastestRoute(String from, String to) {
        System.out.println("Finding fastes route via walk from "+from+" to "+to);
    }
}
