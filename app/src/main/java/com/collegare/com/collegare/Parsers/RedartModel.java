import java.util.ArrayList;

class RedartModel {

	public String title;
	public RuseModel _ruse;
	public PlayerModel _player;
	public String description;
	public ArrayList<String> tags;
	public int commentCount;
	public ThumbiModel _thumbi;
	public ShockedModel _shocked;
	public ContentModel _content;

	public RedartModel(String title, RuseModel ruse, PlayerModel player, String description, ArrayList<String> tags, int commentCount, ThumbiModel thumbi, ShockedModel shocked, ContentModel content) {

		this.title = title;
		this._ruse = ruse;
		this._player = player;
		this.description = description;
		this.tags = tags;
		this.commentCount = commentCount;
		this._thumbi = thumbi;
		this._shocked = shocked;
		this._content = content;

	}

}