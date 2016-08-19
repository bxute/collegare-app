import java.util.ArrayList;

class RepalerModel {

	public String type;
	public String created_time;
	public String means;
	public String id_frome;
	public ArrayList<RastModel> rast;
	public String updated_time;
	public Id_toModel _id_to;

	public RepalerModel(String type, String created_time, String means, String id_frome, ArrayList<RastModel> rast, String updated_time, Id_toModel id_to) {

		this.type = type;
		this.created_time = created_time;
		this.means = means;
		this.id_frome = id_frome;
		this.rast = rast;
		this.updated_time = updated_time;
		this._id_to = id_to;

	}

}