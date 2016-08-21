import java.util.ArrayList;

class LooseModel {

	public int itemsPerPage;
	public String updated;
	public ArrayList<RedartModel> redart;

	public LooseModel(int itemsPerPage, String updated, ArrayList<RedartModel> redart) {

		this.itemsPerPage = itemsPerPage;
		this.updated = updated;
		this.redart = redart;

	}

}