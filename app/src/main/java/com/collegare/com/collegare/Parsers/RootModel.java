
class RootModel {

	public SeconModel _secon;
	public int ratingCount;
	public int viewCount;
	public String commentVote;
	public String rate;
	public LooseModel _loose;
	public String meme;
	public String syndicate;
	public String apiVersion;
	public String updatedon;
	public String uploadedby;
	public int favoriteCount;

	public RootModel(SeconModel secon, int ratingCount, int viewCount, String commentVote, String rate, LooseModel loose, String meme, String syndicate, String apiVersion, String updatedon, String uploadedby, int favoriteCount) {

		this._secon = secon;
		this.ratingCount = ratingCount;
		this.viewCount = viewCount;
		this.commentVote = commentVote;
		this.rate = rate;
		this._loose = loose;
		this.meme = meme;
		this.syndicate = syndicate;
		this.apiVersion = apiVersion;
		this.updatedon = updatedon;
		this.uploadedby = uploadedby;
		this.favoriteCount = favoriteCount;

	}

}