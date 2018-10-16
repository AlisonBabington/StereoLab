import java.util.ArrayList;

public class CDPlayer extends Component{

    private ArrayList<String> cds;

    public CDPlayer(String make, String model) {
        super(make, model);
        this.cds = new ArrayList<>();
    }


    @Override
    public String play(String object) {
        return "The cdPlayer is playing " + changeCd(object);
    }


    public int cdListSize() {
        return cds.size();
    }

    public void addCd(String cd) {
        cds.add(cd);
    }

    public String changeCd(String cd) {
        int cdIndex = cds.indexOf(cd);
        if (cdIndex == -1) return "CD not found";
        String currentcd =  cds.get(cdIndex);
        return currentcd;
    }
}
