package JavaTutorialOOPS;
interface Camera1{
    void takeSnap();
    void recordVideo();
    default void record4kVideo(){
        System.out.println("Recording in 4K..");
    }
}
interface GPS1{
    void getLocation(String location);
    void locateMe();
}

interface MediaPlayer1{
    void playMusic(String song);
    void playMovie(String movie);
}

interface WIFI1{
    String [] getNetworks();
    void connectToNetwork(String network);
}

class CellPhone1 {
    void callNumber(int number){
        System.out.println("Calling number " + number);
    }
    void receiveCall(){
        System.out.println("Receiving call !!");
    }
}

class SmartPhone1 extends CellPhone1 implements Camera1,GPS1,MediaPlayer1,WIFI1{
    @Override
    public void takeSnap(){
        System.out.println("Taking a snap !!");
    }

    @Override
    public void recordVideo(){
        System.out.println("Recording a video !!");
    }

    @Override
    public void getLocation(String location){
        System.out.println("Fetching location details for " + location);
    }

    @Override
    public void locateMe(){
        System.out.println("Fetching your location !!");
    }

    @Override
    public void playMusic(String song){
        System.out.println("Playing song " + song);
    }

    @Override
    public void playMovie(String movie){
        System.out.println("Playing movie " + movie);
    }

    @Override
    public String[] getNetworks() {
        return new String[]{"NirmalyaWIFI12","HELLOMini"};
    }

    @Override
    public void connectToNetwork(String network) {
        System.out.println("Connected to network " + network);
    }
}

public class OOPS_21_Polymorphism_using_Interfaces {
    public static void main(String[] args) {
        GPS1 g1 = new SmartPhone1();  // This is a smartphone but can be used as a GPS
        Camera1 g2 = new SmartPhone1(); // This is a smartphone but can be used as a Camera
        MediaPlayer1 g3 = new SmartPhone1(); // This is a smartphone but can be used as a MediaPlayer
        WIFI1 wf = new SmartPhone1();
        SmartPhone1 sm = new SmartPhone1(); // This is a smartphone and can be used as camera,media player and GPS

        g1.getLocation("Dumdum, Kolkata");
        g1.locateMe();


        g2.takeSnap();
        g2.recordVideo();
        g2.record4kVideo();
        // g2.playMovie()  error as it can only be used as a camera and not a media player

        g3.playMovie("DDLJ");
        g3.playMusic("Dus Bahane");

        String [] networks = wf.getNetworks();
        for(String s:networks){
            System.out.println(s);
        }
        wf.connectToNetwork(networks[0]);

        sm.playMovie("SULTAN");
        sm.locateMe();
        sm.takeSnap();
        sm.callNumber(900768994);
        sm.receiveCall();


    }
}

/*
    g1 is a reference of type GPS1 interface but an object of SmartPhone1 class is
    assigned to it and hence it can only act as a gps and access gps related methods;

 */
