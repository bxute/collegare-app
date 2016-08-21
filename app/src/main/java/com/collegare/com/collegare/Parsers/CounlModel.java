import java.util.ArrayList;

class CounlModel {

	public String updated;
	public int itemsPerPage;
	public ArrayList<RemardsModel> remards;

	public CounlModel(String updated, int itemsPerPage, ArrayList<RemardsModel> remards) {

		this.updated = updated;
		this.itemsPerPage = itemsPerPage;
		this.remards = remards;

	}

}