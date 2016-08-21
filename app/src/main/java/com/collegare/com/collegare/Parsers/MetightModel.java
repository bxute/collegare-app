
class MetightModel {

	public int favoriteCount;
	public int viewCount;
	public String commentVote;
	public String uploadedon;
	public String type;
	public int ratingCount;
	public String syndicate;
	public String aspectRatio;
	public RomeModel _rome;
	public String rate;

	public MetightModel(int favoriteCount, int viewCount, String commentVote, String uploadedon, String type, int ratingCount, String syndicate, String aspectRatio, RomeModel rome, String rate) {

		this.favoriteCount = favoriteCount;
		this.viewCount = viewCount;
		this.commentVote = commentVote;
		this.uploadedon = uploadedon;
		this.type = type;
		this.ratingCount = ratingCount;
		this.syndicate = syndicate;
		this.aspectRatio = aspectRatio;
		this._rome = rome;
		this.rate = rate;

	}

}