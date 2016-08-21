
class RomeModel {

	public String commentVote;
	public String syndicate;
	public ShockedModel _shocked;
	public String id;
	public int favoriteCount;
	public int ratingCount;
	public int viewCount;
	public String rate;
	public String uploadedon;
	public String uploadedby;
	public String type;
	public String updatedon;

	public RomeModel(String commentVote, String syndicate, ShockedModel shocked, String id, int favoriteCount, int ratingCount, int viewCount, String rate, String uploadedon, String uploadedby, String type, String updatedon) {

		this.commentVote = commentVote;
		this.syndicate = syndicate;
		this._shocked = shocked;
		this.id = id;
		this.favoriteCount = favoriteCount;
		this.ratingCount = ratingCount;
		this.viewCount = viewCount;
		this.rate = rate;
		this.uploadedon = uploadedon;
		this.uploadedby = uploadedby;
		this.type = type;
		this.updatedon = updatedon;

	}

}