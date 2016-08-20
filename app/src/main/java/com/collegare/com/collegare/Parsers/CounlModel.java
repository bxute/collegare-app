import java.util.ArrayList;

class CounlModel {

	public ArrayList<RedeModel> rede;
	public int itemsPerPage;
	public String updated;

	public CounlModel(ArrayList<RedeModel> rede, int itemsPerPage, String updated) {

		this.rede = rede;
		this.itemsPerPage = itemsPerPage;
		this.updated = updated;

	}

}