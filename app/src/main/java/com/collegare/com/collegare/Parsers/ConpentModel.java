import java.util.ArrayList;

class ConpentModel {

	public ArrayList<RedeModel> rede;
	public int itemsPerPage;
	public String updated;

	public ConpentModel(ArrayList<RedeModel> rede, int itemsPerPage, String updated) {

		this.rede = rede;
		this.itemsPerPage = itemsPerPage;
		this.updated = updated;

	}

}