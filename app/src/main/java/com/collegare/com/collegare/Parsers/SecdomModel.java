
class SecdomModel {

	public String list;
	public String type;
	public ItemsModel _items;
	public String commentVote;
	public String aspectRatio;
	public String syndicate;
	public String rate;
	public int viewCount;
	public int favoriteCount;
	public int ratingCount;
	public Boolean required;
	public String updatededon;
	public int minimum;

	public SecdomModel(String list, String type, ItemsModel items, String commentVote, String aspectRatio, String syndicate, String rate, int viewCount, int favoriteCount, int ratingCount, Boolean required, String updatededon, int minimum) {

		this.list = list;
		this.type = type;
		this._items = items;
		this.commentVote = commentVote;
		this.aspectRatio = aspectRatio;
		this.syndicate = syndicate;
		this.rate = rate;
		this.viewCount = viewCount;
		this.favoriteCount = favoriteCount;
		this.ratingCount = ratingCount;
		this.required = required;
		this.updatededon = updatededon;
		this.minimum = minimum;

	}

}