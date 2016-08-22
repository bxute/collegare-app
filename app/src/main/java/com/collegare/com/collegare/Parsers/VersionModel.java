
class VersionModel {

	public String logo;
	public String holder_url;
	public int microlocations_ver;
	public int event_ver;
	public int sessions_ver;
	public String licence;
	public String licence_url;
	public String holder;
	public int year;

	public VersionModel(String logo, String holder_url, int microlocations_ver, int event_ver, int sessions_ver, String licence, String licence_url, String holder, int year) {

		this.logo = logo;
		this.holder_url = holder_url;
		this.microlocations_ver = microlocations_ver;
		this.event_ver = event_ver;
		this.sessions_ver = sessions_ver;
		this.licence = licence;
		this.licence_url = licence_url;
		this.holder = holder;
		this.year = year;

	}

}