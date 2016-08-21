import java.util.ArrayList;

class RedeModel {

	public SchemeModel _scheme;
	public String id;
	public ContentModel _content;
	public String description;
	public String title;
	public ArrayList<String> tags;
	public PlayerModel _player;
	public int commentCount;
	public MegernModel _megern;
	public ThumbiModel _thumbi;

	public RedeModel(SchemeModel scheme, String id, ContentModel content, String description, String title, ArrayList<String> tags, PlayerModel player, int commentCount, MegernModel megern, ThumbiModel thumbi) {

		this._scheme = scheme;
		this.id = id;
		this._content = content;
		this.description = description;
		this.title = title;
		this.tags = tags;
		this._player = player;
		this.commentCount = commentCount;
		this._megern = megern;
		this._thumbi = thumbi;

	}

}