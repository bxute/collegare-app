import java.util.ArrayList;

class ResModel {

	public int ratingCount;
	public SigModel _sig;
	public String title;
	public String category;
	public int viewCount;
	public String aspectRatio;
	public String uploaded;
	public int favoriteCount;
	public String updated;
	public String id;
	public int duration;
	public QstatusModel _qstatus;
	public ArrayList<String> tags;
	public int commentCount;
	public SemanticsModel _semantics;
	public McontentModel _mcontent;
	public String uploader;
	public ThumbnailModel _thumbnail;
	public String description;

	public ResModel(int ratingCount, SigModel sig, String title, String category, int viewCount, String aspectRatio, String uploaded, int favoriteCount, String updated, String id, int duration, QstatusModel qstatus, ArrayList<String> tags, int commentCount, SemanticsModel semantics, McontentModel mcontent, String uploader, ThumbnailModel thumbnail, String description) {

		this.ratingCount = ratingCount;
		this._sig = sig;
		this.title = title;
		this.category = category;
		this.viewCount = viewCount;
		this.aspectRatio = aspectRatio;
		this.uploaded = uploaded;
		this.favoriteCount = favoriteCount;
		this.updated = updated;
		this.id = id;
		this.duration = duration;
		this._qstatus = qstatus;
		this.tags = tags;
		this.commentCount = commentCount;
		this._semantics = semantics;
		this._mcontent = mcontent;
		this.uploader = uploader;
		this._thumbnail = thumbnail;
		this.description = description;

	}

}