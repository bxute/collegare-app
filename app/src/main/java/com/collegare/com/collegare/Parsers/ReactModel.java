
class ReactModel {

	public int viewCount;
	public String uploadedon;
	public int minimum;
	public String type;
	public String syndicate;
	public String list;
	public ItemsModel _items;
	public String commentVote;
	public Boolean required;
	public int favoriteCount;
	public String id;
	public String aspectRatio;
	public int duration;
	public String rate;
	public int ratingCount;

	public ReactModel(int viewCount, String uploadedon, int minimum, String type, String syndicate, String list, ItemsModel items, String commentVote, Boolean required, int favoriteCount, String id, String aspectRatio, int duration, String rate, int ratingCount) {

		this.viewCount = viewCount;
		this.uploadedon = uploadedon;
		this.minimum = minimum;
		this.type = type;
		this.syndicate = syndicate;
		this.list = list;
		this._items = items;
		this.commentVote = commentVote;
		this.required = required;
		this.favoriteCount = favoriteCount;
		this.id = id;
		this.aspectRatio = aspectRatio;
		this.duration = duration;
		this.rate = rate;
		this.ratingCount = ratingCount;

	}

}