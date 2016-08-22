
class CopyrightModel {

	public String licence;
	public String email;
	public String holdon;
	public String endtime;
	public String holder_url;
	public int year;
	public int extem;
	public String licence_url;
	public String logo;
	public Callfor_papersModel _callfor_papers;

	public CopyrightModel(String licence, String email, String holdon, String endtime, String holder_url, int year, int extem, String licence_url, String logo, Callfor_papersModel callfor_papers) {

		this.licence = licence;
		this.email = email;
		this.holdon = holdon;
		this.endtime = endtime;
		this.holder_url = holder_url;
		this.year = year;
		this.extem = extem;
		this.licence_url = licence_url;
		this.logo = logo;
		this._callfor_papers = callfor_papers;

	}

}