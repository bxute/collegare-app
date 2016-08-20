
class ItemsModel {

	public int ratingCount;
	public int viewCount;
	public String rate;
	public String type;
	public String updatedon;
	public String uploadedby;
	public String aspectRatio;
	public String commentVote;
	public String syndicate;
	public String uploadedon;
	public int favoriteCount;

	public ItemsModel(int ratingCount, int viewCount, String rate, String type, String updatedon, String uploadedby, String aspectRatio, String commentVote, String syndicate, String uploadedon, int favoriteCount) {

		this.ratingCount = ratingCount;
		this.viewCount = viewCount;
		this.rate = rate;
		this.type = type;
		this.updatedon = updatedon;
		this.uploadedby = uploadedby;
		this.aspectRatio = aspectRatio;
		this.commentVote = commentVote;
		this.syndicate = syndicate;
		this.uploadedon = uploadedon;
		this.favoriteCount = favoriteCount;

	}

}