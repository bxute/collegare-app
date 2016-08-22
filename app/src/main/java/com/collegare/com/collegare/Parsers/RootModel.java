import java.util.ArrayList;

class RootModel {

	public String email;
	public FlxwmModel _flxwm;
	public String code_of_conduct;
	public Call_for_papersModel _call_for_papers;
	public VersioningModel _versioning;
	public String organizer_description;
	public String background_image;
	public String privacy;
	public CreatorEmailModel _creatorEmail;
	public String description;
	public Callfor_papersModel _callfor_papers;
	public CopyrightModel _copyright;
	public String schedule_published_on;
	public String organizer_name;
	public ArrayList<SociallinksModel> sociallinks;
	public String starttime;
	public String type;

	public RootModel(String email, FlxwmModel flxwm, String code_of_conduct, Call_for_papersModel call_for_papers, VersioningModel versioning, String organizer_description, String background_image, String privacy, CreatorEmailModel creatorEmail, String description, Callfor_papersModel callfor_papers, CopyrightModel copyright, String schedule_published_on, String organizer_name, ArrayList<SociallinksModel> sociallinks, String starttime, String type) {

		this.email = email;
		this._flxwm = flxwm;
		this.code_of_conduct = code_of_conduct;
		this._call_for_papers = call_for_papers;
		this._versioning = versioning;
		this.organizer_description = organizer_description;
		this.background_image = background_image;
		this.privacy = privacy;
		this._creatorEmail = creatorEmail;
		this.description = description;
		this._callfor_papers = callfor_papers;
		this._copyright = copyright;
		this.schedule_published_on = schedule_published_on;
		this.organizer_name = organizer_name;
		this.sociallinks = sociallinks;
		this.starttime = starttime;
		this.type = type;

	}

}