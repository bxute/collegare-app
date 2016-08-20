import java.util.ArrayList;

class RedeModel {

	public String description;
	public PlayerModel _player;
	public ContentModel _content;
	public String id;
	public TeconsModel _tecons;
	public ThumbiModel _thumbi;
	public ShemdModel _shemd;
	public ArrayList<String> tags;
	public int commentCount;
	public String title;

	public RedeModel(String description, PlayerModel player, ContentModel content, String id, TeconsModel tecons, ThumbiModel thumbi, ShemdModel shemd, ArrayList<String> tags, int commentCount, String title) {

		this.description = description;
		this._player = player;
		this._content = content;
		this.id = id;
		this._tecons = tecons;
		this._thumbi = thumbi;
		this._shemd = shemd;
		this.tags = tags;
		this.commentCount = commentCount;
		this.title = title;

	}

}