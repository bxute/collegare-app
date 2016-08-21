import java.util.ArrayList;

class LooseModel {

	public int viewCount;
	public String rate;
	public ArrayList<RedartModel> redart;
	public String updated;
	public String commentVote;
	public String id;
	public int ratingCount;
	public int favoriteCount;
	public String uploadedon;
	public String syndicate;
	public int itemsPerPage;

	public LooseModel(int viewCount, String rate, ArrayList<RedartModel> redart, String updated, String commentVote, String id, int ratingCount, int favoriteCount, String uploadedon, String syndicate, int itemsPerPage) {

		this.viewCount = viewCount;
		this.rate = rate;
		this.redart = redart;
		this.updated = updated;
		this.commentVote = commentVote;
		this.id = id;
		this.ratingCount = ratingCount;
		this.favoriteCount = favoriteCount;
		this.uploadedon = uploadedon;
		this.syndicate = syndicate;
		this.itemsPerPage = itemsPerPage;

	}

}