
class MetightModel {

	public String commentVote;
	public String type;
	public String rate;
	public String syndicate;
	public String aspectRatio;
	public int ratingCount;
	public RomeModel _rome;
	public String uploadedon;
	public int favoriteCount;
	public int viewCount;

	public MetightModel(String commentVote, String type, String rate, String syndicate, String aspectRatio, int ratingCount, RomeModel rome, String uploadedon, int favoriteCount, int viewCount) {

		this.commentVote = commentVote;
		this.type = type;
		this.rate = rate;
		this.syndicate = syndicate;
		this.aspectRatio = aspectRatio;
		this.ratingCount = ratingCount;
		this._rome = rome;
		this.uploadedon = uploadedon;
		this.favoriteCount = favoriteCount;
		this.viewCount = viewCount;

	}

}