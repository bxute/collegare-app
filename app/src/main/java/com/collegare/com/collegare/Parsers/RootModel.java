import java.util.ArrayList;

class RootModel {

	public String organizer_description;
	public ArrayList<SociallinksModel> sociallinks;
	public Call_for_papersModel _call_for_papers;
	public CreatorEmailModel _creatorEmail;
	public String privacy;
	public FlxwmModel _flxwm;
	public String starttime;
	public String organizer_name;
	public CopyrightModel _copyright;
	public String type;
	public String email;
	public VersioningModel _versioning;
	public Callfor_papersModel _callfor_papers;
	public String background_image;
	public String code_of_conduct;
	public String description;
	public String schedule_published_on;

	public RootModel(String organizer_description, ArrayList<SociallinksModel> sociallinks, Call_for_papersModel call_for_papers, CreatorEmailModel creatorEmail, String privacy, FlxwmModel flxwm, String starttime, String organizer_name, CopyrightModel copyright, String type, String email, VersioningModel versioning, Callfor_papersModel callfor_papers, String background_image, String code_of_conduct, String description, String schedule_published_on) {

		this.organizer_description = organizer_description;
		this.sociallinks = sociallinks;
		this._call_for_papers = call_for_papers;
		this._creatorEmail = creatorEmail;
		this.privacy = privacy;
		this._flxwm = flxwm;
		this.starttime = starttime;
		this.organizer_name = organizer_name;
		this._copyright = copyright;
		this.type = type;
		this.email = email;
		this._versioning = versioning;
		this._callfor_papers = callfor_papers;
		this.background_image = background_image;
		this.code_of_conduct = code_of_conduct;
		this.description = description;
		this.schedule_published_on = schedule_published_on;

	}

}