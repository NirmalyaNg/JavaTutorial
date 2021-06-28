package JavaTutorialOOPS;
interface MusicPlayerModel{
    void playMusic(String songName);
    void stopMusic();
}
interface CameraModel{
    int frontCamera = 32;
    int rearCamera = 48;
    void takeSelfie();
    void takePictureUsingRearCamera();
}

class Mobile implements MusicPlayerModel,CameraModel{
    public void playMusic(String songName){
        System.out.println("Playing song " + songName);
    }
    public void stopMusic(){
        System.out.println("Stopped playing songs");
    }
    public void takeSelfie(){
        System.out.println("Selfie clicked");
    }
    public void takePictureUsingRearCamera(){
        System.out.println("Picture taken using rear camera");
    }
}
public class OOPS_18_Interface_Example {
    public static void main(String[] args) {
        Mobile mob1 = new Mobile();
        mob1.playMusic("Badass Babua");
        mob1.stopMusic();
        mob1.takeSelfie();
        mob1.takePictureUsingRearCamera();
        System.out.println(mob1.frontCamera);
        // mob1.frontCamera = 16;  --> Error since attributes in interfaces are final and cannot be changed
        // However we can override them

    }
}
