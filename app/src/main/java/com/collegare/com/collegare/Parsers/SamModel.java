import java.util.ArrayList;

class SamModel {

	public ArrayList<ResModel> res;
	public String updated;
	public int itemsPerPage;
	public int totalItems;
	public int startIndex;

	public SamModel(ArrayList<ResModel> res, String updated, int itemsPerPage, int totalItems, int startIndex) {

		this.res = res;
		this.updated = updated;
		this.itemsPerPage = itemsPerPage;
		this.totalItems = totalItems;
		this.startIndex = startIndex;

	}

}