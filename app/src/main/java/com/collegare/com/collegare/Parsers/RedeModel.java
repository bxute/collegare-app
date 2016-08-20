import java.util.ArrayList;

class RedeModel {

	public int ratingCount;
	public int favoriteCount;
	public SyndicateModel _syndicate;
	public int viewCount;
	public String title;
	public ThumbiModel _thumbi;
	public ConModel _con;
	public String uploadedon;
	public String description;
	public String id;
	public String updatedon;
	public ArrayList<String> tags;
	public String uploadedby;
	public ContentModel _content;
	public int commentCount;
	public PlayerModel _player;

	public RedeModel(int ratingCount, int favoriteCount, SyndicateModel syndicate, int viewCount, String title, ThumbiModel thumbi, ConModel con, String uploadedon, String description, String id, String updatedon, ArrayList<String> tags, String uploadedby, ContentModel content, int commentCount, PlayerModel player) {

		this.ratingCount = ratingCount;
		this.favoriteCount = favoriteCount;
		this._syndicate = syndicate;
		this.viewCount = viewCount;
		this.title = title;
		this._thumbi = thumbi;
		this._con = con;
		this.uploadedon = uploadedon;
		this.description = description;
		this.id = id;
		this.updatedon = updatedon;
		this.tags = tags;
		this.uploadedby = uploadedby;
		this._content = content;
		this.commentCount = commentCount;
		this._player = player;

	}

}