
class RootModel {

	public String set;
	public String apiVersion;
	public WricModel _wric;
	public SignModel _sign;

	public RootModel(String set, String apiVersion, WricModel wric, SignModel sign) {

		this.set = set;
		this.apiVersion = apiVersion;
		this._wric = wric;
		this._sign = sign;

	}

}