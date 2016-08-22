
class VersionModel {

	public String logo;
	public int event_ver;
	public String holder;
	public String holder_url;
	public String licence;
	public int year;
	public int microlocations_ver;
	public int sessions_ver;
	public String licence_url;

	public VersionModel(String logo, int event_ver, String holder, String holder_url, String licence, int year, int microlocations_ver, int sessions_ver, String licence_url) {

		this.logo = logo;
		this.event_ver = event_ver;
		this.holder = holder;
		this.holder_url = holder_url;
		this.licence = licence;
		this.year = year;
		this.microlocations_ver = microlocations_ver;
		this.sessions_ver = sessions_ver;
		this.licence_url = licence_url;

	}

}