import java.util.ArrayList;

class WrimModel {

	public String updated;
	public int itemsPerPage;
	public ArrayList<RedeModel> rede;

	public WrimModel(String updated, int itemsPerPage, ArrayList<RedeModel> rede) {

		this.updated = updated;
		this.itemsPerPage = itemsPerPage;
		this.rede = rede;

	}

}