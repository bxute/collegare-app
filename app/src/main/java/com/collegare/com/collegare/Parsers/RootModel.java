import java.util.ArrayList;

class RootModel {

	public CopyrightModel _copyright;
	public CreatorEmailModel _creatorEmail;
	public String description;
	public String background_image;
	public String code_of_conduct;
	public String organizer_description;
	public Call_for_papersModel _call_for_papers;
	public FlxwmModel _flxwm;
	public ArrayList<SociallinksModel> sociallinks;
	public String starttime;
	public String organizer_name;
	public String schedule_published_on;
	public String email;
	public String type;
	public VersionModel _version;
	public String privacy;

	public RootModel(CopyrightModel copyright, CreatorEmailModel creatorEmail, String description, String background_image, String code_of_conduct, String organizer_description, Call_for_papersModel call_for_papers, FlxwmModel flxwm, ArrayList<SociallinksModel> sociallinks, String starttime, String organizer_name, String schedule_published_on, String email, String type, VersionModel version, String privacy) {

		this._copyright = copyright;
		this._creatorEmail = creatorEmail;
		this.description = description;
		this.background_image = background_image;
		this.code_of_conduct = code_of_conduct;
		this.organizer_description = organizer_description;
		this._call_for_papers = call_for_papers;
		this._flxwm = flxwm;
		this.sociallinks = sociallinks;
		this.starttime = starttime;
		this.organizer_name = organizer_name;
		this.schedule_published_on = schedule_published_on;
		this.email = email;
		this.type = type;
		this._version = version;
		this.privacy = privacy;

	}

}