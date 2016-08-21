
class RomeModel {

	public int ratingCount;
	public int viewCount;
	public String commentVote;
	public String rate;
	public String updatedon;
	public ShockedModel _shocked;
	public String syndicate;
	public String id;
	public int favoriteCount;
	public String uploadedby;
	public String type;
	public String uploadedon;

	public RomeModel(int ratingCount, int viewCount, String commentVote, String rate, String updatedon, ShockedModel shocked, String syndicate, String id, int favoriteCount, String uploadedby, String type, String uploadedon) {

		this.ratingCount = ratingCount;
		this.viewCount = viewCount;
		this.commentVote = commentVote;
		this.rate = rate;
		this.updatedon = updatedon;
		this._shocked = shocked;
		this.syndicate = syndicate;
		this.id = id;
		this.favoriteCount = favoriteCount;
		this.uploadedby = uploadedby;
		this.type = type;
		this.uploadedon = uploadedon;

	}

}