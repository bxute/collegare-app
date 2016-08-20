
class RootModel {

	public String apiVersion;
	public SignModel _sign;
	public String set;
	public WricModel _wric;

	public RootModel(String apiVersion, SignModel sign, String set, WricModel wric) {

		this.apiVersion = apiVersion;
		this._sign = sign;
		this.set = set;
		this._wric = wric;

	}

}