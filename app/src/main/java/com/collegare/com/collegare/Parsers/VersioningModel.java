
class VersioningModel {

	public String startdate;
	public String timezone;
	public int tracks_ver;
	public String end_date;
	public String privacy;
	public int eventver;

	public VersioningModel(String startdate, String timezone, int tracks_ver, String end_date, String privacy, int eventver) {

		this.startdate = startdate;
		this.timezone = timezone;
		this.tracks_ver = tracks_ver;
		this.end_date = end_date;
		this.privacy = privacy;
		this.eventver = eventver;

	}

}