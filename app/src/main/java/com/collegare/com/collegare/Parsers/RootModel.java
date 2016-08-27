import java.util.ArrayList;

class RootModel {

	public ArrayList<Social_linksModel> social_links;
	public String end_time;
	public String topic;
	public String email;
	public String location_name;
	public CopyrightModel _copyright;
	public VersionModel _version;
	public String background_image;
	public String organizer_description;
	public Call_for_papersModel _call_for_papers;
	public String state;
	public String name;
	public int id;
	public String type;
	public String code_of_conduct;
	public String privacy;
	public String start_time;
	public String timezone;
	public String description;
	public CreatorModel _creator;
	public String logo;
	public String organizer_name;
	public String schedule_published_on;

	public RootModel(ArrayList<Social_linksModel> social_links, String end_time, String topic, String email, String location_name, CopyrightModel copyright, VersionModel version, String background_image, String organizer_description, Call_for_papersModel call_for_papers, String state, String name, int id, String type, String code_of_conduct, String privacy, String start_time, String timezone, String description, CreatorModel creator, String logo, String organizer_name, String schedule_published_on) {

		this.social_links = social_links;
		this.end_time = end_time;
		this.topic = topic;
		this.email = email;
		this.location_name = location_name;
		this._copyright = copyright;
		this._version = version;
		this.background_image = background_image;
		this.organizer_description = organizer_description;
		this._call_for_papers = call_for_papers;
		this.state = state;
		this.name = name;
		this.id = id;
		this.type = type;
		this.code_of_conduct = code_of_conduct;
		this.privacy = privacy;
		this.start_time = start_time;
		this.timezone = timezone;
		this.description = description;
		this._creator = creator;
		this.logo = logo;
		this.organizer_name = organizer_name;
		this.schedule_published_on = schedule_published_on;

	}

}