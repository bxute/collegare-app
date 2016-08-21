
class ItemsModel {

	public String uploadedon;
	public int viewCount;
	public String commentVote;
	public int favoriteCount;
	public String syndicate;
	public int ratingCount;
	public String type;
	public String rate;
	public String id;

	public ItemsModel(String uploadedon, int viewCount, String commentVote, int favoriteCount, String syndicate, int ratingCount, String type, String rate, String id) {

		this.uploadedon = uploadedon;
		this.viewCount = viewCount;
		this.commentVote = commentVote;
		this.favoriteCount = favoriteCount;
		this.syndicate = syndicate;
		this.ratingCount = ratingCount;
		this.type = type;
		this.rate = rate;
		this.id = id;

	}

}