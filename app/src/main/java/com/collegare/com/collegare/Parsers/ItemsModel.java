import java.util.ArrayList;

class ItemsModel {

	public ThumbnailModel _thumbnail;
	public String uploaded;
	public int ratingCount;
	public ArrayList<String> tags;
	public String aspectRatio;
	public String updated;
	public String id;
	public int viewCount;
	public String category;
	public int duration;
	public String uploader;
	public int favoriteCount;
	public PlayerModel _player;
	public String title;
	public int commentCount;
	public StatusModel _status;
	public ContentModel _content;
	public String description;
	public AccessControlModel _accessControl;

	public ItemsModel(ThumbnailModel thumbnail, String uploaded, int ratingCount, ArrayList<String> tags, String aspectRatio, String updated, String id, int viewCount, String category, int duration, String uploader, int favoriteCount, PlayerModel player, String title, int commentCount, StatusModel status, ContentModel content, String description, AccessControlModel accessControl) {

		this._thumbnail = thumbnail;
		this.uploaded = uploaded;
		this.ratingCount = ratingCount;
		this.tags = tags;
		this.aspectRatio = aspectRatio;
		this.updated = updated;
		this.id = id;
		this.viewCount = viewCount;
		this.category = category;
		this.duration = duration;
		this.uploader = uploader;
		this.favoriteCount = favoriteCount;
		this._player = player;
		this.title = title;
		this.commentCount = commentCount;
		this._status = status;
		this._content = content;
		this.description = description;
		this._accessControl = accessControl;

	}

}