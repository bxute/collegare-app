import java.util.ArrayList;

class RedartModel {

	public ShockedModel _shocked;
	public ContentModel _content;
	public ThumbiModel _thumbi;
	public String commentVote;
	public String rate;
	public String title;
	public String uploadedon;
	public String id;
	public PlayerModel _player;
	public String description;
	public int viewCount;
	public RuseModel _ruse;
	public int commentCount;
	public int ratingCount;
	public int favoriteCount;
	public ArrayList<String> tags;
	public String syndicate;

	public RedartModel(ShockedModel shocked, ContentModel content, ThumbiModel thumbi, String commentVote, String rate, String title, String uploadedon, String id, PlayerModel player, String description, int viewCount, RuseModel ruse, int commentCount, int ratingCount, int favoriteCount, ArrayList<String> tags, String syndicate) {

		this._shocked = shocked;
		this._content = content;
		this._thumbi = thumbi;
		this.commentVote = commentVote;
		this.rate = rate;
		this.title = title;
		this.uploadedon = uploadedon;
		this.id = id;
		this._player = player;
		this.description = description;
		this.viewCount = viewCount;
		this._ruse = ruse;
		this.commentCount = commentCount;
		this.ratingCount = ratingCount;
		this.favoriteCount = favoriteCount;
		this.tags = tags;
		this.syndicate = syndicate;

	}

}