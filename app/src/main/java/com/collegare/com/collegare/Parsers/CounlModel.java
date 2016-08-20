import java.util.ArrayList;

class CounlModel {

	public String updated;
	public int itemsPerPage;
	public ArrayList<RedeModel> rede;

	public CounlModel(String updated, int itemsPerPage, ArrayList<RedeModel> rede) {

		this.updated = updated;
		this.itemsPerPage = itemsPerPage;
		this.rede = rede;

	}

}