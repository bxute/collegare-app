import java.util.ArrayList;

class SoldModel {

	public String id;
	public AccesspiModel _accesspi;
	public String updatededon;
	public String uploadedby;
	public String title;
	public ContentModel _content;
	public int duration;
	public PlayerModel _player;
	public String uploadedon;
	public ThumbnailModel _thumbnail;
	public ArrayList<String> tags;
	public String description;
	public int viewCount;
	public int ratingCount;
	public int commentCount;
	public StatuModel _statu;
	public String updatedon;
	public String aspectRatio;
	public int favoriteCount;

	public SoldModel(String id, AccesspiModel accesspi, String updatededon, String uploadedby, String title, ContentModel content, int duration, PlayerModel player, String uploadedon, ThumbnailModel thumbnail, ArrayList<String> tags, String description, int viewCount, int ratingCount, int commentCount, StatuModel statu, String updatedon, String aspectRatio, int favoriteCount) {

		this.id = id;
		this._accesspi = accesspi;
		this.updatededon = updatededon;
		this.uploadedby = uploadedby;
		this.title = title;
		this._content = content;
		this.duration = duration;
		this._player = player;
		this.uploadedon = uploadedon;
		this._thumbnail = thumbnail;
		this.tags = tags;
		this.description = description;
		this.viewCount = viewCount;
		this.ratingCount = ratingCount;
		this.commentCount = commentCount;
		this._statu = statu;
		this.updatedon = updatedon;
		this.aspectRatio = aspectRatio;
		this.favoriteCount = favoriteCount;

	}

}