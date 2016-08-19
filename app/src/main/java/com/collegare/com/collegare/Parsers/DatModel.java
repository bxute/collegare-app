import java.util.ArrayList;

class DatModel {

	public int itemsPerPage;
	public ArrayList<ItemModel> item;
	public String updated;
	public int totalItems;
	public int startIndex;

	public DatModel(int itemsPerPage, ArrayList<ItemModel> item, String updated, int totalItems, int startIndex) {

		this.itemsPerPage = itemsPerPage;
		this.item = item;
		this.updated = updated;
		this.totalItems = totalItems;
		this.startIndex = startIndex;

	}

}