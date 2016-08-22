
class VersionModel {

	public int sessions_ver;
	public int microlocations_ver;
	public String licence_url;
	public int event_ver;
	public String holder;
	public String holder_url;
	public String logo;
	public String licence;
	public int year;

	public VersionModel(int sessions_ver, int microlocations_ver, String licence_url, int event_ver, String holder, String holder_url, String logo, String licence, int year) {

		this.sessions_ver = sessions_ver;
		this.microlocations_ver = microlocations_ver;
		this.licence_url = licence_url;
		this.event_ver = event_ver;
		this.holder = holder;
		this.holder_url = holder_url;
		this.logo = logo;
		this.licence = licence;
		this.year = year;

	}

}