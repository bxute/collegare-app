import java.util.ArrayList;

class CounlModel {

	public ArrayList<RedeModel> rede;
	public String updated;
	public int itemsPerPage;

	public CounlModel(ArrayList<RedeModel> rede, String updated, int itemsPerPage) {

		this.rede = rede;
		this.updated = updated;
		this.itemsPerPage = itemsPerPage;

	}

}