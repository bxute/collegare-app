
class RootModel {

	public String uploadedon;
	public int viewCount;
	public CounlModel _counl;
	public SeconModel _secon;
	public String commentVote;
	public String uploadedby;
	public String updatedon;
	public String syndicate;
	public String aspectRatio;
	public String meme;
	public String rate;
	public int favoriteCount;
	public String apiVersion;
	public int ratingCount;

	public RootModel(String uploadedon, int viewCount, CounlModel counl, SeconModel secon, String commentVote, String uploadedby, String updatedon, String syndicate, String aspectRatio, String meme, String rate, int favoriteCount, String apiVersion, int ratingCount) {

		this.uploadedon = uploadedon;
		this.viewCount = viewCount;
		this._counl = counl;
		this._secon = secon;
		this.commentVote = commentVote;
		this.uploadedby = uploadedby;
		this.updatedon = updatedon;
		this.syndicate = syndicate;
		this.aspectRatio = aspectRatio;
		this.meme = meme;
		this.rate = rate;
		this.favoriteCount = favoriteCount;
		this.apiVersion = apiVersion;
		this.ratingCount = ratingCount;

	}

}