import java.util.ArrayList;

class ItemModel {

	public int favoriteCount;
	public String aspectRatio;
	public ThumbnailModel _thumbnail;
	public int commentCount;
	public String id;
	public String title;
	public StatuModel _statu;
	public ContentModel _content;
	public int ratingCount;
	public String updated;
	public String uploader;
	public int duration;
	public String description;
	public PlayerModel _player;
	public int viewCount;
	public String category;
	public AccesspiModel _accesspi;
	public ArrayList<String> tags;
	public String uploaded;

	public ItemModel(int favoriteCount, String aspectRatio, ThumbnailModel thumbnail, int commentCount, String id, String title, StatuModel statu, ContentModel content, int ratingCount, String updated, String uploader, int duration, String description, PlayerModel player, int viewCount, String category, AccesspiModel accesspi, ArrayList<String> tags, String uploaded) {

		this.favoriteCount = favoriteCount;
		this.aspectRatio = aspectRatio;
		this._thumbnail = thumbnail;
		this.commentCount = commentCount;
		this.id = id;
		this.title = title;
		this._statu = statu;
		this._content = content;
		this.ratingCount = ratingCount;
		this.updated = updated;
		this.uploader = uploader;
		this.duration = duration;
		this.description = description;
		this._player = player;
		this.viewCount = viewCount;
		this.category = category;
		this._accesspi = accesspi;
		this.tags = tags;
		this.uploaded = uploaded;

	}

}