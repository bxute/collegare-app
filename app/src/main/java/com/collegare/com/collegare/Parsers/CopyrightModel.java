
class CopyrightModel {

	public int id;
	public String licence_url;
	public String holder;
	public String email;
	public int year;
	public String logo;
	public String holder_url;
	public String licence;
	public Call_for_papersModel _call_for_papers;
	public String end_time;

	public CopyrightModel(int id, String licence_url, String holder, String email, int year, String logo, String holder_url, String licence, Call_for_papersModel call_for_papers, String end_time) {

		this.id = id;
		this.licence_url = licence_url;
		this.holder = holder;
		this.email = email;
		this.year = year;
		this.logo = logo;
		this.holder_url = holder_url;
		this.licence = licence;
		this._call_for_papers = call_for_papers;
		this.end_time = end_time;

	}

}