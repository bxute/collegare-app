
class RootModel {

	public WricModel _wric;
	public String name;
	public PropertiesModel _properties;
	public String apiVersion;

	public RootModel(WricModel wric, String name, PropertiesModel properties, String apiVersion) {

		this._wric = wric;
		this.name = name;
		this._properties = properties;
		this.apiVersion = apiVersion;

	}

}