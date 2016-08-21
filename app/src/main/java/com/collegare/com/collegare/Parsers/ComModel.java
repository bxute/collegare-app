
class ComModel {

	public String updatededon;
	public ItemsModel _items;
	public int favoriteCount;
	public String commentVote;
	public int ratingCount;
	public String list;
	public String syndicate;
	public String aspectRatio;
	public String uploadedon;
	public int duration;
	public int minimum;
	public String rate;
	public String type;
	public Boolean required;
	public int viewCount;

	public ComModel(String updatededon, ItemsModel items, int favoriteCount, String commentVote, int ratingCount, String list, String syndicate, String aspectRatio, String uploadedon, int duration, int minimum, String rate, String type, Boolean required, int viewCount) {

		this.updatededon = updatededon;
		this._items = items;
		this.favoriteCount = favoriteCount;
		this.commentVote = commentVote;
		this.ratingCount = ratingCount;
		this.list = list;
		this.syndicate = syndicate;
		this.aspectRatio = aspectRatio;
		this.uploadedon = uploadedon;
		this.duration = duration;
		this.minimum = minimum;
		this.rate = rate;
		this.type = type;
		this.required = required;
		this.viewCount = viewCount;

	}

}