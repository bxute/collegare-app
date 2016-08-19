import java.util.ArrayList;

class SoldModel {

	public ThumbnailModel _thumbnail;
	public ArrayList<String> tags;
	public ContentModel _content;
	public String id;
	public String title;
	public StatuModel _statu;
	public String uploadedon;
	public AccesspiModel _accesspi;
	public String updatededon;
	public String uploadedby;
	public String description;
	public PlayerModel _player;
	public String updatedon;
	public int commentCount;

	public SoldModel(ThumbnailModel thumbnail, ArrayList<String> tags, ContentModel content, String id, String title, StatuModel statu, String uploadedon, AccesspiModel accesspi, String updatededon, String uploadedby, String description, PlayerModel player, String updatedon, int commentCount) {

		this._thumbnail = thumbnail;
		this.tags = tags;
		this._content = content;
		this.id = id;
		this.title = title;
		this._statu = statu;
		this.uploadedon = uploadedon;
		this._accesspi = accesspi;
		this.updatededon = updatededon;
		this.uploadedby = uploadedby;
		this.description = description;
		this._player = player;
		this.updatedon = updatedon;
		this.commentCount = commentCount;

	}

}