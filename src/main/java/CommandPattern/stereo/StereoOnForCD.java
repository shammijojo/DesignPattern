package CommandPattern.stereo;

import CommandPattern.Command;

public class StereoOnForCD implements Command {

    private Stereo stereo;

    public StereoOnForCD(Stereo stereo) {
        this.stereo = stereo;
    }

    @Override
    public void execute() {
        stereo.on();
        stereo.setCD();
        stereo.setVolume(10);
    }
}
