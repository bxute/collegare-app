import java.util.ArrayList;

class CounlModel {

	public String updated;
	public ArrayList<RedeModel> rede;
	public int itemsPerPage;

	public CounlModel(String updated, ArrayList<RedeModel> rede, int itemsPerPage) {

		this.updated = updated;
		this.rede = rede;
		this.itemsPerPage = itemsPerPage;

	}

}