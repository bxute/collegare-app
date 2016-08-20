import java.util.ArrayList;

class RedeModel {

	public String id;
	public PlayerModel _player;
	public String description;
	public ArrayList<String> tags;
	public ContentModel _content;
	public String title;
	public int commentCount;
	public ConModel _con;
	public ThumbiModel _thumbi;
	public SyndicateModel _syndicate;

	public RedeModel(String id, PlayerModel player, String description, ArrayList<String> tags, ContentModel content, String title, int commentCount, ConModel con, ThumbiModel thumbi, SyndicateModel syndicate) {

		this.id = id;
		this._player = player;
		this.description = description;
		this.tags = tags;
		this._content = content;
		this.title = title;
		this.commentCount = commentCount;
		this._con = con;
		this._thumbi = thumbi;
		this._syndicate = syndicate;

	}

}