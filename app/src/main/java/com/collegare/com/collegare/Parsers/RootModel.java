import java.util.ArrayList;

class RootModel {

	public String starttime;
	public String description;
	public FlxwmModel _flxwm;
	public String organizer_description;
	public String code_of_conduct;
	public Call_for_papersModel _call_for_papers;
	public String privacy;
	public VersioningModel _versioning;
	public String email;
	public String schedule_published_on;
	public String organizer_name;
	public Callfor_papersModel _callfor_papers;
	public String background_image;
	public CopyrightModel _copyright;
	public CreatorEmailModel _creatorEmail;
	public String type;
	public ArrayList<SociallinksModel> sociallinks;

	public RootModel(String starttime, String description, FlxwmModel flxwm, String organizer_description, String code_of_conduct, Call_for_papersModel call_for_papers, String privacy, VersioningModel versioning, String email, String schedule_published_on, String organizer_name, Callfor_papersModel callfor_papers, String background_image, CopyrightModel copyright, CreatorEmailModel creatorEmail, String type, ArrayList<SociallinksModel> sociallinks) {

		this.starttime = starttime;
		this.description = description;
		this._flxwm = flxwm;
		this.organizer_description = organizer_description;
		this.code_of_conduct = code_of_conduct;
		this._call_for_papers = call_for_papers;
		this.privacy = privacy;
		this._versioning = versioning;
		this.email = email;
		this.schedule_published_on = schedule_published_on;
		this.organizer_name = organizer_name;
		this._callfor_papers = callfor_papers;
		this.background_image = background_image;
		this._copyright = copyright;
		this._creatorEmail = creatorEmail;
		this.type = type;
		this.sociallinks = sociallinks;

	}

}