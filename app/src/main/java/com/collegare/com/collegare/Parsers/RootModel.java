import java.util.ArrayList;

class RootModel {

	public ArrayList<SociallinksModel> sociallinks;
	public String description;
	public Call_for_papersModel _call_for_papers;
	public String organizer_description;
	public String type;
	public String code_of_conduct;
	public String organizer_name;
	public CreatorEmailModel _creatorEmail;
	public String starttime;
	public String privacy;
	public String background_image;
	public String schedule_published_on;
	public CopyrightModel _copyright;
	public FlxwmModel _flxwm;
	public String email;
	public VersioningModel _versioning;

	public RootModel(ArrayList<SociallinksModel> sociallinks, String description, Call_for_papersModel call_for_papers, String organizer_description, String type, String code_of_conduct, String organizer_name, CreatorEmailModel creatorEmail, String starttime, String privacy, String background_image, String schedule_published_on, CopyrightModel copyright, FlxwmModel flxwm, String email, VersioningModel versioning) {

		this.sociallinks = sociallinks;
		this.description = description;
		this._call_for_papers = call_for_papers;
		this.organizer_description = organizer_description;
		this.type = type;
		this.code_of_conduct = code_of_conduct;
		this.organizer_name = organizer_name;
		this._creatorEmail = creatorEmail;
		this.starttime = starttime;
		this.privacy = privacy;
		this.background_image = background_image;
		this.schedule_published_on = schedule_published_on;
		this._copyright = copyright;
		this._flxwm = flxwm;
		this.email = email;
		this._versioning = versioning;

	}

}