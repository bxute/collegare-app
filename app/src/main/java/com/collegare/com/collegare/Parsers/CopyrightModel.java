
class CopyrightModel {

	public String holdon;
	public String logo;
	public String holder_url;
	public String endtime;
	public String licence;
	public String licence_url;
	public Callfor_papersModel _callfor_papers;
	public String email;
	public int year;
	public int extem;

	public CopyrightModel(String holdon, String logo, String holder_url, String endtime, String licence, String licence_url, Callfor_papersModel callfor_papers, String email, int year, int extem) {

		this.holdon = holdon;
		this.logo = logo;
		this.holder_url = holder_url;
		this.endtime = endtime;
		this.licence = licence;
		this.licence_url = licence_url;
		this._callfor_papers = callfor_papers;
		this.email = email;
		this.year = year;
		this.extem = extem;

	}

}