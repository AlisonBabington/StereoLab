import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CDPlayerTest {

    CDPlayer cdPlayer;

    @Before
    public void before() {
        cdPlayer = new CDPlayer("Sony", "SL501");
    }

    @Test
    public void hasMake() {
        assertEquals("Sony", cdPlayer.getMake());
    }

    @Test
    public void hasModel() {
        assertEquals("SL501", cdPlayer.getModel());
    }

    @Test
    public void addcd() {
        cdPlayer.addCd("CD One");
        assertEquals(1, cdPlayer.cdListSize());
    }

    @Test
    public void canTunecdPlayer() {
        cdPlayer.addCd("CD One");
        cdPlayer.addCd("CD Two");
        assertEquals("CD Two", cdPlayer.changeCd("CD Two"));
        assertEquals("CD not found", cdPlayer.changeCd("CD Four"));
    }

    @Test
    public void canPlay() {
        cdPlayer.addCd("CD One");
        cdPlayer.addCd("CD Two");
        assertEquals("The cdPlayer is playing CD One", cdPlayer.play("CD One"));
    }


}
