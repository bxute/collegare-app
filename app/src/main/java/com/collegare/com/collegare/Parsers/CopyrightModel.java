
class CopyrightModel {

	public String licence_url;
	public String licence;
	public int year;
	public String holder_url;
	public String holder;
	public String logo;

	public CopyrightModel(String licence_url, String licence, int year, String holder_url, String holder, String logo) {

		this.licence_url = licence_url;
		this.licence = licence;
		this.year = year;
		this.holder_url = holder_url;
		this.holder = holder;
		this.logo = logo;

	}

}