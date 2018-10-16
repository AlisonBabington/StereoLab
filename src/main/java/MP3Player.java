public class MP3Player implements IConnect{

    @Override
    public String connect(Stereo stereo) {
        return stereo.getName() + " is connected";
    }
}
