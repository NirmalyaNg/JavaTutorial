package JavaTutorialOOPS;

interface MediaPlayer{
    void playMusic(String song);
    void stopMusic();


}
interface Camera{
    void takeSnap();
    void recordVideo();
    private void greet(){
        System.out.println("Good Morning..Starting to record video...");
    }
    default void recordVideoIn4K(){
        greet();
        System.out.println("Recording in 4K");
    }
}
interface WIFI{
    String [] getAllNetworks();
    void connectToNetwork(String network);
}
class CellPhone{
    void callSomeOne(int number){
        System.out.println("Calling " + number);
    }

    void receiveCall(){
        System.out.println("Receiving call");
    }
}
class SmartPhoneClass extends CellPhone implements WIFI,Camera,MediaPlayer{
    @Override
    public void playMusic(String song){
        System.out.println("Playing song " + song);
    }
    @Override
    public void stopMusic(){
        System.out.println("Stopping music !");
    }
    @Override
    public void takeSnap(){
        System.out.println("Taking a picture..");
    }
    @Override
    public void recordVideo(){
        System.out.println("Recording Video..");
    }

    @Override
    public String[] getAllNetworks() {
        return new String[]{"Network 1","Network 2"};
    }
    @Override
    public void connectToNetwork(String network){
        System.out.println("Connecting to network " + network);
    }

    // Overriding default method which is not necessary
    /*
    @Override
    public void recordVideoIn4K(){
        System.out.println("Taking a snap and Recording in 4K...");
    }
    */

}

public class OOPS_19_Multiple_Inheritance_Interface {
    public static void main(String[] args) {
        SmartPhoneClass sm = new SmartPhoneClass();
        sm.playMusic("Dus Bahane");
        sm.stopMusic();
        sm.takeSnap();
        sm.recordVideo();
        sm.recordVideoIn4K();

        
        String [] networks  = sm.getAllNetworks();
        for(String network:networks){
            System.out.println(network);
        }
        sm.connectToNetwork(networks[0]);
    }
}
