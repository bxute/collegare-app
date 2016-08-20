
class RootModel {

	public WrimModel _wrim;
	public String set;
	public SignModel _sign;
	public String apiVersion;

	public RootModel(WrimModel wrim, String set, SignModel sign, String apiVersion) {

		this._wrim = wrim;
		this.set = set;
		this._sign = sign;
		this.apiVersion = apiVersion;

	}

}