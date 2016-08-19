import java.util.ArrayList;

class RestModel {

	public String id_frome;
	public Id_toModel _id_to;
	public String created_time;
	public String updated_time;
	public ArrayList<RastModel> rast;
	public String type;
	public String means;

	public RestModel(String id_frome, Id_toModel id_to, String created_time, String updated_time, ArrayList<RastModel> rast, String type, String means) {

		this.id_frome = id_frome;
		this._id_to = id_to;
		this.created_time = created_time;
		this.updated_time = updated_time;
		this.rast = rast;
		this.type = type;
		this.means = means;

	}

}