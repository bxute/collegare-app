
class ReactModel {

	public Boolean required;
	public String commentVote;
	public String type;
	public String uploadedon;
	public int minimum;
	public String rate;
	public int favoriteCount;
	public String aspectRatio;
	public ItemsModel _items;
	public int ratingCount;
	public String id;
	public String syndicate;
	public int viewCount;
	public String list;
	public int duration;

	public ReactModel(Boolean required, String commentVote, String type, String uploadedon, int minimum, String rate, int favoriteCount, String aspectRatio, ItemsModel items, int ratingCount, String id, String syndicate, int viewCount, String list, int duration) {

		this.required = required;
		this.commentVote = commentVote;
		this.type = type;
		this.uploadedon = uploadedon;
		this.minimum = minimum;
		this.rate = rate;
		this.favoriteCount = favoriteCount;
		this.aspectRatio = aspectRatio;
		this._items = items;
		this.ratingCount = ratingCount;
		this.id = id;
		this.syndicate = syndicate;
		this.viewCount = viewCount;
		this.list = list;
		this.duration = duration;

	}

}