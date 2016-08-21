import java.util.ArrayList;

class RedeModel {

	public String title;
	public MegernModel _megern;
	public PlayerModel _player;
	public int commentCount;
	public ArrayList<String> tags;
	public ContentModel _content;
	public String description;
	public ThumbiModel _thumbi;
	public String id;
	public SchemeModel _scheme;

	public RedeModel(String title, MegernModel megern, PlayerModel player, int commentCount, ArrayList<String> tags, ContentModel content, String description, ThumbiModel thumbi, String id, SchemeModel scheme) {

		this.title = title;
		this._megern = megern;
		this._player = player;
		this.commentCount = commentCount;
		this.tags = tags;
		this._content = content;
		this.description = description;
		this._thumbi = thumbi;
		this.id = id;
		this._scheme = scheme;

	}

}