
class PridModel {

	public String syndicate;
	public String type;
	public int viewCount;
	public String list;
	public String updatededon;
	public ItemsModel _items;
	public int favoriteCount;
	public String aspectRatio;
	public int minimum;
	public String rate;
	public Boolean required;
	public String commentVote;
	public int ratingCount;

	public PridModel(String syndicate, String type, int viewCount, String list, String updatededon, ItemsModel items, int favoriteCount, String aspectRatio, int minimum, String rate, Boolean required, String commentVote, int ratingCount) {

		this.syndicate = syndicate;
		this.type = type;
		this.viewCount = viewCount;
		this.list = list;
		this.updatededon = updatededon;
		this._items = items;
		this.favoriteCount = favoriteCount;
		this.aspectRatio = aspectRatio;
		this.minimum = minimum;
		this.rate = rate;
		this.required = required;
		this.commentVote = commentVote;
		this.ratingCount = ratingCount;

	}

}