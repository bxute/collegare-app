
class PridModel {

	public int ratingCount;
	public String rate;
	public String type;
	public String syndicate;
	public int minimum;
	public String list;
	public ItemsModel _items;
	public String aspectRatio;
	public String updatededon;
	public String commentVote;
	public Boolean required;

	public PridModel(int ratingCount, String rate, String type, String syndicate, int minimum, String list, ItemsModel items, String aspectRatio, String updatededon, String commentVote, Boolean required) {

		this.ratingCount = ratingCount;
		this.rate = rate;
		this.type = type;
		this.syndicate = syndicate;
		this.minimum = minimum;
		this.list = list;
		this._items = items;
		this.aspectRatio = aspectRatio;
		this.updatededon = updatededon;
		this.commentVote = commentVote;
		this.required = required;

	}

}