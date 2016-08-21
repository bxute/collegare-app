
class RootModel {

	public String updatedon;
	public int favoriteCount;
	public String commentVote;
	public String meme;
	public String apiVersion;
	public String syndicate;
	public String uploadedby;
	public CounlModel _counl;
	public SeconModel _secon;
	public String rate;
	public int viewCount;
	public int ratingCount;

	public RootModel(String updatedon, int favoriteCount, String commentVote, String meme, String apiVersion, String syndicate, String uploadedby, CounlModel counl, SeconModel secon, String rate, int viewCount, int ratingCount) {

		this.updatedon = updatedon;
		this.favoriteCount = favoriteCount;
		this.commentVote = commentVote;
		this.meme = meme;
		this.apiVersion = apiVersion;
		this.syndicate = syndicate;
		this.uploadedby = uploadedby;
		this._counl = counl;
		this._secon = secon;
		this.rate = rate;
		this.viewCount = viewCount;
		this.ratingCount = ratingCount;

	}

}