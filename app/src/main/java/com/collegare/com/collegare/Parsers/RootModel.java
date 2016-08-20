
class RootModel {

	public String set;
	public SignModel _sign;
	public String apiVersion;
	public WricModel _wric;

	public RootModel(String set, SignModel sign, String apiVersion, WricModel wric) {

		this.set = set;
		this._sign = sign;
		this.apiVersion = apiVersion;
		this._wric = wric;

	}

}