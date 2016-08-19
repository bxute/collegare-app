import java.util.ArrayList;

class WricModel {

	public ArrayList<ExsodeModel> exsode;
	public String updated;
	public int itemsPerPage;

	public WricModel(ArrayList<ExsodeModel> exsode, String updated, int itemsPerPage) {

		this.exsode = exsode;
		this.updated = updated;
		this.itemsPerPage = itemsPerPage;

	}

}