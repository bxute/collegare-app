
class ResultModel {

	public String to_user;
	public String from_user;
	public String text;
	public int to_user_id;
	public MetaModel _meta;

	public ResultModel(String to_user, String from_user, String text, int to_user_id, MetaModel meta) {

		this.to_user = to_user;
		this.from_user = from_user;
		this.text = text;
		this.to_user_id = to_user_id;
		this._meta = meta;

	}

}