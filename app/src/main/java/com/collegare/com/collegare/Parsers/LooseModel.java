import java.util.ArrayList;

class LooseModel {

	public ArrayList<RedartModel> redart;
	public String updated;
	public String commentVote;
	public String rate;
	public int itemsPerPage;
	public int ratingCount;
	public String uploadedon;
	public String syndicate;
	public int viewCount;
	public int favoriteCount;
	public String id;

	public LooseModel(ArrayList<RedartModel> redart, String updated, String commentVote, String rate, int itemsPerPage, int ratingCount, String uploadedon, String syndicate, int viewCount, int favoriteCount, String id) {

		this.redart = redart;
		this.updated = updated;
		this.commentVote = commentVote;
		this.rate = rate;
		this.itemsPerPage = itemsPerPage;
		this.ratingCount = ratingCount;
		this.uploadedon = uploadedon;
		this.syndicate = syndicate;
		this.viewCount = viewCount;
		this.favoriteCount = favoriteCount;
		this.id = id;

	}

}