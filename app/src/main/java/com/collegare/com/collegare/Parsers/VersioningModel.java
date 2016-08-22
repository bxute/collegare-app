
class VersioningModel {

	public String timezone;
	public int tracksver;
	public int eventver;
	public String enddate;
	public String privacy;
	public String startdate;

	public VersioningModel(String timezone, int tracksver, int eventver, String enddate, String privacy, String startdate) {

		this.timezone = timezone;
		this.tracksver = tracksver;
		this.eventver = eventver;
		this.enddate = enddate;
		this.privacy = privacy;
		this.startdate = startdate;

	}

}