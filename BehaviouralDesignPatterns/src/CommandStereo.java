public class CommandStereo {
    public void increaseVolume(int vol){
        System.out.println("Increased volume to "+vol+".");
    }
    public void decreaseVolume(int vol){
        if(vol>=0){
            System.out.println("Decreased volume to "+vol+".");
        }
        else
        {
            System.out.println("Cannot decrease beyond 0");
        }
    }
    public void turnOn(){
        System.out.println("Stereo turned on.");
    }
    public void turnOff(){
        System.out.println("Stereo turned off.");
    }
    public void playRadio(){
        System.out.println("Playing radio.");
    }
    public void playMusic(){
        System.out.println("Playing music");
    }
}
