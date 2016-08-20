import java.util.ArrayList;

class WricModel {

	public String updated;
	public int itemsPerPage;
	public ArrayList<RedeModel> rede;

	public WricModel(String updated, int itemsPerPage, ArrayList<RedeModel> rede) {

		this.updated = updated;
		this.itemsPerPage = itemsPerPage;
		this.rede = rede;

	}

}