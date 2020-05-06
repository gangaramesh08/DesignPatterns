public class StrategyDemo {
    public static void main(String[] args) {
        StrategyIRouteStrategy carRoute = new StrategyCar();
        StrategyIRouteStrategy walkRoute = new StrategyWalk();
        StrategyIRouteStrategy bikeRoute = new StrategyBike();
        StrategyUser user = new StrategyUser(carRoute);
        String fromLocation = "Bangalore";
        String toLocation = "Kochi";
        user.findFastestRoute(fromLocation, toLocation);
        user = new StrategyUser(walkRoute);
        user.findFastestRoute(fromLocation, toLocation);
        user = new StrategyUser(bikeRoute);
        user.findFastestRoute(fromLocation, toLocation);
    }
}

