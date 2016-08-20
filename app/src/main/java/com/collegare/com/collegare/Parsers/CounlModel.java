import java.util.ArrayList;

class CounlModel {

	public int itemsPerPage;
	public String updated;
	public ArrayList<RedeModel> rede;

	public CounlModel(int itemsPerPage, String updated, ArrayList<RedeModel> rede) {

		this.itemsPerPage = itemsPerPage;
		this.updated = updated;
		this.rede = rede;

	}

}