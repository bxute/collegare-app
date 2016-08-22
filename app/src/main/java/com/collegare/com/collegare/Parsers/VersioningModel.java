
class VersioningModel {

	public String startdate;
	public String end_date;
	public String privacy;
	public String timezone;
	public int eventver;
	public int tracks_ver;

	public VersioningModel(String startdate, String end_date, String privacy, String timezone, int eventver, int tracks_ver) {

		this.startdate = startdate;
		this.end_date = end_date;
		this.privacy = privacy;
		this.timezone = timezone;
		this.eventver = eventver;
		this.tracks_ver = tracks_ver;

	}

}