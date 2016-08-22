
class CopyrightModel {

	public String holder_url;
	public int id;
	public int year;
	public String holder;
	public String end_time;
	public String logo;
	public String email;
	public String licence;
	public Call_for_papersModel _call_for_papers;
	public String licence_url;

	public CopyrightModel(String holder_url, int id, int year, String holder, String end_time, String logo, String email, String licence, Call_for_papersModel call_for_papers, String licence_url) {

		this.holder_url = holder_url;
		this.id = id;
		this.year = year;
		this.holder = holder;
		this.end_time = end_time;
		this.logo = logo;
		this.email = email;
		this.licence = licence;
		this._call_for_papers = call_for_papers;
		this.licence_url = licence_url;

	}

}