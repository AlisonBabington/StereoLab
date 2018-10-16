import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RadioTest {

    Radio radio;

    @Before
    public void before() {
        radio = new Radio("Sony", "SL500");
    }

    @Test
    public void hasMake() {
        assertEquals("Sony", radio.getMake());
    }

    @Test
    public void hasModel() {
        assertEquals("SL500", radio.getModel());
    }

    @Test
    public void addStation() {
        radio.addStation("Radio 1");
        assertEquals(1, radio.stationListSize());
    }

    @Test
    public void canTuneRadio() {
        radio.addStation("Radio One");
        radio.addStation("Radio Two");
        assertEquals("Radio Two", radio.tune("Radio Two"));
        assertEquals("Station not found", radio.tune("Radio Four"));
    }

    @Test
    public void canPlay() {
        radio.addStation("Radio One");
        radio.addStation("Radio Two");
        assertEquals("The radio is playing Radio One", radio.play("Radio One"));
    }


}
