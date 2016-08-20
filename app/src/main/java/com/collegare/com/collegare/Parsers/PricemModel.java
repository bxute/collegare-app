
class PricemModel {

	public int minimum;
	public ItemsModel _items;
	public String type;
	public Boolean required;

	public PricemModel(int minimum, ItemsModel items, String type, Boolean required) {

		this.minimum = minimum;
		this._items = items;
		this.type = type;
		this.required = required;

	}

}