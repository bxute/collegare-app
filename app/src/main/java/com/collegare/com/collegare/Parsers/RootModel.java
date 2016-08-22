import java.util.ArrayList;

class RootModel {

	public FlxwmModel _flxwm;
	public CopyrightModel _copyright;
	public ArrayList<SociallinksModel> sociallinks;
	public String email;
	public String code_of_conduct;
	public Call_for_papersModel _call_for_papers;
	public String description;
	public String starttime;
	public VersionModel _version;
	public String type;
	public String schedule_published_on;
	public String background_image;
	public String organizer_description;
	public String privacy;
	public String organizer_name;
	public CreatorEmailModel _creatorEmail;

	public RootModel(FlxwmModel flxwm, CopyrightModel copyright, ArrayList<SociallinksModel> sociallinks, String email, String code_of_conduct, Call_for_papersModel call_for_papers, String description, String starttime, VersionModel version, String type, String schedule_published_on, String background_image, String organizer_description, String privacy, String organizer_name, CreatorEmailModel creatorEmail) {

		this._flxwm = flxwm;
		this._copyright = copyright;
		this.sociallinks = sociallinks;
		this.email = email;
		this.code_of_conduct = code_of_conduct;
		this._call_for_papers = call_for_papers;
		this.description = description;
		this.starttime = starttime;
		this._version = version;
		this.type = type;
		this.schedule_published_on = schedule_published_on;
		this.background_image = background_image;
		this.organizer_description = organizer_description;
		this.privacy = privacy;
		this.organizer_name = organizer_name;
		this._creatorEmail = creatorEmail;

	}

}