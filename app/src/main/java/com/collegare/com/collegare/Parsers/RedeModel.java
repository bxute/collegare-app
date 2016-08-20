import java.util.ArrayList;

class RedeModel {

	public ThumbiModel _thumbi;
	public String id;
	public int commentCount;
	public SyncdModel _syncd;
	public ArrayList<String> tags;
	public String description;
	public String title;
	public ContentModel _content;
	public ConModel _con;
	public PlayerModel _player;

	public RedeModel(ThumbiModel thumbi, String id, int commentCount, SyncdModel syncd, ArrayList<String> tags, String description, String title, ContentModel content, ConModel con, PlayerModel player) {

		this._thumbi = thumbi;
		this.id = id;
		this.commentCount = commentCount;
		this._syncd = syncd;
		this.tags = tags;
		this.description = description;
		this.title = title;
		this._content = content;
		this._con = con;
		this._player = player;

	}

}