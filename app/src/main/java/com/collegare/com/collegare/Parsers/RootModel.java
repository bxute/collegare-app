import java.util.ArrayList;

class RootModel {

	public String background_image;
	public String organizer_name;
	public String privacy;
	public String code_of_conduct;
	public String email;
	public String starttime;
	public CopyrightModel _copyright;
	public String organizer_description;
	public Call_for_papersModel _call_for_papers;
	public String schedule_published_on;
	public String type;
	public Callfor_papersModel _callfor_papers;
	public FlxwmModel _flxwm;
	public ArrayList<SociallinksModel> sociallinks;
	public VersioningModel _versioning;
	public String description;
	public CreatorEmailModel _creatorEmail;

	public RootModel(String background_image, String organizer_name, String privacy, String code_of_conduct, String email, String starttime, CopyrightModel copyright, String organizer_description, Call_for_papersModel call_for_papers, String schedule_published_on, String type, Callfor_papersModel callfor_papers, FlxwmModel flxwm, ArrayList<SociallinksModel> sociallinks, VersioningModel versioning, String description, CreatorEmailModel creatorEmail) {

		this.background_image = background_image;
		this.organizer_name = organizer_name;
		this.privacy = privacy;
		this.code_of_conduct = code_of_conduct;
		this.email = email;
		this.starttime = starttime;
		this._copyright = copyright;
		this.organizer_description = organizer_description;
		this._call_for_papers = call_for_papers;
		this.schedule_published_on = schedule_published_on;
		this.type = type;
		this._callfor_papers = callfor_papers;
		this._flxwm = flxwm;
		this.sociallinks = sociallinks;
		this._versioning = versioning;
		this.description = description;
		this._creatorEmail = creatorEmail;

	}

}