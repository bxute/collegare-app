
class RootModel {

	public String name;
	public String apiVersion;
	public DatModel _dat;
	public PropertiesModel _properties;

	public RootModel(String name, String apiVersion, DatModel dat, PropertiesModel properties) {

		this.name = name;
		this.apiVersion = apiVersion;
		this._dat = dat;
		this._properties = properties;

	}

}