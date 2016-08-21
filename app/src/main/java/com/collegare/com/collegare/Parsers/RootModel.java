
class RootModel {

	public LooseModel _loose;
	public String syndicate;
	public int viewCount;
	public String commentVote;
	public int ratingCount;
	public String apiVersion;
	public String rate;
	public String uploadedby;
	public String updatedon;
	public int favoriteCount;
	public SeconModel _secon;
	public String meme;

	public RootModel(LooseModel loose, String syndicate, int viewCount, String commentVote, int ratingCount, String apiVersion, String rate, String uploadedby, String updatedon, int favoriteCount, SeconModel secon, String meme) {

		this._loose = loose;
		this.syndicate = syndicate;
		this.viewCount = viewCount;
		this.commentVote = commentVote;
		this.ratingCount = ratingCount;
		this.apiVersion = apiVersion;
		this.rate = rate;
		this.uploadedby = uploadedby;
		this.updatedon = updatedon;
		this.favoriteCount = favoriteCount;
		this._secon = secon;
		this.meme = meme;

	}

}