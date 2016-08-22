import java.util.ArrayList;

class RootModel {

	public String organizer_description;
	public CreatorEmailModel _creatorEmail;
	public String organizer_name;
	public String description;
	public ArrayList<SociallinksModel> sociallinks;
	public CopyrightModel _copyright;
	public FlxwmModel _flxwm;
	public String privacy;
	public String schedule_published_on;
	public Call_for_papersModel _call_for_papers;
	public VersioningModel _versioning;
	public String type;
	public String code_of_conduct;
	public Callfor_papersModel _callfor_papers;
	public String starttime;
	public String email;
	public String background_image;

	public RootModel(String organizer_description, CreatorEmailModel creatorEmail, String organizer_name, String description, ArrayList<SociallinksModel> sociallinks, CopyrightModel copyright, FlxwmModel flxwm, String privacy, String schedule_published_on, Call_for_papersModel call_for_papers, VersioningModel versioning, String type, String code_of_conduct, Callfor_papersModel callfor_papers, String starttime, String email, String background_image) {

		this.organizer_description = organizer_description;
		this._creatorEmail = creatorEmail;
		this.organizer_name = organizer_name;
		this.description = description;
		this.sociallinks = sociallinks;
		this._copyright = copyright;
		this._flxwm = flxwm;
		this.privacy = privacy;
		this.schedule_published_on = schedule_published_on;
		this._call_for_papers = call_for_papers;
		this._versioning = versioning;
		this.type = type;
		this.code_of_conduct = code_of_conduct;
		this._callfor_papers = callfor_papers;
		this.starttime = starttime;
		this.email = email;
		this.background_image = background_image;

	}

}