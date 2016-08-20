import java.util.ArrayList;

class RedeModel {

	public ThumbiModel _thumbi;
	public String id;
	public String description;
	public ArrayList<String> tags;
	public String title;
	public PlayerModel _player;
	public SyndicateModel _syndicate;
	public ContentModel _content;
	public int commentCount;
	public ConModel _con;

	public RedeModel(ThumbiModel thumbi, String id, String description, ArrayList<String> tags, String title, PlayerModel player, SyndicateModel syndicate, ContentModel content, int commentCount, ConModel con) {

		this._thumbi = thumbi;
		this.id = id;
		this.description = description;
		this.tags = tags;
		this.title = title;
		this._player = player;
		this._syndicate = syndicate;
		this._content = content;
		this.commentCount = commentCount;
		this._con = con;

	}

}