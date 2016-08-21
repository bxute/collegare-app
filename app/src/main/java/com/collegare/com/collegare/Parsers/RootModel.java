
class RootModel {

	public String commentVote;
	public LooseModel _loose;
	public String syndicate;
	public String apiVersion;
	public int favoriteCount;
	public int ratingCount;
	public String meme;
	public int viewCount;
	public String rate;
	public String uploadedby;
	public SeconModel _secon;
	public String updatedon;

	public RootModel(String commentVote, LooseModel loose, String syndicate, String apiVersion, int favoriteCount, int ratingCount, String meme, int viewCount, String rate, String uploadedby, SeconModel secon, String updatedon) {

		this.commentVote = commentVote;
		this._loose = loose;
		this.syndicate = syndicate;
		this.apiVersion = apiVersion;
		this.favoriteCount = favoriteCount;
		this.ratingCount = ratingCount;
		this.meme = meme;
		this.viewCount = viewCount;
		this.rate = rate;
		this.uploadedby = uploadedby;
		this._secon = secon;
		this.updatedon = updatedon;

	}

}