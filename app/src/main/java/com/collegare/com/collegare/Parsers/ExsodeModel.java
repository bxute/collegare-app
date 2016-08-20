import java.util.ArrayList;

class ExsodeModel {

	public String title;
	public ContentModel _content;
	public AccesspiModel _accesspi;
	public String description;
	public ArrayList<String> tags;
	public String uploadedby;
	public StatuModel _statu;
	public PlayerModel _player;
	public String updatedon;
	public String uploadedon;
	public String id;
	public String updatededon;
	public int commentCount;
	public ThumbnailModel _thumbnail;

	public ExsodeModel(String title, ContentModel content, AccesspiModel accesspi, String description, ArrayList<String> tags, String uploadedby, StatuModel statu, PlayerModel player, String updatedon, String uploadedon, String id, String updatededon, int commentCount, ThumbnailModel thumbnail) {

		this.title = title;
		this._content = content;
		this._accesspi = accesspi;
		this.description = description;
		this.tags = tags;
		this.uploadedby = uploadedby;
		this._statu = statu;
		this._player = player;
		this.updatedon = updatedon;
		this.uploadedon = uploadedon;
		this.id = id;
		this.updatededon = updatededon;
		this.commentCount = commentCount;
		this._thumbnail = thumbnail;

	}

}