
class CopyrightModel {

	public String licence_url;
	public String licence;
	public String holder_url;
	public String holdon;
	public String email;
	public Callfor_papersModel _callfor_papers;
	public int year;
	public String endtime;
	public String logo;
	public int extem;

	public CopyrightModel(String licence_url, String licence, String holder_url, String holdon, String email, Callfor_papersModel callfor_papers, int year, String endtime, String logo, int extem) {

		this.licence_url = licence_url;
		this.licence = licence;
		this.holder_url = holder_url;
		this.holdon = holdon;
		this.email = email;
		this._callfor_papers = callfor_papers;
		this.year = year;
		this.endtime = endtime;
		this.logo = logo;
		this.extem = extem;

	}

}