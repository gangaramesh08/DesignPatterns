public class StrategyUser {
    StrategyIRouteStrategy route;

    public StrategyUser(StrategyIRouteStrategy route) {
        this.route = route;
    }

    public void findFastestRoute(String from, String to) {
        route.findFastestRoute(from,to);
    }
}
