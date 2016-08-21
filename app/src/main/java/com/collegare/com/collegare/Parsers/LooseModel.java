import java.util.ArrayList;

class LooseModel {

    public String updated;
    public int itemsPerPage;
    public ArrayList<RedartModel> redart;

    public LooseModel(String updated, int itemsPerPage, ArrayList<RedartModel> redart) {

        this.updated = updated;
        this.itemsPerPage = itemsPerPage;
        this.redart = redart;

    }

}