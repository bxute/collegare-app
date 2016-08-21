
class RootModel {

	public LooseModel _loose;
	public String apiVersion;
	public String meme;
	public String rate;
	public String updatedon;
	public SeconModel _secon;
	public int viewCount;
	public String commentVote;
	public int ratingCount;
	public String syndicate;
	public int favoriteCount;
	public String uploadedby;

	public RootModel(LooseModel loose, String apiVersion, String meme, String rate, String updatedon, SeconModel secon, int viewCount, String commentVote, int ratingCount, String syndicate, int favoriteCount, String uploadedby) {

		this._loose = loose;
		this.apiVersion = apiVersion;
		this.meme = meme;
		this.rate = rate;
		this.updatedon = updatedon;
		this._secon = secon;
		this.viewCount = viewCount;
		this.commentVote = commentVote;
		this.ratingCount = ratingCount;
		this.syndicate = syndicate;
		this.favoriteCount = favoriteCount;
		this.uploadedby = uploadedby;

	}

}