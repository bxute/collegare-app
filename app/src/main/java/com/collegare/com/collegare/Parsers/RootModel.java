
class RootModel {

	public SignModel _sign;
	public CounlModel _counl;
	public String set;
	public String apiVersion;

	public RootModel(SignModel sign, CounlModel counl, String set, String apiVersion) {

		this._sign = sign;
		this._counl = counl;
		this.set = set;
		this.apiVersion = apiVersion;

	}

}