import java.util.ArrayList;

class DatModel {

	public int itemsPerPage;
	public String updated;
	public ArrayList<SoldModel> sold;

	public DatModel(int itemsPerPage, String updated, ArrayList<SoldModel> sold) {

		this.itemsPerPage = itemsPerPage;
		this.updated = updated;
		this.sold = sold;

	}

}