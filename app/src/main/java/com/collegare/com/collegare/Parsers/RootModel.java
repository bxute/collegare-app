
class RootModel {

	public String meme;
	public int viewCount;
	public CounlModel _counl;
	public String commentVote;
	public String apiVersion;
	public String rate;
	public int favoriteCount;
	public String updatedon;
	public int ratingCount;
	public String uploadedby;
	public String syndicate;
	public SeconModel _secon;

	public RootModel(String meme, int viewCount, CounlModel counl, String commentVote, String apiVersion, String rate, int favoriteCount, String updatedon, int ratingCount, String uploadedby, String syndicate, SeconModel secon) {

		this.meme = meme;
		this.viewCount = viewCount;
		this._counl = counl;
		this.commentVote = commentVote;
		this.apiVersion = apiVersion;
		this.rate = rate;
		this.favoriteCount = favoriteCount;
		this.updatedon = updatedon;
		this.ratingCount = ratingCount;
		this.uploadedby = uploadedby;
		this.syndicate = syndicate;
		this._secon = secon;

	}

}