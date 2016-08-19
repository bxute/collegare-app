import java.util.ArrayList;

class DataModel {

	public int startIndex;
	public int totalItems;
	public ArrayList<ItemsModel> items;
	public int itemsPerPage;
	public String updated;

	public DataModel(int startIndex, int totalItems, ArrayList<ItemsModel> items, int itemsPerPage, String updated) {

		this.startIndex = startIndex;
		this.totalItems = totalItems;
		this.items = items;
		this.itemsPerPage = itemsPerPage;
		this.updated = updated;

	}

}