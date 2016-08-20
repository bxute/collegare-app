import java.util.ArrayList;

class WrimModel {

	public int itemsPerPage;
	public String updated;
	public ArrayList<RedeModel> rede;

	public WrimModel(int itemsPerPage, String updated, ArrayList<RedeModel> rede) {

		this.itemsPerPage = itemsPerPage;
		this.updated = updated;
		this.rede = rede;

	}

}