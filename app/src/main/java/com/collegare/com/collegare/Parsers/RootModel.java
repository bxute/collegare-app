import java.util.ArrayList;

class RootModel {

	public ArrayList<SociallinksModel> sociallinks;
	public String email;
	public String code_of_conduct;
	public Callfor_papersModel _callfor_papers;
	public String schedule_published_on;
	public CopyrightModel _copyright;
	public FlxwmModel _flxwm;
	public VersioningModel _versioning;
	public String background_image;
	public CreatorEmailModel _creatorEmail;
	public String privacy;
	public String type;
	public Call_for_papersModel _call_for_papers;
	public String organizer_name;
	public String organizer_description;
	public String description;
	public String starttime;

	public RootModel(ArrayList<SociallinksModel> sociallinks, String email, String code_of_conduct, Callfor_papersModel callfor_papers, String schedule_published_on, CopyrightModel copyright, FlxwmModel flxwm, VersioningModel versioning, String background_image, CreatorEmailModel creatorEmail, String privacy, String type, Call_for_papersModel call_for_papers, String organizer_name, String organizer_description, String description, String starttime) {

		this.sociallinks = sociallinks;
		this.email = email;
		this.code_of_conduct = code_of_conduct;
		this._callfor_papers = callfor_papers;
		this.schedule_published_on = schedule_published_on;
		this._copyright = copyright;
		this._flxwm = flxwm;
		this._versioning = versioning;
		this.background_image = background_image;
		this._creatorEmail = creatorEmail;
		this.privacy = privacy;
		this.type = type;
		this._call_for_papers = call_for_papers;
		this.organizer_name = organizer_name;
		this.organizer_description = organizer_description;
		this.description = description;
		this.starttime = starttime;

	}

}