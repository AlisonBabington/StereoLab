import java.util.ArrayList;

public class Radio extends Component{

    private ArrayList<String> stations;

    public Radio (String make, String model) {
        super(make, model);
        this.stations = new ArrayList<>();
    }


    @Override
    public String play(String station) {
        return "The radio is playing " + tune(station);
    }

    public int stationListSize() {
        return stations.size();
    }

    public void addStation(String station) {
        stations.add(station);
    }

    public String tune(String station) {
        int stationIndex = stations.indexOf(station);
        if (stationIndex == -1) return "Station not found";
        String currentStation =  stations.get(stationIndex);
        return currentStation;
    }
}
