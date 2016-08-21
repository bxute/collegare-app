import java.util.ArrayList;

class RedeModel {

	public PlayerModel _player;
	public ContentModel _content;
	public String id;
	public String title;
	public MegernModel _megern;
	public int commentCount;
	public SchemeModel _scheme;
	public String description;
	public ThumbiModel _thumbi;
	public ArrayList<String> tags;

	public RedeModel(PlayerModel player, ContentModel content, String id, String title, MegernModel megern, int commentCount, SchemeModel scheme, String description, ThumbiModel thumbi, ArrayList<String> tags) {

		this._player = player;
		this._content = content;
		this.id = id;
		this.title = title;
		this._megern = megern;
		this.commentCount = commentCount;
		this._scheme = scheme;
		this.description = description;
		this._thumbi = thumbi;
		this.tags = tags;

	}

}