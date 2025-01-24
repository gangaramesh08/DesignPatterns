package flyweight;

public interface FlyWeightPlayer {
    public void viewMission();

    public String fetchTask();

    public void setCoordinates(FlyWeightCoordinates coordinates);
}
