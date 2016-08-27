
class CopyrightModel {

	public String licence_url;
	public String licence;
	public String holder_url;
	public int year;
	public String holder;
	public String logo;

	public CopyrightModel(String licence_url, String licence, String holder_url, int year, String holder, String logo) {

		this.licence_url = licence_url;
		this.licence = licence;
		this.holder_url = holder_url;
		this.year = year;
		this.holder = holder;
		this.logo = logo;

	}

}