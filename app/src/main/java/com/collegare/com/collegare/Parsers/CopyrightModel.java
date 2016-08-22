
class CopyrightModel {

	public String holder_url;
	public String holdon;
	public Call_for_papersModel _call_for_papers;
	public String licence;
	public String logo;
	public String endtime;
	public String email;
	public int e;
	public String licence_url;
	public int year;

	public CopyrightModel(String holder_url, String holdon, Call_for_papersModel call_for_papers, String licence, String logo, String endtime, String email, int e, String licence_url, int year) {

		this.holder_url = holder_url;
		this.holdon = holdon;
		this._call_for_papers = call_for_papers;
		this.licence = licence;
		this.logo = logo;
		this.endtime = endtime;
		this.email = email;
		this.e = e;
		this.licence_url = licence_url;
		this.year = year;

	}

}