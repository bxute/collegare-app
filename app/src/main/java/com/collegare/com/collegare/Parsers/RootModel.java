
class RootModel {

	public PremiceModel _premice;
	public WrappersModel _wrappers;
	public String apiVersion;
	public String itemsType;

	public RootModel(PremiceModel premice, WrappersModel wrappers, String apiVersion, String itemsType) {

		this._premice = premice;
		this._wrappers = wrappers;
		this.apiVersion = apiVersion;
		this.itemsType = itemsType;

	}

}