
class RootModel {

	public String commentVote;
	public CounlModel _counl;
	public String meme;
	public String rate;
	public String updatedon;
	public String apiVersion;
	public SeconModel _secon;
	public int viewCount;
	public int favoriteCount;
	public String syndicate;
	public String uploadedby;
	public int ratingCount;

	public RootModel(String commentVote, CounlModel counl, String meme, String rate, String updatedon, String apiVersion, SeconModel secon, int viewCount, int favoriteCount, String syndicate, String uploadedby, int ratingCount) {

		this.commentVote = commentVote;
		this._counl = counl;
		this.meme = meme;
		this.rate = rate;
		this.updatedon = updatedon;
		this.apiVersion = apiVersion;
		this._secon = secon;
		this.viewCount = viewCount;
		this.favoriteCount = favoriteCount;
		this.syndicate = syndicate;
		this.uploadedby = uploadedby;
		this.ratingCount = ratingCount;

	}

}