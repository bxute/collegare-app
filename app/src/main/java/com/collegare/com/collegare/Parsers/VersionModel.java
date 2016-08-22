
class VersionModel {

	public String logo;
	public String licence_url;
	public int year;
	public String licence;
	public int sessions_ver;
	public String holder;
	public int event_ver;
	public String holder_url;
	public int microlocations_ver;

	public VersionModel(String logo, String licence_url, int year, String licence, int sessions_ver, String holder, int event_ver, String holder_url, int microlocations_ver) {

		this.logo = logo;
		this.licence_url = licence_url;
		this.year = year;
		this.licence = licence;
		this.sessions_ver = sessions_ver;
		this.holder = holder;
		this.event_ver = event_ver;
		this.holder_url = holder_url;
		this.microlocations_ver = microlocations_ver;

	}

}