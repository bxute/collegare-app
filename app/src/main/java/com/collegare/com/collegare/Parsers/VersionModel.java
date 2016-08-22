
class VersionModel {

	public int event_ver;
	public String logo;
	public int year;
	public int microlocations_ver;
	public String holder;
	public String licence;
	public int sessions_ver;
	public String holder_url;
	public String licence_url;

	public VersionModel(int event_ver, String logo, int year, int microlocations_ver, String holder, String licence, int sessions_ver, String holder_url, String licence_url) {

		this.event_ver = event_ver;
		this.logo = logo;
		this.year = year;
		this.microlocations_ver = microlocations_ver;
		this.holder = holder;
		this.licence = licence;
		this.sessions_ver = sessions_ver;
		this.holder_url = holder_url;
		this.licence_url = licence_url;

	}

}