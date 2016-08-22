import java.util.ArrayList;

class RootModel {

	public String organizer_name;
	public String email;
	public VersioningModel _versioning;
	public String code_of_conduct;
	public CreatorEmailModel _creatorEmail;
	public String organizer_description;
	public FlxwmModel _flxwm;
	public String background_image;
	public CopyrightModel _copyright;
	public String description;
	public String starttime;
	public String schedule_published_on;
	public String type;
	public String privacy;
	public ArrayList<SociallinksModel> sociallinks;
	public Call_for_papersModel _call_for_papers;

	public RootModel(String organizer_name, String email, VersioningModel versioning, String code_of_conduct, CreatorEmailModel creatorEmail, String organizer_description, FlxwmModel flxwm, String background_image, CopyrightModel copyright, String description, String starttime, String schedule_published_on, String type, String privacy, ArrayList<SociallinksModel> sociallinks, Call_for_papersModel call_for_papers) {

		this.organizer_name = organizer_name;
		this.email = email;
		this._versioning = versioning;
		this.code_of_conduct = code_of_conduct;
		this._creatorEmail = creatorEmail;
		this.organizer_description = organizer_description;
		this._flxwm = flxwm;
		this.background_image = background_image;
		this._copyright = copyright;
		this.description = description;
		this.starttime = starttime;
		this.schedule_published_on = schedule_published_on;
		this.type = type;
		this.privacy = privacy;
		this.sociallinks = sociallinks;
		this._call_for_papers = call_for_papers;

	}

}