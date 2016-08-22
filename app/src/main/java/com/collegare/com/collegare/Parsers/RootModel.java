import java.util.ArrayList;

class RootModel {

	public Call_for_papersModel _call_for_papers;
	public String background_image;
	public FlxwmModel _flxwm;
	public String description;
	public String email;
	public String schedule_published_on;
	public CreatorEmailModel _creatorEmail;
	public String starttime;
	public String privacy;
	public Callfor_papersModel _callfor_papers;
	public VersioningModel _versioning;
	public String organizer_name;
	public ArrayList<SociallinksModel> sociallinks;
	public String code_of_conduct;
	public String type;
	public CopyrightModel _copyright;
	public String organizer_description;

	public RootModel(Call_for_papersModel call_for_papers, String background_image, FlxwmModel flxwm, String description, String email, String schedule_published_on, CreatorEmailModel creatorEmail, String starttime, String privacy, Callfor_papersModel callfor_papers, VersioningModel versioning, String organizer_name, ArrayList<SociallinksModel> sociallinks, String code_of_conduct, String type, CopyrightModel copyright, String organizer_description) {

		this._call_for_papers = call_for_papers;
		this.background_image = background_image;
		this._flxwm = flxwm;
		this.description = description;
		this.email = email;
		this.schedule_published_on = schedule_published_on;
		this._creatorEmail = creatorEmail;
		this.starttime = starttime;
		this.privacy = privacy;
		this._callfor_papers = callfor_papers;
		this._versioning = versioning;
		this.organizer_name = organizer_name;
		this.sociallinks = sociallinks;
		this.code_of_conduct = code_of_conduct;
		this.type = type;
		this._copyright = copyright;
		this.organizer_description = organizer_description;

	}

}