
class CopyrightModel {

	public int year;
	public String holder;
	public String holder_url;
	public String logo;
	public String licence_url;
	public String licence;

	public CopyrightModel(int year, String holder, String holder_url, String logo, String licence_url, String licence) {

		this.year = year;
		this.holder = holder;
		this.holder_url = holder_url;
		this.logo = logo;
		this.licence_url = licence_url;
		this.licence = licence;

	}

}