import java.util.ArrayList;

class RedeModel {

	public String title;
	public ContentModel _content;
	public String description;
	public PlayerModel _player;
	public String id;
	public SyndicateModel _syndicate;
	public ConModel _con;
	public ArrayList<String> tags;
	public ThumbiModel _thumbi;
	public int commentCount;

	public RedeModel(String title, ContentModel content, String description, PlayerModel player, String id, SyndicateModel syndicate, ConModel con, ArrayList<String> tags, ThumbiModel thumbi, int commentCount) {

		this.title = title;
		this._content = content;
		this.description = description;
		this._player = player;
		this.id = id;
		this._syndicate = syndicate;
		this._con = con;
		this.tags = tags;
		this._thumbi = thumbi;
		this.commentCount = commentCount;

	}

}