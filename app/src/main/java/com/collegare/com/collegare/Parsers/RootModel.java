
class RootModel {

	public PropertiesModel _properties;
	public String apiVersion;
	public String name;
	public WrimModel _wrim;

	public RootModel(PropertiesModel properties, String apiVersion, String name, WrimModel wrim) {

		this._properties = properties;
		this.apiVersion = apiVersion;
		this.name = name;
		this._wrim = wrim;

	}

}