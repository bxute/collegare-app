import java.util.ArrayList;

class LooseModel {

	public String commentVote;
	public String rate;
	public String syndicate;
	public String uploadedon;
	public String updated;
	public int ratingCount;
	public int itemsPerPage;
	public ArrayList<RedartModel> redart;
	public int favoriteCount;
	public int viewCount;
	public String id;

	public LooseModel(String commentVote, String rate, String syndicate, String uploadedon, String updated, int ratingCount, int itemsPerPage, ArrayList<RedartModel> redart, int favoriteCount, int viewCount, String id) {

		this.commentVote = commentVote;
		this.rate = rate;
		this.syndicate = syndicate;
		this.uploadedon = uploadedon;
		this.updated = updated;
		this.ratingCount = ratingCount;
		this.itemsPerPage = itemsPerPage;
		this.redart = redart;
		this.favoriteCount = favoriteCount;
		this.viewCount = viewCount;
		this.id = id;

	}

}