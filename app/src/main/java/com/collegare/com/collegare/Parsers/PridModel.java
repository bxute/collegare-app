
class PridModel {

	public String aspectRatio;
	public String list;
	public String commentVote;
	public String syndicate;
	public int minimum;
	public ItemsModel _items;
	public String rate;
	public String updatededon;
	public int ratingCount;
	public String type;
	public Boolean required;

	public PridModel(String aspectRatio, String list, String commentVote, String syndicate, int minimum, ItemsModel items, String rate, String updatededon, int ratingCount, String type, Boolean required) {

		this.aspectRatio = aspectRatio;
		this.list = list;
		this.commentVote = commentVote;
		this.syndicate = syndicate;
		this.minimum = minimum;
		this._items = items;
		this.rate = rate;
		this.updatededon = updatededon;
		this.ratingCount = ratingCount;
		this.type = type;
		this.required = required;

	}

}