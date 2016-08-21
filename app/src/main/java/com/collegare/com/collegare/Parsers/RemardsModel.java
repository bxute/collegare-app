import java.util.ArrayList;

class RemardsModel {

	public ArrayList<String> tags;
	public SchemeModel _scheme;
	public ContentModel _content;
	public String title;
	public ThumbiModel _thumbi;
	public int commentCount;
	public PlayerModel _player;
	public String description;
	public MegernModel _megern;

	public RemardsModel(ArrayList<String> tags, SchemeModel scheme, ContentModel content, String title, ThumbiModel thumbi, int commentCount, PlayerModel player, String description, MegernModel megern) {

		this.tags = tags;
		this._scheme = scheme;
		this._content = content;
		this.title = title;
		this._thumbi = thumbi;
		this.commentCount = commentCount;
		this._player = player;
		this.description = description;
		this._megern = megern;

	}

}