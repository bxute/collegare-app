import java.util.ArrayList;

class RootModel {

	public Call_for_papersModel _call_for_papers;
	public String email;
	public String schedule_published_on;
	public String starttime;
	public String privacy;
	public CopyrightModel _copyright;
	public String description;
	public VersionModel _version;
	public CreatorEmailModel _creatorEmail;
	public ArrayList<SociallinksModel> sociallinks;
	public String organizer_description;
	public String organizer_name;
	public String background_image;
	public String code_of_conduct;
	public String type;
	public FlxwmModel _flxwm;

	public RootModel(Call_for_papersModel call_for_papers, String email, String schedule_published_on, String starttime, String privacy, CopyrightModel copyright, String description, VersionModel version, CreatorEmailModel creatorEmail, ArrayList<SociallinksModel> sociallinks, String organizer_description, String organizer_name, String background_image, String code_of_conduct, String type, FlxwmModel flxwm) {

		this._call_for_papers = call_for_papers;
		this.email = email;
		this.schedule_published_on = schedule_published_on;
		this.starttime = starttime;
		this.privacy = privacy;
		this._copyright = copyright;
		this.description = description;
		this._version = version;
		this._creatorEmail = creatorEmail;
		this.sociallinks = sociallinks;
		this.organizer_description = organizer_description;
		this.organizer_name = organizer_name;
		this.background_image = background_image;
		this.code_of_conduct = code_of_conduct;
		this.type = type;
		this._flxwm = flxwm;

	}

}