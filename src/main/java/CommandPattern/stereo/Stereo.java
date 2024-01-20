package CommandPattern.stereo;

public class Stereo {

    public void on() {
        System.out.println("Stereo is on");
    }

    public void off() {
        System.out.println("Stereo is off");
    }

    public void setCD() {
        System.out.println("Setting stereo  for CD");
    }

    public void setDVD() {
        System.out.println("Setting stereo  for DVD");
    }

    public void setRadio() {
        System.out.println("Setting stereo for radio");
    }

    public void setVolume(Integer volume) {
        System.out.println("Setting volume to "+volume);
    }


}
