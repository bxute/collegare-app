
class CopyrightModel {

	public String holder_url;
	public String licence_url;
	public String holder;
	public int year;
	public String licence;
	public String logo;

	public CopyrightModel(String holder_url, String licence_url, String holder, int year, String licence, String logo) {

		this.holder_url = holder_url;
		this.licence_url = licence_url;
		this.holder = holder;
		this.year = year;
		this.licence = licence;
		this.logo = logo;

	}

}