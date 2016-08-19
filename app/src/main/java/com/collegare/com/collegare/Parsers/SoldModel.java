import java.util.ArrayList;

class SoldModel {

	public PlayerModel _player;
	public int commentCount;
	public String updatededon;
	public ArrayList<String> tags;
	public String description;
	public StatuModel _statu;
	public String uploadedby;
	public String uploadedon;
	public ThumbnailModel _thumbnail;
	public String title;
	public ContentModel _content;
	public String id;
	public String updatedon;
	public AccesspiModel _accesspi;

	public SoldModel(PlayerModel player, int commentCount, String updatededon, ArrayList<String> tags, String description, StatuModel statu, String uploadedby, String uploadedon, ThumbnailModel thumbnail, String title, ContentModel content, String id, String updatedon, AccesspiModel accesspi) {

		this._player = player;
		this.commentCount = commentCount;
		this.updatededon = updatededon;
		this.tags = tags;
		this.description = description;
		this._statu = statu;
		this.uploadedby = uploadedby;
		this.uploadedon = uploadedon;
		this._thumbnail = thumbnail;
		this.title = title;
		this._content = content;
		this.id = id;
		this.updatedon = updatedon;
		this._accesspi = accesspi;

	}

}