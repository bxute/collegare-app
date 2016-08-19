
class RestdataModel {

	public String text;
	public String from_user;
	public String to_user;
	public int to_user_id;
	public MetadataModel _metadata;

	public RestdataModel(String text, String from_user, String to_user, int to_user_id, MetadataModel metadata) {

		this.text = text;
		this.from_user = from_user;
		this.to_user = to_user;
		this.to_user_id = to_user_id;
		this._metadata = metadata;

	}

}