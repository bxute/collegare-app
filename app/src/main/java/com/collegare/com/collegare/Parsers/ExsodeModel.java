import java.util.ArrayList;

class ExsodeModel {

	public String uploadedon;
	public String updatededon;
	public String uploadedby;
	public StatuModel _statu;
	public String id;
	public String description;
	public String title;
	public ThumbnailModel _thumbnail;
	public ContentModel _content;
	public AccesspiModel _accesspi;
	public int commentCount;
	public ArrayList<String> tags;
	public String updatedon;
	public PlayerModel _player;

	public ExsodeModel(String uploadedon, String updatededon, String uploadedby, StatuModel statu, String id, String description, String title, ThumbnailModel thumbnail, ContentModel content, AccesspiModel accesspi, int commentCount, ArrayList<String> tags, String updatedon, PlayerModel player) {

		this.uploadedon = uploadedon;
		this.updatededon = updatededon;
		this.uploadedby = uploadedby;
		this._statu = statu;
		this.id = id;
		this.description = description;
		this.title = title;
		this._thumbnail = thumbnail;
		this._content = content;
		this._accesspi = accesspi;
		this.commentCount = commentCount;
		this.tags = tags;
		this.updatedon = updatedon;
		this._player = player;

	}

}