
class CopyrightModel {

	public String holder_url;
	public String holder;
	public String licence_url;
	public String licence;
	public String logo;
	public int year;

	public CopyrightModel(String holder_url, String holder, String licence_url, String licence, String logo, int year) {

		this.holder_url = holder_url;
		this.holder = holder;
		this.licence_url = licence_url;
		this.licence = licence;
		this.logo = logo;
		this.year = year;

	}

}