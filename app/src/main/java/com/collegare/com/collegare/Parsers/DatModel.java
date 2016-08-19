import java.util.ArrayList;

class DatModel {

	public String updated;
	public ArrayList<ItemModel> item;
	public int itemsPerPage;

	public DatModel(String updated, ArrayList<ItemModel> item, int itemsPerPage) {

		this.updated = updated;
		this.item = item;
		this.itemsPerPage = itemsPerPage;

	}

}