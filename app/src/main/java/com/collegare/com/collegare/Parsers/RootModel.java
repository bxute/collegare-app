
class RootModel {

	public String set;
	public String apiVersion;
	public SignModel _sign;
	public WrimModel _wrim;

	public RootModel(String set, String apiVersion, SignModel sign, WrimModel wrim) {

		this.set = set;
		this.apiVersion = apiVersion;
		this._sign = sign;
		this._wrim = wrim;

	}

}