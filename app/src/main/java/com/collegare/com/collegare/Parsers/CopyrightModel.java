
class CopyrightModel {

	public String logo;
	public String email;
	public String holder_url;
	public int e;
	public String licence;
	public String holdon;
	public String licence_url;
	public String endtime;
	public int year;
	public Call_for_papersModel _call_for_papers;

	public CopyrightModel(String logo, String email, String holder_url, int e, String licence, String holdon, String licence_url, String endtime, int year, Call_for_papersModel call_for_papers) {

		this.logo = logo;
		this.email = email;
		this.holder_url = holder_url;
		this.e = e;
		this.licence = licence;
		this.holdon = holdon;
		this.licence_url = licence_url;
		this.endtime = endtime;
		this.year = year;
		this._call_for_papers = call_for_papers;

	}

}