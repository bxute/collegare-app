import java.util.ArrayList;

class WrappersModel {

    public int itemsPerPage;
    public ArrayList<ReckleModel> reckle;
    public String redeem;

    public WrappersModel(int itemsPerPage, ArrayList<ReckleModel> reckle, String redeem) {

        this.itemsPerPage = itemsPerPage;
        this.reckle = reckle;
        this.redeem = redeem;

    }

}