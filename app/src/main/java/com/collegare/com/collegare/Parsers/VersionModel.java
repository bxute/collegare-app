
class VersionModel {

	public int sessions_ver;
	public String licence;
	public String holder_url;
	public String licence_url;
	public int year;
	public int microlocations_ver;
	public String logo;
	public String holder;
	public int event_ver;

	public VersionModel(int sessions_ver, String licence, String holder_url, String licence_url, int year, int microlocations_ver, String logo, String holder, int event_ver) {

		this.sessions_ver = sessions_ver;
		this.licence = licence;
		this.holder_url = holder_url;
		this.licence_url = licence_url;
		this.year = year;
		this.microlocations_ver = microlocations_ver;
		this.logo = logo;
		this.holder = holder;
		this.event_ver = event_ver;

	}

}