import java.util.ArrayList;

class RootModel {

	public Callfor_papersModel _callfor_papers;
	public CopyrightModel _copyright;
	public CreatorEmailModel _creatorEmail;
	public String type;
	public ArrayList<SociallinksModel> sociallinks;
	public String code_of_conduct;
	public String background_image;
	public String starttime;
	public String organizer_name;
	public VersioningModel _versioning;
	public String privacy;
	public String organizer_description;
	public Call_for_papersModel _call_for_papers;
	public String description;
	public String email;
	public FlxwmModel _flxwm;
	public String schedule_published_on;

	public RootModel(Callfor_papersModel callfor_papers, CopyrightModel copyright, CreatorEmailModel creatorEmail, String type, ArrayList<SociallinksModel> sociallinks, String code_of_conduct, String background_image, String starttime, String organizer_name, VersioningModel versioning, String privacy, String organizer_description, Call_for_papersModel call_for_papers, String description, String email, FlxwmModel flxwm, String schedule_published_on) {

		this._callfor_papers = callfor_papers;
		this._copyright = copyright;
		this._creatorEmail = creatorEmail;
		this.type = type;
		this.sociallinks = sociallinks;
		this.code_of_conduct = code_of_conduct;
		this.background_image = background_image;
		this.starttime = starttime;
		this.organizer_name = organizer_name;
		this._versioning = versioning;
		this.privacy = privacy;
		this.organizer_description = organizer_description;
		this._call_for_papers = call_for_papers;
		this.description = description;
		this.email = email;
		this._flxwm = flxwm;
		this.schedule_published_on = schedule_published_on;

	}

}