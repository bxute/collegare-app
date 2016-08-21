
class ReactModel {

	public String updatededon;
	public int favoriteCount;
	public int duration;
	public Boolean required;
	public int viewCount;
	public ItemsModel _items;
	public String list;
	public String type;
	public int ratingCount;
	public String rate;
	public String syndicate;
	public String aspectRatio;
	public String commentVote;
	public String uploadedon;
	public int minimum;

	public ReactModel(String updatededon, int favoriteCount, int duration, Boolean required, int viewCount, ItemsModel items, String list, String type, int ratingCount, String rate, String syndicate, String aspectRatio, String commentVote, String uploadedon, int minimum) {

		this.updatededon = updatededon;
		this.favoriteCount = favoriteCount;
		this.duration = duration;
		this.required = required;
		this.viewCount = viewCount;
		this._items = items;
		this.list = list;
		this.type = type;
		this.ratingCount = ratingCount;
		this.rate = rate;
		this.syndicate = syndicate;
		this.aspectRatio = aspectRatio;
		this.commentVote = commentVote;
		this.uploadedon = uploadedon;
		this.minimum = minimum;

	}

}