
class RootModel {

	public SignModel _sign;
	public String set;
	public WrimModel _wrim;
	public String apiVersion;

	public RootModel(SignModel sign, String set, WrimModel wrim, String apiVersion) {

		this._sign = sign;
		this.set = set;
		this._wrim = wrim;
		this.apiVersion = apiVersion;

	}

}