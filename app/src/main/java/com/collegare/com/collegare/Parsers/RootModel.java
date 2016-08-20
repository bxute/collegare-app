
class RootModel {

	public WricModel _wric;
	public String apiVersion;
	public String set;
	public SignModel _sign;

	public RootModel(WricModel wric, String apiVersion, String set, SignModel sign) {

		this._wric = wric;
		this.apiVersion = apiVersion;
		this.set = set;
		this._sign = sign;

	}

}