
class CopyrightModel {

	public String licence_url;
	public int year;
	public String licence;
	public Callfor_papersModel _callfor_papers;
	public String logo;
	public String endtime;
	public String holder_url;
	public String holdon;
	public int extem;
	public String email;

	public CopyrightModel(String licence_url, int year, String licence, Callfor_papersModel callfor_papers, String logo, String endtime, String holder_url, String holdon, int extem, String email) {

		this.licence_url = licence_url;
		this.year = year;
		this.licence = licence;
		this._callfor_papers = callfor_papers;
		this.logo = logo;
		this.endtime = endtime;
		this.holder_url = holder_url;
		this.holdon = holdon;
		this.extem = extem;
		this.email = email;

	}

}