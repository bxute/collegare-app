
class RootModel {

	public String meme;
	public int viewCount;
	public String updatedon;
	public String uploadedby;
	public int ratingCount;
	public String rate;
	public String syndicate;
	public int favoriteCount;
	public String commentVote;
	public SeconModel _secon;
	public String apiVersion;
	public CounlModel _counl;

	public RootModel(String meme, int viewCount, String updatedon, String uploadedby, int ratingCount, String rate, String syndicate, int favoriteCount, String commentVote, SeconModel secon, String apiVersion, CounlModel counl) {

		this.meme = meme;
		this.viewCount = viewCount;
		this.updatedon = updatedon;
		this.uploadedby = uploadedby;
		this.ratingCount = ratingCount;
		this.rate = rate;
		this.syndicate = syndicate;
		this.favoriteCount = favoriteCount;
		this.commentVote = commentVote;
		this._secon = secon;
		this.apiVersion = apiVersion;
		this._counl = counl;

	}

}