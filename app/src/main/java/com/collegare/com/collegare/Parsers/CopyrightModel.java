
class CopyrightModel {

	public String holder;
	public String licence_url;
	public int year;
	public String end_time;
	public String licence;
	public String holder_url;
	public Call_for_papersModel _call_for_papers;
	public String email;
	public String logo;
	public int id;

	public CopyrightModel(String holder, String licence_url, int year, String end_time, String licence, String holder_url, Call_for_papersModel call_for_papers, String email, String logo, int id) {

		this.holder = holder;
		this.licence_url = licence_url;
		this.year = year;
		this.end_time = end_time;
		this.licence = licence;
		this.holder_url = holder_url;
		this._call_for_papers = call_for_papers;
		this.email = email;
		this.logo = logo;
		this.id = id;

	}

}