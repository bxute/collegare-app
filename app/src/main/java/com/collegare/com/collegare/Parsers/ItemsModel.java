
class ItemsModel {

	public String commentVote;
	public String type;
	public String rate;
	public String syndicate;
	public String uploadedon;
	public int ratingCount;
	public int favoriteCount;
	public int viewCount;
	public String id;

	public ItemsModel(String commentVote, String type, String rate, String syndicate, String uploadedon, int ratingCount, int favoriteCount, int viewCount, String id) {

		this.commentVote = commentVote;
		this.type = type;
		this.rate = rate;
		this.syndicate = syndicate;
		this.uploadedon = uploadedon;
		this.ratingCount = ratingCount;
		this.favoriteCount = favoriteCount;
		this.viewCount = viewCount;
		this.id = id;

	}

}