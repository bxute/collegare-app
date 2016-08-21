import java.util.ArrayList;

class CounlModel {

	public String updated;
	public ArrayList<RemardsModel> remards;
	public int itemsPerPage;

	public CounlModel(String updated, ArrayList<RemardsModel> remards, int itemsPerPage) {

		this.updated = updated;
		this.remards = remards;
		this.itemsPerPage = itemsPerPage;

	}

}