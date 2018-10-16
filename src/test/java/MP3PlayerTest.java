import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MP3PlayerTest {

    MP3Player player;
    Stereo stereo;

    @Before
    public void before() {
        player = new MP3Player();
        stereo = new Stereo("Stereo");
    }

    @Test
    public void canConnect() {
        assertEquals("Stereo is connected",player.connect(stereo));
    }
}
