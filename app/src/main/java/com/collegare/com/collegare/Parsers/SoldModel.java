import java.util.ArrayList;

class SoldModel {

	public String updatedon;
	public ThumbnailModel _thumbnail;
	public StatuModel _statu;
	public ArrayList<String> tags;
	public String updatededon;
	public String id;
	public String uploadedon;
	public int commentCount;
	public AccesspiModel _accesspi;
	public ContentModel _content;
	public PlayerModel _player;
	public String description;
	public String uploadedby;
	public String title;

	public SoldModel(String updatedon, ThumbnailModel thumbnail, StatuModel statu, ArrayList<String> tags, String updatededon, String id, String uploadedon, int commentCount, AccesspiModel accesspi, ContentModel content, PlayerModel player, String description, String uploadedby, String title) {

		this.updatedon = updatedon;
		this._thumbnail = thumbnail;
		this._statu = statu;
		this.tags = tags;
		this.updatededon = updatededon;
		this.id = id;
		this.uploadedon = uploadedon;
		this.commentCount = commentCount;
		this._accesspi = accesspi;
		this._content = content;
		this._player = player;
		this.description = description;
		this.uploadedby = uploadedby;
		this.title = title;

	}

}