import java.util.ArrayList;

class WricModel {

	public ArrayList<RedeModel> rede;
	public String updated;
	public int itemsPerPage;

	public WricModel(ArrayList<RedeModel> rede, String updated, int itemsPerPage) {

		this.rede = rede;
		this.updated = updated;
		this.itemsPerPage = itemsPerPage;

	}

}