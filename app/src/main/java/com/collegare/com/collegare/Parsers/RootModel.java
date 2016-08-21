
class RootModel {

	public int viewCount;
	public String updatedon;
	public String apiVersion;
	public String syndicate;
	public String meme;
	public String commentVote;
	public String uploadedby;
	public int favoriteCount;
	public CounlModel _counl;
	public SeconModel _secon;
	public String rate;
	public int ratingCount;

	public RootModel(int viewCount, String updatedon, String apiVersion, String syndicate, String meme, String commentVote, String uploadedby, int favoriteCount, CounlModel counl, SeconModel secon, String rate, int ratingCount) {

		this.viewCount = viewCount;
		this.updatedon = updatedon;
		this.apiVersion = apiVersion;
		this.syndicate = syndicate;
		this.meme = meme;
		this.commentVote = commentVote;
		this.uploadedby = uploadedby;
		this.favoriteCount = favoriteCount;
		this._counl = counl;
		this._secon = secon;
		this.rate = rate;
		this.ratingCount = ratingCount;

	}

}