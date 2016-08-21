
class MetightModel {

	public int ratingCount;
	public String uploadedon;
	public String aspectRatio;
	public String rate;
	public int viewCount;
	public int favoriteCount;
	public String type;
	public RomeModel _rome;
	public String syndicate;
	public String commentVote;

	public MetightModel(int ratingCount, String uploadedon, String aspectRatio, String rate, int viewCount, int favoriteCount, String type, RomeModel rome, String syndicate, String commentVote) {

		this.ratingCount = ratingCount;
		this.uploadedon = uploadedon;
		this.aspectRatio = aspectRatio;
		this.rate = rate;
		this.viewCount = viewCount;
		this.favoriteCount = favoriteCount;
		this.type = type;
		this._rome = rome;
		this.syndicate = syndicate;
		this.commentVote = commentVote;

	}

}