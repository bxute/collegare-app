
class RootModel {

	public String rate;
	public String uploadedby;
	public String apiVersion;
	public String commentVote;
	public int favoriteCount;
	public String syndicate;
	public String updatedon;
	public int viewCount;
	public String meme;
	public int ratingCount;
	public SeconModel _secon;
	public LooseModel _loose;

	public RootModel(String rate, String uploadedby, String apiVersion, String commentVote, int favoriteCount, String syndicate, String updatedon, int viewCount, String meme, int ratingCount, SeconModel secon, LooseModel loose) {

		this.rate = rate;
		this.uploadedby = uploadedby;
		this.apiVersion = apiVersion;
		this.commentVote = commentVote;
		this.favoriteCount = favoriteCount;
		this.syndicate = syndicate;
		this.updatedon = updatedon;
		this.viewCount = viewCount;
		this.meme = meme;
		this.ratingCount = ratingCount;
		this._secon = secon;
		this._loose = loose;

	}

}