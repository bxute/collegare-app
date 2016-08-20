import java.util.ArrayList;

class RedeModel {

	public String description;
	public MegernModel _megern;
	public String id;
	public SchemeModel _scheme;
	public int commentCount;
	public ThumbiModel _thumbi;
	public String title;
	public ContentModel _content;
	public ArrayList<String> tags;
	public PlayerModel _player;

	public RedeModel(String description, MegernModel megern, String id, SchemeModel scheme, int commentCount, ThumbiModel thumbi, String title, ContentModel content, ArrayList<String> tags, PlayerModel player) {

		this.description = description;
		this._megern = megern;
		this.id = id;
		this._scheme = scheme;
		this.commentCount = commentCount;
		this._thumbi = thumbi;
		this.title = title;
		this._content = content;
		this.tags = tags;
		this._player = player;

	}

}