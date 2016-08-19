import java.util.ArrayList;

class PostModel {

	public String type;
	public String id;
	public String created_time;
	public String updated_time;
	public String message;
	public FromModel _from;
	public ArrayList<ActionModel> action;

	public PostModel(String type, String id, String created_time, String updated_time, String message, FromModel from, ArrayList<ActionModel> action) {

		this.type = type;
		this.id = id;
		this.created_time = created_time;
		this.updated_time = updated_time;
		this.message = message;
		this._from = from;
		this.action = action;

	}

}