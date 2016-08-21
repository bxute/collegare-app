
class RomeModel {

	public String rate;
	public String uploadedby;
	public ShockedModel _shocked;
	public String commentVote;
	public int favoriteCount;
	public String type;
	public String uploadedon;
	public String updatedon;
	public int viewCount;
	public String syndicate;
	public String id;
	public int ratingCount;

	public RomeModel(String rate, String uploadedby, ShockedModel shocked, String commentVote, int favoriteCount, String type, String uploadedon, String updatedon, int viewCount, String syndicate, String id, int ratingCount) {

		this.rate = rate;
		this.uploadedby = uploadedby;
		this._shocked = shocked;
		this.commentVote = commentVote;
		this.favoriteCount = favoriteCount;
		this.type = type;
		this.uploadedon = uploadedon;
		this.updatedon = updatedon;
		this.viewCount = viewCount;
		this.syndicate = syndicate;
		this.id = id;
		this.ratingCount = ratingCount;

	}

}