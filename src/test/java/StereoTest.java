import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class StereoTest {

    Stereo stereo;
    Component radio;

    @Before
    public void before() {
        stereo = new Stereo("Stereo");
        radio = new Radio("Sonny", "SL501");
    }

    @Test
    public void hasName() {
        assertEquals("Stereo", stereo.getName());
    }

    @Test
    public void hasNoComponents() {
        assertEquals(0, stereo.getComponentsSize());
    }

    @Test
    public void canChangeVolume() {
        stereo.changeVolume(-10);
        assertEquals(40, stereo.getVolume());
        stereo.changeVolume(10);
        assertEquals(50, stereo.getVolume());
    }

    @Test
    public void canAddComponent() {
        stereo.addComponent(radio);
        assertEquals(1, stereo.getComponentsSize());
    }

    @Test
    public void canPlay () {
        ((Radio) radio).addStation("Radio One");
        assertEquals("The radio is playing Radio One", stereo.play(radio, "Radio One"));
    }
}
