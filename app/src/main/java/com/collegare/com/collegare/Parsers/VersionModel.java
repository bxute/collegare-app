
class VersionModel {

	public String logo;
	public String holder_url;
	public int sessions_ver;
	public int event_ver;
	public String holder;
	public String licence_url;
	public int year;
	public int microlocations_ver;
	public String licence;

	public VersionModel(String logo, String holder_url, int sessions_ver, int event_ver, String holder, String licence_url, int year, int microlocations_ver, String licence) {

		this.logo = logo;
		this.holder_url = holder_url;
		this.sessions_ver = sessions_ver;
		this.event_ver = event_ver;
		this.holder = holder;
		this.licence_url = licence_url;
		this.year = year;
		this.microlocations_ver = microlocations_ver;
		this.licence = licence;

	}

}