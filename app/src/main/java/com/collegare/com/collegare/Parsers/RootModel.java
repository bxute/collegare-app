
class RootModel {

	public String apiVersion;
	public WrimModel _wrim;
	public SignModel _sign;
	public String set;

	public RootModel(String apiVersion, WrimModel wrim, SignModel sign, String set) {

		this.apiVersion = apiVersion;
		this._wrim = wrim;
		this._sign = sign;
		this.set = set;

	}

}