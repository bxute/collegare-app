
class RootModel {

	public String commentVote;
	public int ratingCount;
	public SeatModel _seat;
	public String syndicate;
	public int duration;
	public int favoriteCount;
	public String rate;
	public String meme;
	public String uploadedon;
	public CounlModel _counl;
	public String uploadedby;
	public String apiVersion;
	public int viewCount;
	public String updatedon;

	public RootModel(String commentVote, int ratingCount, SeatModel seat, String syndicate, int duration, int favoriteCount, String rate, String meme, String uploadedon, CounlModel counl, String uploadedby, String apiVersion, int viewCount, String updatedon) {

		this.commentVote = commentVote;
		this.ratingCount = ratingCount;
		this._seat = seat;
		this.syndicate = syndicate;
		this.duration = duration;
		this.favoriteCount = favoriteCount;
		this.rate = rate;
		this.meme = meme;
		this.uploadedon = uploadedon;
		this._counl = counl;
		this.uploadedby = uploadedby;
		this.apiVersion = apiVersion;
		this.viewCount = viewCount;
		this.updatedon = updatedon;

	}

}