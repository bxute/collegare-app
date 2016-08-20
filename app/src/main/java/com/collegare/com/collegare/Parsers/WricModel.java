import java.util.ArrayList;

class WricModel {

	public String updated;
	public int itemsPerPage;
	public ArrayList<RedemeModel> redeme;

	public WricModel(String updated, int itemsPerPage, ArrayList<RedemeModel> redeme) {

		this.updated = updated;
		this.itemsPerPage = itemsPerPage;
		this.redeme = redeme;

	}

}