
class RootModel {

	public SignModel _sign;
	public String set;
	public String apiVersion;
	public ConpentModel _conpent;

	public RootModel(SignModel sign, String set, String apiVersion, ConpentModel conpent) {

		this._sign = sign;
		this.set = set;
		this.apiVersion = apiVersion;
		this._conpent = conpent;

	}

}