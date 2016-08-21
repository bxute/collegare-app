import java.util.ArrayList;

class RedartModel {

	public ContentModel _content;
	public String description;
	public int commentCount;
	public int ratingCount;
	public String uploadedon;
	public int viewCount;
	public String commentVote;
	public ArrayList<String> tags;
	public String rate;
	public ShockedModel _shocked;
	public String syndicate;
	public PlayerModel _player;
	public String id;
	public ThumbiModel _thumbi;
	public RuseModel _ruse;
	public String title;
	public int favoriteCount;

	public RedartModel(ContentModel content, String description, int commentCount, int ratingCount, String uploadedon, int viewCount, String commentVote, ArrayList<String> tags, String rate, ShockedModel shocked, String syndicate, PlayerModel player, String id, ThumbiModel thumbi, RuseModel ruse, String title, int favoriteCount) {

		this._content = content;
		this.description = description;
		this.commentCount = commentCount;
		this.ratingCount = ratingCount;
		this.uploadedon = uploadedon;
		this.viewCount = viewCount;
		this.commentVote = commentVote;
		this.tags = tags;
		this.rate = rate;
		this._shocked = shocked;
		this.syndicate = syndicate;
		this._player = player;
		this.id = id;
		this._thumbi = thumbi;
		this._ruse = ruse;
		this.title = title;
		this.favoriteCount = favoriteCount;

	}

}