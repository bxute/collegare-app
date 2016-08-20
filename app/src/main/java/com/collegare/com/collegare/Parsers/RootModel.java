
class RootModel {

	public String apiVersion;
	public CounlModel _counl;
	public SignModel _sign;
	public String set;

	public RootModel(String apiVersion, CounlModel counl, SignModel sign, String set) {

		this.apiVersion = apiVersion;
		this._counl = counl;
		this._sign = sign;
		this.set = set;

	}

}