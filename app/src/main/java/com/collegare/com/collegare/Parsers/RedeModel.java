import java.util.ArrayList;

class RedeModel {

	public SyndicateModel _syndicate;
	public ThumbiModel _thumbi;
	public ArrayList<String> tags;
	public String title;
	public PlayerModel _player;
	public String id;
	public String description;
	public ContentModel _content;
	public ConModel _con;
	public int commentCount;

	public RedeModel(SyndicateModel syndicate, ThumbiModel thumbi, ArrayList<String> tags, String title, PlayerModel player, String id, String description, ContentModel content, ConModel con, int commentCount) {

		this._syndicate = syndicate;
		this._thumbi = thumbi;
		this.tags = tags;
		this.title = title;
		this._player = player;
		this.id = id;
		this.description = description;
		this._content = content;
		this._con = con;
		this.commentCount = commentCount;

	}

}