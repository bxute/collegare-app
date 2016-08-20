
class PridModel {

	public String aspectRatio;
	public String syndicate;
	public String rate;
	public String list;
	public Boolean required;
	public int minimum;
	public ItemsModel _items;
	public String commentVote;
	public String type;
	public int ratingCount;
	public String updatededon;

	public PridModel(String aspectRatio, String syndicate, String rate, String list, Boolean required, int minimum, ItemsModel items, String commentVote, String type, int ratingCount, String updatededon) {

		this.aspectRatio = aspectRatio;
		this.syndicate = syndicate;
		this.rate = rate;
		this.list = list;
		this.required = required;
		this.minimum = minimum;
		this._items = items;
		this.commentVote = commentVote;
		this.type = type;
		this.ratingCount = ratingCount;
		this.updatededon = updatededon;

	}

}