public class FlyWeightAntiTerrorist implements FlyWeightPlayer {
    public static final String TASK = "DIFFUSE BOMB";
    FlyWeightCoordinates coordinates = null;

    public FlyWeightCoordinates getCoordinates() {
        return coordinates;
    }

    @Override
    public void setCoordinates(FlyWeightCoordinates coordinates) {
        this.coordinates = coordinates;
    }

    @Override
    public void viewMission() {
        System.out.println("Mission AntiTerrorist : " + fetchTask() + " : Coordinate Position : " + getCoordinates().getX() + ", " + getCoordinates().getY());
    }

    @Override
    public String fetchTask() {
        return TASK;
    }
}
