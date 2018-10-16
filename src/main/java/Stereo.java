import java.util.ArrayList;

public class Stereo {

    private String name;
    private ArrayList<Component> components;
    private int volume;

    public Stereo (String name) {
        this.name = name;
        this.components = new ArrayList<>();
        this.volume = 50;
    }


    public String getName() {
        return name;
    }

    public int getComponentsSize() {
        return components.size();
    }

    public int getVolume() {
        return volume;
    }

    public void changeVolume(int number) {
        volume += number;
    }

    public void addComponent(Component component) {
        components.add(component);
    }

    public String play(Component component, String objectToPlay) {
        return component.play(objectToPlay);
    }
}
