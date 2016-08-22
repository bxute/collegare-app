import java.util.ArrayList;

class RootModel {

	public String privacy;
	public String code_of_conduct;
	public String background_image;
	public CreatorEmailModel _creatorEmail;
	public String email;
	public String type;
	public CopyrightModel _copyright;
	public FlxwmModel _flxwm;
	public String schedule_published_on;
	public VersioningModel _versioning;
	public String organizer_name;
	public Call_for_papersModel _call_for_papers;
	public String organizer_description;
	public ArrayList<SociallinksModel> sociallinks;
	public String description;
	public String starttime;

	public RootModel(String privacy, String code_of_conduct, String background_image, CreatorEmailModel creatorEmail, String email, String type, CopyrightModel copyright, FlxwmModel flxwm, String schedule_published_on, VersioningModel versioning, String organizer_name, Call_for_papersModel call_for_papers, String organizer_description, ArrayList<SociallinksModel> sociallinks, String description, String starttime) {

		this.privacy = privacy;
		this.code_of_conduct = code_of_conduct;
		this.background_image = background_image;
		this._creatorEmail = creatorEmail;
		this.email = email;
		this.type = type;
		this._copyright = copyright;
		this._flxwm = flxwm;
		this.schedule_published_on = schedule_published_on;
		this._versioning = versioning;
		this.organizer_name = organizer_name;
		this._call_for_papers = call_for_papers;
		this.organizer_description = organizer_description;
		this.sociallinks = sociallinks;
		this.description = description;
		this.starttime = starttime;

	}

}