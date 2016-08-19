import java.util.ArrayList;

class SoldModel {

	public String uploadedon;
	public ThumbnailModel _thumbnail;
	public int commentCount;
	public String id;
	public AccesspiModel _accesspi;
	public String updatededon;
	public PlayerModel _player;
	public String updatedon;
	public String title;
	public String description;
	public ArrayList<String> tags;
	public StatuModel _statu;
	public String uploadedby;
	public ContentModel _content;

	public SoldModel(String uploadedon, ThumbnailModel thumbnail, int commentCount, String id, AccesspiModel accesspi, String updatededon, PlayerModel player, String updatedon, String title, String description, ArrayList<String> tags, StatuModel statu, String uploadedby, ContentModel content) {

		this.uploadedon = uploadedon;
		this._thumbnail = thumbnail;
		this.commentCount = commentCount;
		this.id = id;
		this._accesspi = accesspi;
		this.updatededon = updatededon;
		this._player = player;
		this.updatedon = updatedon;
		this.title = title;
		this.description = description;
		this.tags = tags;
		this._statu = statu;
		this.uploadedby = uploadedby;
		this._content = content;

	}

}