
class CopyrightModel {

	public String logo;
	public String endtime;
	public int extem;
	public String licence;
	public String email;
	public String holdon;
	public Callfor_papersModel _callfor_papers;
	public String licence_url;
	public int year;
	public String holder_url;

	public CopyrightModel(String logo, String endtime, int extem, String licence, String email, String holdon, Callfor_papersModel callfor_papers, String licence_url, int year, String holder_url) {

		this.logo = logo;
		this.endtime = endtime;
		this.extem = extem;
		this.licence = licence;
		this.email = email;
		this.holdon = holdon;
		this._callfor_papers = callfor_papers;
		this.licence_url = licence_url;
		this.year = year;
		this.holder_url = holder_url;

	}

}