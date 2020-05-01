public class FlyWeightTerrorist implements FlyWeightPlayer {

    public static final String TASK = "PLANT BOMB";
    FlyWeightCoordinates coordinates = null;

    public FlyWeightCoordinates getCoordinates() {
        return coordinates;
    }

    @Override
    public void setCoordinates(FlyWeightCoordinates coordinates) {
        this.coordinates = coordinates;
    }

    public FlyWeightTerrorist() {
    }

    @Override
    public void viewMission() {
        System.out.println("Mission Terrorist : " + fetchTask() + " : Coordinate Position : " + getCoordinates().getX() + ", " + getCoordinates().getY());
    }

    @Override
    public String fetchTask() {
        return TASK;
    }

}
