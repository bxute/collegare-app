
class RomeModel {

	public String commentVote;
	public String type;
	public String rate;
	public ShockedModel _shocked;
	public String uploadedon;
	public int ratingCount;
	public String updatedon;
	public String uploadedby;
	public int favoriteCount;
	public int viewCount;
	public String id;

	public RomeModel(String commentVote, String type, String rate, ShockedModel shocked, String uploadedon, int ratingCount, String updatedon, String uploadedby, int favoriteCount, int viewCount, String id) {

		this.commentVote = commentVote;
		this.type = type;
		this.rate = rate;
		this._shocked = shocked;
		this.uploadedon = uploadedon;
		this.ratingCount = ratingCount;
		this.updatedon = updatedon;
		this.uploadedby = uploadedby;
		this.favoriteCount = favoriteCount;
		this.viewCount = viewCount;
		this.id = id;

	}

}