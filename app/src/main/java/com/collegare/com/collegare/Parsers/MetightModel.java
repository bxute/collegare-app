
class MetightModel {

	public RomeModel _rome;
	public int viewCount;
	public String rate;
	public String syndicate;
	public String commentVote;
	public int favoriteCount;
	public int ratingCount;
	public String type;
	public String aspectRatio;
	public String uploadedon;

	public MetightModel(RomeModel rome, int viewCount, String rate, String syndicate, String commentVote, int favoriteCount, int ratingCount, String type, String aspectRatio, String uploadedon) {

		this._rome = rome;
		this.viewCount = viewCount;
		this.rate = rate;
		this.syndicate = syndicate;
		this.commentVote = commentVote;
		this.favoriteCount = favoriteCount;
		this.ratingCount = ratingCount;
		this.type = type;
		this.aspectRatio = aspectRatio;
		this.uploadedon = uploadedon;

	}

}