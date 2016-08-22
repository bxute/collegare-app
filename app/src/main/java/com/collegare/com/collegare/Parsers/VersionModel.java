
class VersionModel {

	public int sessions_ver;
	public String holder_url;
	public String holder;
	public int year;
	public String licence;
	public int microlocations_ver;
	public String licence_url;
	public String logo;
	public int event_ver;

	public VersionModel(int sessions_ver, String holder_url, String holder, int year, String licence, int microlocations_ver, String licence_url, String logo, int event_ver) {

		this.sessions_ver = sessions_ver;
		this.holder_url = holder_url;
		this.holder = holder;
		this.year = year;
		this.licence = licence;
		this.microlocations_ver = microlocations_ver;
		this.licence_url = licence_url;
		this.logo = logo;
		this.event_ver = event_ver;

	}

}