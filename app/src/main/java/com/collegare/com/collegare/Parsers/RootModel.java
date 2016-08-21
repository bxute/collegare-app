
class RootModel {

	public String commentVote;
	public String rate;
	public String apiVersion;
	public int ratingCount;
	public SeconModel _secon;
	public String meme;
	public String uploadedby;
	public int favoriteCount;
	public LooseModel _loose;
	public int viewCount;
	public String syndicate;
	public String updatedon;

	public RootModel(String commentVote, String rate, String apiVersion, int ratingCount, SeconModel secon, String meme, String uploadedby, int favoriteCount, LooseModel loose, int viewCount, String syndicate, String updatedon) {

		this.commentVote = commentVote;
		this.rate = rate;
		this.apiVersion = apiVersion;
		this.ratingCount = ratingCount;
		this._secon = secon;
		this.meme = meme;
		this.uploadedby = uploadedby;
		this.favoriteCount = favoriteCount;
		this._loose = loose;
		this.viewCount = viewCount;
		this.syndicate = syndicate;
		this.updatedon = updatedon;

	}

}