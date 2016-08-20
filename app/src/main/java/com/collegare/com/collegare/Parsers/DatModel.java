import java.util.ArrayList;

class DatModel {

	public String updated;
	public int itemsPerPage;
	public ArrayList<SoldModel> sold;

	public DatModel(String updated, int itemsPerPage, ArrayList<SoldModel> sold) {

		this.updated = updated;
		this.itemsPerPage = itemsPerPage;
		this.sold = sold;

	}

}