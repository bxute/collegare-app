
class RootModel {

	public String updatedon;
	public int favoriteCount;
	public int ratingCount;
	public SeconModel _secon;
	public String syndicate;
	public String meme;
	public int viewCount;
	public CounlModel _counl;
	public String rate;
	public String commentVote;
	public String apiVersion;
	public String uploadedby;

	public RootModel(String updatedon, int favoriteCount, int ratingCount, SeconModel secon, String syndicate, String meme, int viewCount, CounlModel counl, String rate, String commentVote, String apiVersion, String uploadedby) {

		this.updatedon = updatedon;
		this.favoriteCount = favoriteCount;
		this.ratingCount = ratingCount;
		this._secon = secon;
		this.syndicate = syndicate;
		this.meme = meme;
		this.viewCount = viewCount;
		this._counl = counl;
		this.rate = rate;
		this.commentVote = commentVote;
		this.apiVersion = apiVersion;
		this.uploadedby = uploadedby;

	}

}