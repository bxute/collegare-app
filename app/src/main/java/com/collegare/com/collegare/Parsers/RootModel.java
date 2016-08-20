
class RootModel {

	public String set;
	public ConpentModel _conpent;
	public SignModel _sign;
	public String apiVersion;

	public RootModel(String set, ConpentModel conpent, SignModel sign, String apiVersion) {

		this.set = set;
		this._conpent = conpent;
		this._sign = sign;
		this.apiVersion = apiVersion;

	}

}