package CommandPattern;

import CommandPattern.light.Light;
import CommandPattern.light.LightOffCommand;
import CommandPattern.light.LightOnCommand;
import CommandPattern.stereo.Stereo;
import CommandPattern.stereo.StereoOffCommand;
import CommandPattern.stereo.StereoOnForCD;

public class Client {

    public static void main(String[] args) {
        RemoteControl remoteControl = new RemoteControl();
        Light light = new Light();
        Stereo stereo = new Stereo();

        remoteControl.setCommand(new LightOnCommand(light));
        remoteControl.executeCommand();
        remoteControl.setCommand(new LightOffCommand(light));
        remoteControl.executeCommand();
        System.out.println();

        remoteControl.setCommand(new StereoOnForCD(stereo));
        remoteControl.executeCommand();
        remoteControl.setCommand(new StereoOffCommand(stereo));
        remoteControl.executeCommand();

    }

}
