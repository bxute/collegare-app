import java.util.ArrayList;

class RedeModel {

	public PlayerModel _player;
	public MegernModel _megern;
	public String description;
	public String id;
	public ArrayList<String> tags;
	public String title;
	public ContentModel _content;
	public ThumbiModel _thumbi;
	public SchemeModel _scheme;
	public int commentCount;

	public RedeModel(PlayerModel player, MegernModel megern, String description, String id, ArrayList<String> tags, String title, ContentModel content, ThumbiModel thumbi, SchemeModel scheme, int commentCount) {

		this._player = player;
		this._megern = megern;
		this.description = description;
		this.id = id;
		this.tags = tags;
		this.title = title;
		this._content = content;
		this._thumbi = thumbi;
		this._scheme = scheme;
		this.commentCount = commentCount;

	}

}