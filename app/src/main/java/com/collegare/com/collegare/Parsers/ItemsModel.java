
class ItemsModel {

	public int viewCount;
	public String rate;
	public String type;
	public String uploadedon;
	public String commentVote;
	public String id;
	public int ratingCount;
	public int favoriteCount;
	public String syndicate;

	public ItemsModel(int viewCount, String rate, String type, String uploadedon, String commentVote, String id, int ratingCount, int favoriteCount, String syndicate) {

		this.viewCount = viewCount;
		this.rate = rate;
		this.type = type;
		this.uploadedon = uploadedon;
		this.commentVote = commentVote;
		this.id = id;
		this.ratingCount = ratingCount;
		this.favoriteCount = favoriteCount;
		this.syndicate = syndicate;

	}

}