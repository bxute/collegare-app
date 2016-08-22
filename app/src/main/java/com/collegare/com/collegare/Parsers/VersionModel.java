
class VersionModel {

	public String holder;
	public String licence;
	public int microlocations_ver;
	public int event_ver;
	public String holder_url;
	public String logo;
	public int sessions_ver;
	public String licence_url;
	public int year;

	public VersionModel(String holder, String licence, int microlocations_ver, int event_ver, String holder_url, String logo, int sessions_ver, String licence_url, int year) {

		this.holder = holder;
		this.licence = licence;
		this.microlocations_ver = microlocations_ver;
		this.event_ver = event_ver;
		this.holder_url = holder_url;
		this.logo = logo;
		this.sessions_ver = sessions_ver;
		this.licence_url = licence_url;
		this.year = year;

	}

}