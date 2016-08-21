import java.util.ArrayList;

class RedeModel {

	public ContentModel _content;
	public int commentCount;
	public SchemeModel _scheme;
	public String id;
	public ArrayList<String> tags;
	public String title;
	public ThumbiModel _thumbi;
	public String description;
	public MegernModel _megern;
	public PlayerModel _player;

	public RedeModel(ContentModel content, int commentCount, SchemeModel scheme, String id, ArrayList<String> tags, String title, ThumbiModel thumbi, String description, MegernModel megern, PlayerModel player) {

		this._content = content;
		this.commentCount = commentCount;
		this._scheme = scheme;
		this.id = id;
		this.tags = tags;
		this.title = title;
		this._thumbi = thumbi;
		this.description = description;
		this._megern = megern;
		this._player = player;

	}

}