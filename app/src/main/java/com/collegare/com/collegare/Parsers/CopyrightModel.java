
class CopyrightModel {

	public Callfor_papersModel _callfor_papers;
	public String logo;
	public String holder_url;
	public String holdon;
	public String endtime;
	public String licence;
	public int year;
	public int extem;
	public String email;
	public String licence_url;

	public CopyrightModel(Callfor_papersModel callfor_papers, String logo, String holder_url, String holdon, String endtime, String licence, int year, int extem, String email, String licence_url) {

		this._callfor_papers = callfor_papers;
		this.logo = logo;
		this.holder_url = holder_url;
		this.holdon = holdon;
		this.endtime = endtime;
		this.licence = licence;
		this.year = year;
		this.extem = extem;
		this.email = email;
		this.licence_url = licence_url;

	}

}