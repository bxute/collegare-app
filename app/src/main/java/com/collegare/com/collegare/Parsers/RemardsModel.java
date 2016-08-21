import java.util.ArrayList;

class RemardsModel {

	public SchemeModel _scheme;
	public String description;
	public int commentCount;
	public PlayerModel _player;
	public MegernModel _megern;
	public ArrayList<String> tags;
	public ContentModel _content;
	public String title;
	public ThumbiModel _thumbi;

	public RemardsModel(SchemeModel scheme, String description, int commentCount, PlayerModel player, MegernModel megern, ArrayList<String> tags, ContentModel content, String title, ThumbiModel thumbi) {

		this._scheme = scheme;
		this.description = description;
		this.commentCount = commentCount;
		this._player = player;
		this._megern = megern;
		this.tags = tags;
		this._content = content;
		this.title = title;
		this._thumbi = thumbi;

	}

}