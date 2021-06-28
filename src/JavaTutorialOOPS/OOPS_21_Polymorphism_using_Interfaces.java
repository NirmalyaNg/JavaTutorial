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
class SmartPhone1 implements Camera1,GPS1,MediaPlayer1{
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
}

public class OOPS_21_Polymorphism_using_Interfaces {
    public static void main(String[] args) {
        GPS1 g1 = new SmartPhone1();
        Camera1 g2 = new SmartPhone1();
        MediaPlayer1 g3 = new SmartPhone1();

        g1.getLocation("Dumdum, Kolkata");
        g1.locateMe();

        g2.takeSnap();
        g2.recordVideo();
        g2.record4kVideo();

        g3.playMovie("DDLJ");
        g3.playMusic("Dus Bahane");

    }
}

/*
    g1 is a reference of type GPS1 interface but an object of SmartPhone1 class is
    assigned to it and hence it can only act as a gps and access gps related methods;

 */
