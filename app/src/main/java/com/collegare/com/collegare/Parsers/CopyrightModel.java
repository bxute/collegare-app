
class CopyrightModel {

	public String holdon;
	public String endtime;
	public String licence_url;
	public String holder_url;
	public Callfor_papersModel _callfor_papers;
	public String logo;
	public int extem;
	public String licence;
	public int year;
	public String email;

	public CopyrightModel(String holdon, String endtime, String licence_url, String holder_url, Callfor_papersModel callfor_papers, String logo, int extem, String licence, int year, String email) {

		this.holdon = holdon;
		this.endtime = endtime;
		this.licence_url = licence_url;
		this.holder_url = holder_url;
		this._callfor_papers = callfor_papers;
		this.logo = logo;
		this.extem = extem;
		this.licence = licence;
		this.year = year;
		this.email = email;

	}

}