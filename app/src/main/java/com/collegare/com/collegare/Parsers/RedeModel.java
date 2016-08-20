import java.util.ArrayList;

class RedeModel {

	public ArrayList<String> tags;
	public ContentModel _content;
	public String description;
	public ShemdModel _shemd;
	public ThumbiModel _thumbi;
	public ConsModel _cons;
	public int commentCount;
	public String title;
	public String id;
	public PlayerModel _player;

	public RedeModel(ArrayList<String> tags, ContentModel content, String description, ShemdModel shemd, ThumbiModel thumbi, ConsModel cons, int commentCount, String title, String id, PlayerModel player) {

		this.tags = tags;
		this._content = content;
		this.description = description;
		this._shemd = shemd;
		this._thumbi = thumbi;
		this._cons = cons;
		this.commentCount = commentCount;
		this.title = title;
		this.id = id;
		this._player = player;

	}

}