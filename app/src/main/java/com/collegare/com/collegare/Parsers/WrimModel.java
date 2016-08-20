import java.util.ArrayList;

class WrimModel {

	public int itemsPerPage;
	public ArrayList<RedeModel> rede;
	public String updated;

	public WrimModel(int itemsPerPage, ArrayList<RedeModel> rede, String updated) {

		this.itemsPerPage = itemsPerPage;
		this.rede = rede;
		this.updated = updated;

	}

}