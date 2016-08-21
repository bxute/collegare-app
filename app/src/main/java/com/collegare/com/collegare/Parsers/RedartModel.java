import java.util.ArrayList;

class RedartModel {

	public String description;
	public String rate;
	public String title;
	public int commentCount;
	public ShockedModel _shocked;
	public int favoriteCount;
	public ThumbiModel _thumbi;
	public String commentVote;
	public String uploadedon;
	public int viewCount;
	public ContentModel _content;
	public String syndicate;
	public ArrayList<String> tags;
	public String id;
	public int ratingCount;
	public RuseModel _ruse;
	public PlayerModel _player;

	public RedartModel(String description, String rate, String title, int commentCount, ShockedModel shocked, int favoriteCount, ThumbiModel thumbi, String commentVote, String uploadedon, int viewCount, ContentModel content, String syndicate, ArrayList<String> tags, String id, int ratingCount, RuseModel ruse, PlayerModel player) {

		this.description = description;
		this.rate = rate;
		this.title = title;
		this.commentCount = commentCount;
		this._shocked = shocked;
		this.favoriteCount = favoriteCount;
		this._thumbi = thumbi;
		this.commentVote = commentVote;
		this.uploadedon = uploadedon;
		this.viewCount = viewCount;
		this._content = content;
		this.syndicate = syndicate;
		this.tags = tags;
		this.id = id;
		this.ratingCount = ratingCount;
		this._ruse = ruse;
		this._player = player;

	}

}