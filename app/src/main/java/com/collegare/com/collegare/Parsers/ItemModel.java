import java.util.ArrayList;

class ItemModel {

	public ThumbnailModel _thumbnail;
	public ArrayList<String> tags;
	public ContentModel _content;
	public String description;
	public String category;
	public int duration;
	public int startIndex;
	public AccesspiModel _accesspi;
	public StatuModel _statu;
	public String uploader;
	public int favoriteCount;
	public int commentCount;
	public int itemsPerPage;
	public int viewCount;
	public String uploaded;
	public int ratingCount;
	public int totalItems;
	public String updated;
	public PlayerModel _player;
	public String aspectRatio;
	public String title;
	public String id;

	public ItemModel(ThumbnailModel thumbnail, ArrayList<String> tags, ContentModel content, String description, String category, int duration, int startIndex, AccesspiModel accesspi, StatuModel statu, String uploader, int favoriteCount, int commentCount, int itemsPerPage, int viewCount, String uploaded, int ratingCount, int totalItems, String updated, PlayerModel player, String aspectRatio, String title, String id) {

		this._thumbnail = thumbnail;
		this.tags = tags;
		this._content = content;
		this.description = description;
		this.category = category;
		this.duration = duration;
		this.startIndex = startIndex;
		this._accesspi = accesspi;
		this._statu = statu;
		this.uploader = uploader;
		this.favoriteCount = favoriteCount;
		this.commentCount = commentCount;
		this.itemsPerPage = itemsPerPage;
		this.viewCount = viewCount;
		this.uploaded = uploaded;
		this.ratingCount = ratingCount;
		this.totalItems = totalItems;
		this.updated = updated;
		this._player = player;
		this.aspectRatio = aspectRatio;
		this.title = title;
		this.id = id;

	}

}