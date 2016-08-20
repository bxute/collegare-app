import java.util.ArrayList;

class RedemeModel {

	public String id;
	public String uploadedby;
	public SratModel _srat;
	public ContentModel _content;
	public String description;
	public PlayerModel _player;
	public String updatededon;
	public String updatedon;
	public ThumbModel _thumb;
	public ArrayList<String> tags;
	public int commentCount;
	public ControlModel _control;
	public String title;
	public String uploadedon;

	public RedemeModel(String id, String uploadedby, SratModel srat, ContentModel content, String description, PlayerModel player, String updatededon, String updatedon, ThumbModel thumb, ArrayList<String> tags, int commentCount, ControlModel control, String title, String uploadedon) {

		this.id = id;
		this.uploadedby = uploadedby;
		this._srat = srat;
		this._content = content;
		this.description = description;
		this._player = player;
		this.updatededon = updatededon;
		this.updatedon = updatedon;
		this._thumb = thumb;
		this.tags = tags;
		this.commentCount = commentCount;
		this._control = control;
		this.title = title;
		this.uploadedon = uploadedon;

	}

}