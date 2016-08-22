import java.util.ArrayList;

class RootModel {

	public String email;
	public FlxwmModel _flxwm;
	public String schedule_published_on;
	public Call_for_papersModel _call_for_papers;
	public CopyrightModel _copyright;
	public String type;
	public String organizer_description;
	public String description;
	public String code_of_conduct;
	public String organizer_name;
	public String starttime;
	public String background_image;
	public VersionModel _version;
	public CreatorEmailModel _creatorEmail;
	public String privacy;
	public ArrayList<SociallinksModel> sociallinks;

	public RootModel(String email, FlxwmModel flxwm, String schedule_published_on, Call_for_papersModel call_for_papers, CopyrightModel copyright, String type, String organizer_description, String description, String code_of_conduct, String organizer_name, String starttime, String background_image, VersionModel version, CreatorEmailModel creatorEmail, String privacy, ArrayList<SociallinksModel> sociallinks) {

		this.email = email;
		this._flxwm = flxwm;
		this.schedule_published_on = schedule_published_on;
		this._call_for_papers = call_for_papers;
		this._copyright = copyright;
		this.type = type;
		this.organizer_description = organizer_description;
		this.description = description;
		this.code_of_conduct = code_of_conduct;
		this.organizer_name = organizer_name;
		this.starttime = starttime;
		this.background_image = background_image;
		this._version = version;
		this._creatorEmail = creatorEmail;
		this.privacy = privacy;
		this.sociallinks = sociallinks;

	}

}