import java.util.ArrayList;

class WrimModel {

	public ArrayList<SoldModel> sold;
	public String updated;
	public int itemsPerPage;

	public WrimModel(ArrayList<SoldModel> sold, String updated, int itemsPerPage) {

		this.sold = sold;
		this.updated = updated;
		this.itemsPerPage = itemsPerPage;

	}

}