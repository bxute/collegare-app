
class RootModel {

	public int viewCount;
	public String rate;
	public String apiVersion;
	public int ratingCount;
	public String commentVote;
	public String syndicate;
	public SeperModel _seper;
	public String uploadedon;
	public int duration;
	public int favoriteCount;
	public String updatedon;
	public String uploadedby;
	public CounlModel _counl;
	public String set;

	public RootModel(int viewCount, String rate, String apiVersion, int ratingCount, String commentVote, String syndicate, SeperModel seper, String uploadedon, int duration, int favoriteCount, String updatedon, String uploadedby, CounlModel counl, String set) {

		this.viewCount = viewCount;
		this.rate = rate;
		this.apiVersion = apiVersion;
		this.ratingCount = ratingCount;
		this.commentVote = commentVote;
		this.syndicate = syndicate;
		this._seper = seper;
		this.uploadedon = uploadedon;
		this.duration = duration;
		this.favoriteCount = favoriteCount;
		this.updatedon = updatedon;
		this.uploadedby = uploadedby;
		this._counl = counl;
		this.set = set;

	}

}