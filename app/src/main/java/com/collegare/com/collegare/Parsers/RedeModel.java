import java.util.ArrayList;

class RedeModel {

	public String id;
	public PlayerModel _player;
	public ContentModel _content;
	public MegernModel _megern;
	public ArrayList<String> tags;
	public String description;
	public SchemeModel _scheme;
	public String title;
	public ThumbiModel _thumbi;
	public int commentCount;

	public RedeModel(String id, PlayerModel player, ContentModel content, MegernModel megern, ArrayList<String> tags, String description, SchemeModel scheme, String title, ThumbiModel thumbi, int commentCount) {

		this.id = id;
		this._player = player;
		this._content = content;
		this._megern = megern;
		this.tags = tags;
		this.description = description;
		this._scheme = scheme;
		this.title = title;
		this._thumbi = thumbi;
		this.commentCount = commentCount;

	}

}