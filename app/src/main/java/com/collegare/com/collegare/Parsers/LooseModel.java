import java.util.ArrayList;

class LooseModel {

	public int itemsPerPage;
	public ArrayList<RedartModel> redart;
	public String updated;

	public LooseModel(int itemsPerPage, ArrayList<RedartModel> redart, String updated) {

		this.itemsPerPage = itemsPerPage;
		this.redart = redart;
		this.updated = updated;

	}

}