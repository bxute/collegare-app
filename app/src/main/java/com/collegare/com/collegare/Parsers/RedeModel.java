import java.util.ArrayList;

class RedeModel {

	public SchemeModel _scheme;
	public String aspectRatio;
	public PlayerModel _player;
	public String title;
	public int favoriteCount;
	public String description;
	public String syndicate;
	public MegernModel _megern;
	public String id;
	public String uploadedon;
	public int viewCount;
	public String rate;
	public ThumbiModel _thumbi;
	public String commentVote;
	public int commentCount;
	public int ratingCount;
	public ArrayList<String> tags;
	public ContentModel _content;

	public RedeModel(SchemeModel scheme, String aspectRatio, PlayerModel player, String title, int favoriteCount, String description, String syndicate, MegernModel megern, String id, String uploadedon, int viewCount, String rate, ThumbiModel thumbi, String commentVote, int commentCount, int ratingCount, ArrayList<String> tags, ContentModel content) {

		this._scheme = scheme;
		this.aspectRatio = aspectRatio;
		this._player = player;
		this.title = title;
		this.favoriteCount = favoriteCount;
		this.description = description;
		this.syndicate = syndicate;
		this._megern = megern;
		this.id = id;
		this.uploadedon = uploadedon;
		this.viewCount = viewCount;
		this.rate = rate;
		this._thumbi = thumbi;
		this.commentVote = commentVote;
		this.commentCount = commentCount;
		this.ratingCount = ratingCount;
		this.tags = tags;
		this._content = content;

	}

}