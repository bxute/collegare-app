import java.util.ArrayList;

class WrimModel {

	public String updated;
	public ArrayList<RedeModel> rede;
	public int itemsPerPage;

	public WrimModel(String updated, ArrayList<RedeModel> rede, int itemsPerPage) {

		this.updated = updated;
		this.rede = rede;
		this.itemsPerPage = itemsPerPage;

	}

}