
class RootModel {

	public String updatedon;
	public int viewCount;
	public String meme;
	public CounlModel _counl;
	public String commentVote;
	public String syndicate;
	public String uploadedby;
	public String rate;
	public SeatModel _seat;
	public int favoriteCount;
	public String apiVersion;
	public int ratingCount;

	public RootModel(String updatedon, int viewCount, String meme, CounlModel counl, String commentVote, String syndicate, String uploadedby, String rate, SeatModel seat, int favoriteCount, String apiVersion, int ratingCount) {

		this.updatedon = updatedon;
		this.viewCount = viewCount;
		this.meme = meme;
		this._counl = counl;
		this.commentVote = commentVote;
		this.syndicate = syndicate;
		this.uploadedby = uploadedby;
		this.rate = rate;
		this._seat = seat;
		this.favoriteCount = favoriteCount;
		this.apiVersion = apiVersion;
		this.ratingCount = ratingCount;

	}

}