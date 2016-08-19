import java.util.ArrayList;

class DatModel {

	public String updated;
	public ArrayList<SoldModel> sold;
	public int itemsPerPage;

	public DatModel(String updated, ArrayList<SoldModel> sold, int itemsPerPage) {

		this.updated = updated;
		this.sold = sold;
		this.itemsPerPage = itemsPerPage;

	}

}