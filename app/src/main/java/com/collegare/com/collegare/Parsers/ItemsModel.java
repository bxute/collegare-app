
class ItemsModel {

	public String uploadedon;
	public String syndicate;
	public String id;
	public int ratingCount;
	public int viewCount;
	public String commentVote;
	public String type;
	public String rate;
	public int favoriteCount;

	public ItemsModel(String uploadedon, String syndicate, String id, int ratingCount, int viewCount, String commentVote, String type, String rate, int favoriteCount) {

		this.uploadedon = uploadedon;
		this.syndicate = syndicate;
		this.id = id;
		this.ratingCount = ratingCount;
		this.viewCount = viewCount;
		this.commentVote = commentVote;
		this.type = type;
		this.rate = rate;
		this.favoriteCount = favoriteCount;

	}

}