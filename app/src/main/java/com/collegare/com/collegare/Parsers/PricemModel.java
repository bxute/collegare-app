
class PricemModel {

	public String rate;
	public int minimum;
	public ItemsModel _items;
	public int favoriteCount;
	public String syndicate;
	public String updatededon;
	public String uploadedby;
	public String updatedon;
	public String aspectRatio;
	public Boolean required;
	public String commentVote;
	public int viewCount;
	public int ratingCount;
	public String uploadedon;
	public String list;
	public String type;

	public PricemModel(String rate, int minimum, ItemsModel items, int favoriteCount, String syndicate, String updatededon, String uploadedby, String updatedon, String aspectRatio, Boolean required, String commentVote, int viewCount, int ratingCount, String uploadedon, String list, String type) {

		this.rate = rate;
		this.minimum = minimum;
		this._items = items;
		this.favoriteCount = favoriteCount;
		this.syndicate = syndicate;
		this.updatededon = updatededon;
		this.uploadedby = uploadedby;
		this.updatedon = updatedon;
		this.aspectRatio = aspectRatio;
		this.required = required;
		this.commentVote = commentVote;
		this.viewCount = viewCount;
		this.ratingCount = ratingCount;
		this.uploadedon = uploadedon;
		this.list = list;
		this.type = type;

	}

}