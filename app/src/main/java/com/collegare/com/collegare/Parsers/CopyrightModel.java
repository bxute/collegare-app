
class CopyrightModel {

	public String holder_url;
	public int year;
	public String holder;
	public String logo;
	public String licence;
	public String licence_url;

	public CopyrightModel(String holder_url, int year, String holder, String logo, String licence, String licence_url) {

		this.holder_url = holder_url;
		this.year = year;
		this.holder = holder;
		this.logo = logo;
		this.licence = licence;
		this.licence_url = licence_url;

	}

}