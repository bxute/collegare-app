
class CopyrightModel {

	public int year;
	public String licence;
	public String licence_url;
	public String holder;
	public String holder_url;
	public String logo;

	public CopyrightModel(int year, String licence, String licence_url, String holder, String holder_url, String logo) {

		this.year = year;
		this.licence = licence;
		this.licence_url = licence_url;
		this.holder = holder;
		this.holder_url = holder_url;
		this.logo = logo;

	}

}