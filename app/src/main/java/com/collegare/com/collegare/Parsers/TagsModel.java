import java.util.ArrayList;

class TagsModel {

	public String id;
	public String type;
	public String updated_time;
	public String message;
	public FromModel _from;
	public ArrayList<ActionModel> action;
	public String created_time;

	public TagsModel(String id, String type, String updated_time, String message, FromModel from, ArrayList<ActionModel> action, String created_time) {

		this.id = id;
		this.type = type;
		this.updated_time = updated_time;
		this.message = message;
		this._from = from;
		this.action = action;
		this.created_time = created_time;

	}

}