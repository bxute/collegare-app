import java.util.ArrayList;

class RedeModel {

	public String description;
	public ArrayList<String> tags;
	public PlayerModel _player;
	public ThumbiModel _thumbi;
	public TeconsModel _tecons;
	public String title;
	public String id;
	public ShemdModel _shemd;
	public int commentCount;
	public ContentModel _content;

	public RedeModel(String description, ArrayList<String> tags, PlayerModel player, ThumbiModel thumbi, TeconsModel tecons, String title, String id, ShemdModel shemd, int commentCount, ContentModel content) {

		this.description = description;
		this.tags = tags;
		this._player = player;
		this._thumbi = thumbi;
		this._tecons = tecons;
		this.title = title;
		this.id = id;
		this._shemd = shemd;
		this.commentCount = commentCount;
		this._content = content;

	}

}