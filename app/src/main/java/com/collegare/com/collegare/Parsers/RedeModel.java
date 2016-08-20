import java.util.ArrayList;

class RedeModel {

	public ContentModel _content;
	public String updatedon;
	public PlayerModel _player;
	public ThumbiModel _thumbi;
	public String uploadedon;
	public String title;
	public ConterieModel _conterie;
	public String id;
	public String updatededon;
	public String uploadedby;
	public SyndicateModel _syndicate;
	public String description;
	public int commentCount;
	public ArrayList<String> tags;

	public RedeModel(ContentModel content, String updatedon, PlayerModel player, ThumbiModel thumbi, String uploadedon, String title, ConterieModel conterie, String id, String updatededon, String uploadedby, SyndicateModel syndicate, String description, int commentCount, ArrayList<String> tags) {

		this._content = content;
		this.updatedon = updatedon;
		this._player = player;
		this._thumbi = thumbi;
		this.uploadedon = uploadedon;
		this.title = title;
		this._conterie = conterie;
		this.id = id;
		this.updatededon = updatededon;
		this.uploadedby = uploadedby;
		this._syndicate = syndicate;
		this.description = description;
		this.commentCount = commentCount;
		this.tags = tags;

	}

}