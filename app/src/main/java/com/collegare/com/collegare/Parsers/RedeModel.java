import java.util.ArrayList;

class RedeModel {

	public String description;
	public String updatedon;
	public int commentCount;
	public String id;
	public String updatededon;
	public PlayerModel _player;
	public ArrayList<String> tags;
	public SouthModel _south;
	public ControlModel _control;
	public String uploadedon;
	public String title;
	public ContentModel _content;
	public ThumbiModel _thumbi;
	public String uploadedby;

	public RedeModel(String description, String updatedon, int commentCount, String id, String updatededon, PlayerModel player, ArrayList<String> tags, SouthModel south, ControlModel control, String uploadedon, String title, ContentModel content, ThumbiModel thumbi, String uploadedby) {

		this.description = description;
		this.updatedon = updatedon;
		this.commentCount = commentCount;
		this.id = id;
		this.updatededon = updatededon;
		this._player = player;
		this.tags = tags;
		this._south = south;
		this._control = control;
		this.uploadedon = uploadedon;
		this.title = title;
		this._content = content;
		this._thumbi = thumbi;
		this.uploadedby = uploadedby;

	}

}