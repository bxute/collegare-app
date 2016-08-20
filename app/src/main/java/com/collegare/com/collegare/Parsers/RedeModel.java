import java.util.ArrayList;

class RedeModel {

	public ThumbiModel _thumbi;
	public String description;
	public ContentModel _content;
	public SchemeModel _scheme;
	public PlayerModel _player;
	public ArrayList<String> tags;
	public String id;
	public MegernModel _megern;
	public int commentCount;
	public String title;

	public RedeModel(ThumbiModel thumbi, String description, ContentModel content, SchemeModel scheme, PlayerModel player, ArrayList<String> tags, String id, MegernModel megern, int commentCount, String title) {

		this._thumbi = thumbi;
		this.description = description;
		this._content = content;
		this._scheme = scheme;
		this._player = player;
		this.tags = tags;
		this.id = id;
		this._megern = megern;
		this.commentCount = commentCount;
		this.title = title;

	}

}