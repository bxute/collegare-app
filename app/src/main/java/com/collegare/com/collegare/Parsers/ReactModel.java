
class ReactModel {

	public ItemsModel _items;
	public String aspectRatio;
	public int duration;
	public int favoriteCount;
	public String syndicate;
	public int minimum;
	public Boolean required;
	public String uploadedon;
	public int viewCount;
	public String rate;
	public String commentVote;
	public String type;
	public int ratingCount;
	public String list;
	public String updatededon;

	public ReactModel(ItemsModel items, String aspectRatio, int duration, int favoriteCount, String syndicate, int minimum, Boolean required, String uploadedon, int viewCount, String rate, String commentVote, String type, int ratingCount, String list, String updatededon) {

		this._items = items;
		this.aspectRatio = aspectRatio;
		this.duration = duration;
		this.favoriteCount = favoriteCount;
		this.syndicate = syndicate;
		this.minimum = minimum;
		this.required = required;
		this.uploadedon = uploadedon;
		this.viewCount = viewCount;
		this.rate = rate;
		this.commentVote = commentVote;
		this.type = type;
		this.ratingCount = ratingCount;
		this.list = list;
		this.updatededon = updatededon;

	}

}