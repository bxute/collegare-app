
class ComModel {

	public int viewCount;
	public String uploadedon;
	public int favoriteCount;
	public String rate;
	public String commentVote;
	public String syndicate;
	public String aspectRatio;
	public String updatededon;
	public String type;
	public int duration;
	public Boolean required;
	public String list;
	public int minimum;
	public int ratingCount;
	public ItemsModel _items;

	public ComModel(int viewCount, String uploadedon, int favoriteCount, String rate, String commentVote, String syndicate, String aspectRatio, String updatededon, String type, int duration, Boolean required, String list, int minimum, int ratingCount, ItemsModel items) {

		this.viewCount = viewCount;
		this.uploadedon = uploadedon;
		this.favoriteCount = favoriteCount;
		this.rate = rate;
		this.commentVote = commentVote;
		this.syndicate = syndicate;
		this.aspectRatio = aspectRatio;
		this.updatededon = updatededon;
		this.type = type;
		this.duration = duration;
		this.required = required;
		this.list = list;
		this.minimum = minimum;
		this.ratingCount = ratingCount;
		this._items = items;

	}

}