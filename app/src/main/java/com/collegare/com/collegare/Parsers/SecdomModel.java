
class SecdomModel {

	public String syndicate;
	public int viewCount;
	public String aspectRatio;
	public int ratingCount;
	public String commentVote;
	public int minimum;
	public int favoriteCount;
	public String updatededon;
	public ItemsModel _items;
	public String rate;
	public String list;
	public Boolean required;
	public String type;

	public SecdomModel(String syndicate, int viewCount, String aspectRatio, int ratingCount, String commentVote, int minimum, int favoriteCount, String updatededon, ItemsModel items, String rate, String list, Boolean required, String type) {

		this.syndicate = syndicate;
		this.viewCount = viewCount;
		this.aspectRatio = aspectRatio;
		this.ratingCount = ratingCount;
		this.commentVote = commentVote;
		this.minimum = minimum;
		this.favoriteCount = favoriteCount;
		this.updatededon = updatededon;
		this._items = items;
		this.rate = rate;
		this.list = list;
		this.required = required;
		this.type = type;

	}

}