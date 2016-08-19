
class PropertiesModel {

	public PriceModel _price;
	public NameModel _name;
	public TagsModel _tags;
	public IdModel _id;

	public PropertiesModel(PriceModel price, NameModel name, TagsModel tags, IdModel id) {

		this._price = price;
		this._name = name;
		this._tags = tags;
		this._id = id;

	}

}