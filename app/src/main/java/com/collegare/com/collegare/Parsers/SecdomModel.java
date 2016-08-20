
class SecdomModel {

	public String commentVote;
	public int viewCount;
	public String type;
	public String list;
	public Boolean required;
	public String updatededon;
	public int minimum;
	public String rate;
	public int favoriteCount;
	public String aspectRatio;
	public int ratingCount;
	public ItemsModel _items;
	public String syndicate;

	public SecdomModel(String commentVote, int viewCount, String type, String list, Boolean required, String updatededon, int minimum, String rate, int favoriteCount, String aspectRatio, int ratingCount, ItemsModel items, String syndicate) {

		this.commentVote = commentVote;
		this.viewCount = viewCount;
		this.type = type;
		this.list = list;
		this.required = required;
		this.updatededon = updatededon;
		this.minimum = minimum;
		this.rate = rate;
		this.favoriteCount = favoriteCount;
		this.aspectRatio = aspectRatio;
		this.ratingCount = ratingCount;
		this._items = items;
		this.syndicate = syndicate;

	}

}