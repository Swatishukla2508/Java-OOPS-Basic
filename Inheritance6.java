import java.util.Scanner;

interface Camera {
    void capturephoto();

    void recordvideo();
}

interface Gps {
    void getlocation();

    void startnavigation();
}

interface Musicplayer {
    void playmusic();

    void stopmusic();
}

class Device {
    String devicename;
}

class Smartwatch extends Device implements Camera, Gps, Musicplayer {

    String deviceinfo;

    Smartwatch() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter device name:");
        devicename = scanner.nextLine();

        System.out.println("Enter device info:");
        deviceinfo = scanner.nextLine();
    }

    public void capturephoto() {
        System.out.println("Photo captured");
    }

    public void recordvideo() {
        System.out.println("Video recording started");
    }

    public void getlocation() {
        System.out.println("Getting current location");
    }

    public void startnavigation() {
        System.out.println("Navigation started");
    }

    public void playmusic() {
        System.out.println("Music playing");
    }

    public void stopmusic() {
        System.out.println("Music stopped");
    }

    public void display() {
        System.out.println("DEVICE NAME: " + devicename);
        System.out.println("DEVICE INFO: " + deviceinfo);
    }
}

public class Inheritance6 {
    public static void main(String[] args) {

        Smartwatch S1 = new Smartwatch();

        S1.capturephoto();
        S1.getlocation();
        S1.playmusic();
        S1.display();
        S1.recordvideo();
        S1.stopmusic();
        S1.startnavigation();
        S1.recordvideo();
    }
}
