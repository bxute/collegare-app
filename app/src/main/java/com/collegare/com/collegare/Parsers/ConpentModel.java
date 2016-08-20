import java.util.ArrayList;

class ConpentModel {

	public String updated;
	public int itemsPerPage;
	public ArrayList<RedeModel> rede;

	public ConpentModel(String updated, int itemsPerPage, ArrayList<RedeModel> rede) {

		this.updated = updated;
		this.itemsPerPage = itemsPerPage;
		this.rede = rede;

	}

}