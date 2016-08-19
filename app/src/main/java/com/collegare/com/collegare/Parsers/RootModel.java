
class RootModel {

	public String text;
	public String iso_language_code;
	public String to_user;
	public String from_user;
	public String profile_image_url;
	public String created_at;
	public RawModel _raw;
	public int id;
	public int to_user_id;
	public int from_user_id;
	public String source;

	public RootModel(String text, String iso_language_code, String to_user, String from_user, String profile_image_url, String created_at, RawModel raw, int id, int to_user_id, int from_user_id, String source) {

		this.text = text;
		this.iso_language_code = iso_language_code;
		this.to_user = to_user;
		this.from_user = from_user;
		this.profile_image_url = profile_image_url;
		this.created_at = created_at;
		this._raw = raw;
		this.id = id;
		this.to_user_id = to_user_id;
		this.from_user_id = from_user_id;
		this.source = source;

	}

}