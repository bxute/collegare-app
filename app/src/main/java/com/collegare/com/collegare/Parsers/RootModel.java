
class RootModel {

	public PropertiesModel _properties;
	public String name;
	public WricModel _wric;
	public String apiVersion;

	public RootModel(PropertiesModel properties, String name, WricModel wric, String apiVersion) {

		this._properties = properties;
		this.name = name;
		this._wric = wric;
		this.apiVersion = apiVersion;

	}

}