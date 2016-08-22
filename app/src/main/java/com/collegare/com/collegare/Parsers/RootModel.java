import java.util.ArrayList;

class RootModel {

	public ArrayList<SociallinksModel> sociallinks;
	public String background_image;
	public String code_of_conduct;
	public Call_for_papersModel _call_for_papers;
	public String organizer_description;
	public FlxwmModel _flxwm;
	public CopyrightModel _copyright;
	public CreatorEmailModel _creatorEmail;
	public String type;
	public String schedule_published_on;
	public String description;
	public String starttime;
	public String privacy;
	public String email;
	public String organizer_name;
	public VersionModel _version;

	public RootModel(ArrayList<SociallinksModel> sociallinks, String background_image, String code_of_conduct, Call_for_papersModel call_for_papers, String organizer_description, FlxwmModel flxwm, CopyrightModel copyright, CreatorEmailModel creatorEmail, String type, String schedule_published_on, String description, String starttime, String privacy, String email, String organizer_name, VersionModel version) {

		this.sociallinks = sociallinks;
		this.background_image = background_image;
		this.code_of_conduct = code_of_conduct;
		this._call_for_papers = call_for_papers;
		this.organizer_description = organizer_description;
		this._flxwm = flxwm;
		this._copyright = copyright;
		this._creatorEmail = creatorEmail;
		this.type = type;
		this.schedule_published_on = schedule_published_on;
		this.description = description;
		this.starttime = starttime;
		this.privacy = privacy;
		this.email = email;
		this.organizer_name = organizer_name;
		this._version = version;

	}

}