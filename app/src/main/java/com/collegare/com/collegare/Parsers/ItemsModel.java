
class ItemsModel {

	public String aspectRatio;
	public String syndicate;
	public String rate;
	public String uploadedon;
	public String uploadedby;
	public int favoriteCount;
	public int ratingCount;
	public int viewCount;
	public String commentVote;
	public String updatedon;
	public String type;

	public ItemsModel(String aspectRatio, String syndicate, String rate, String uploadedon, String uploadedby, int favoriteCount, int ratingCount, int viewCount, String commentVote, String updatedon, String type) {

		this.aspectRatio = aspectRatio;
		this.syndicate = syndicate;
		this.rate = rate;
		this.uploadedon = uploadedon;
		this.uploadedby = uploadedby;
		this.favoriteCount = favoriteCount;
		this.ratingCount = ratingCount;
		this.viewCount = viewCount;
		this.commentVote = commentVote;
		this.updatedon = updatedon;
		this.type = type;

	}

}