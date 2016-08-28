
class CopyrightModel {

	public int year;
	public String holder_url;
	public String licence_url;
	public String holder;
	public String logo;
	public String licence;

	public CopyrightModel(int year, String holder_url, String licence_url, String holder, String logo, String licence) {

		this.year = year;
		this.holder_url = holder_url;
		this.licence_url = licence_url;
		this.holder = holder;
		this.logo = logo;
		this.licence = licence;

	}

}