
class CopyrightModel {

	public String email;
	public String holder_url;
	public int extem;
	public Callfor_papersModel _callfor_papers;
	public String licence_url;
	public String licence;
	public String endtime;
	public int year;
	public String holdon;
	public String logo;

	public CopyrightModel(String email, String holder_url, int extem, Callfor_papersModel callfor_papers, String licence_url, String licence, String endtime, int year, String holdon, String logo) {

		this.email = email;
		this.holder_url = holder_url;
		this.extem = extem;
		this._callfor_papers = callfor_papers;
		this.licence_url = licence_url;
		this.licence = licence;
		this.endtime = endtime;
		this.year = year;
		this.holdon = holdon;
		this.logo = logo;

	}

}