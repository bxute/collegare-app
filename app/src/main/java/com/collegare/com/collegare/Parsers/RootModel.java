
class RootModel {

	public String apiVersion;
	public CounlModel _counl;
	public String set;
	public SeperModel _seper;

	public RootModel(String apiVersion, CounlModel counl, String set, SeperModel seper) {

		this.apiVersion = apiVersion;
		this._counl = counl;
		this.set = set;
		this._seper = seper;

	}

}