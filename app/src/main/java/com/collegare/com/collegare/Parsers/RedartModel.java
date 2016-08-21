import java.util.ArrayList;

class RedartModel {

	public ArrayList<String> tags;
	public RuseModel _ruse;
	public String rate;
	public int ratingCount;
	public String title;
	public String description;
	public int favoriteCount;
	public String commentVote;
	public int commentCount;
	public int viewCount;
	public String syndicate;
	public ShockedModel _shocked;
	public String uploadedon;
	public ContentModel _content;
	public ThumbiModel _thumbi;
	public String id;
	public PlayerModel _player;

	public RedartModel(ArrayList<String> tags, RuseModel ruse, String rate, int ratingCount, String title, String description, int favoriteCount, String commentVote, int commentCount, int viewCount, String syndicate, ShockedModel shocked, String uploadedon, ContentModel content, ThumbiModel thumbi, String id, PlayerModel player) {

		this.tags = tags;
		this._ruse = ruse;
		this.rate = rate;
		this.ratingCount = ratingCount;
		this.title = title;
		this.description = description;
		this.favoriteCount = favoriteCount;
		this.commentVote = commentVote;
		this.commentCount = commentCount;
		this.viewCount = viewCount;
		this.syndicate = syndicate;
		this._shocked = shocked;
		this.uploadedon = uploadedon;
		this._content = content;
		this._thumbi = thumbi;
		this.id = id;
		this._player = player;

	}

}