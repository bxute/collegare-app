import java.util.ArrayList;

class RedeModel {

	public PlayerModel _player;
	public int commentCount;
	public MgmtModel _mgmt;
	public ArrayList<String> tags;
	public String id;
	public String description;
	public ContentModel _content;
	public String title;
	public ThumbiModel _thumbi;
	public ShemdModel _shemd;

	public RedeModel(PlayerModel player, int commentCount, MgmtModel mgmt, ArrayList<String> tags, String id, String description, ContentModel content, String title, ThumbiModel thumbi, ShemdModel shemd) {

		this._player = player;
		this.commentCount = commentCount;
		this._mgmt = mgmt;
		this.tags = tags;
		this.id = id;
		this.description = description;
		this._content = content;
		this.title = title;
		this._thumbi = thumbi;
		this._shemd = shemd;

	}

}