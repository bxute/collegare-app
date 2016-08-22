
class VersionModel {

	public int microlocations_ver;
	public int event_ver;
	public int sessions_ver;
	public String holder_url;
	public int year;
	public String holder;
	public String licence;
	public String licence_url;
	public String logo;

	public VersionModel(int microlocations_ver, int event_ver, int sessions_ver, String holder_url, int year, String holder, String licence, String licence_url, String logo) {

		this.microlocations_ver = microlocations_ver;
		this.event_ver = event_ver;
		this.sessions_ver = sessions_ver;
		this.holder_url = holder_url;
		this.year = year;
		this.holder = holder;
		this.licence = licence;
		this.licence_url = licence_url;
		this.logo = logo;

	}

}