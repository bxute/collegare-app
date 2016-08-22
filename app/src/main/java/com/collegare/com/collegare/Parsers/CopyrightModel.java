
class CopyrightModel {

	public String email;
	public String logo;
	public int year;
	public Callfor_papersModel _callfor_papers;
	public String endtime;
	public String holdon;
	public int extem;
	public String licence;
	public String licence_url;
	public String holder_url;

	public CopyrightModel(String email, String logo, int year, Callfor_papersModel callfor_papers, String endtime, String holdon, int extem, String licence, String licence_url, String holder_url) {

		this.email = email;
		this.logo = logo;
		this.year = year;
		this._callfor_papers = callfor_papers;
		this.endtime = endtime;
		this.holdon = holdon;
		this.extem = extem;
		this.licence = licence;
		this.licence_url = licence_url;
		this.holder_url = holder_url;

	}

}