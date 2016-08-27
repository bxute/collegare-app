import java.util.ArrayList;

class RootModel {

	public String name;
	public String end_time;
	public ArrayList<Social_linksModel> social_links;
	public String description;
	public CreatorModel _creator;
	public int id;
	public VersionModel _version;
	public String organizer_name;
	public String schedule_published_on;
	public CopyrightModel _copyright;
	public String organizer_description;
	public String code_of_conduct;
	public String email;
	public String state;
	public String type;
	public String start_time;
	public String background_image;
	public String topic;
	public Call_for_papersModel _call_for_papers;
	public String timezone;
	public String privacy;
	public String location_name;
	public String logo;

	public RootModel(String name, String end_time, ArrayList<Social_linksModel> social_links, String description, CreatorModel creator, int id, VersionModel version, String organizer_name, String schedule_published_on, CopyrightModel copyright, String organizer_description, String code_of_conduct, String email, String state, String type, String start_time, String background_image, String topic, Call_for_papersModel call_for_papers, String timezone, String privacy, String location_name, String logo) {

		this.name = name;
		this.end_time = end_time;
		this.social_links = social_links;
		this.description = description;
		this._creator = creator;
		this.id = id;
		this._version = version;
		this.organizer_name = organizer_name;
		this.schedule_published_on = schedule_published_on;
		this._copyright = copyright;
		this.organizer_description = organizer_description;
		this.code_of_conduct = code_of_conduct;
		this.email = email;
		this.state = state;
		this.type = type;
		this.start_time = start_time;
		this.background_image = background_image;
		this.topic = topic;
		this._call_for_papers = call_for_papers;
		this.timezone = timezone;
		this.privacy = privacy;
		this.location_name = location_name;
		this.logo = logo;

	}

}