
class CopyrightModel {

	public int id;
	public String licence_url;
	public String end_time;
	public int year;
	public String email;
	public String logo;
	public Call_for_papersModel _call_for_papers;
	public String licence;
	public String holder;
	public String holder_url;

	public CopyrightModel(int id, String licence_url, String end_time, int year, String email, String logo, Call_for_papersModel call_for_papers, String licence, String holder, String holder_url) {

		this.id = id;
		this.licence_url = licence_url;
		this.end_time = end_time;
		this.year = year;
		this.email = email;
		this.logo = logo;
		this._call_for_papers = call_for_papers;
		this.licence = licence;
		this.holder = holder;
		this.holder_url = holder_url;

	}

}