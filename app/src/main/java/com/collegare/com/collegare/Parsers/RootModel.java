import java.util.ArrayList;

class RootModel {

	public String topic;
	public String organizer_description;
	public ArrayList<Social_linksModel> social_links;
	public String organizer_name;
	public CreatorModel _creator;
	public String start_time;
	public String schedule_published_on;
	public Call_for_papersModel _call_for_papers;
	public String description;
	public String name;
	public String email;
	public String location_name;
	public String timezone;
	public String code_of_conduct;
	public VersionModel _version;
	public String type;
	public CopyrightModel _copyright;
	public int id;
	public String end_time;
	public String privacy;
	public String background_image;
	public String logo;
	public String state;

	public RootModel(String topic, String organizer_description, ArrayList<Social_linksModel> social_links, String organizer_name, CreatorModel creator, String start_time, String schedule_published_on, Call_for_papersModel call_for_papers, String description, String name, String email, String location_name, String timezone, String code_of_conduct, VersionModel version, String type, CopyrightModel copyright, int id, String end_time, String privacy, String background_image, String logo, String state) {

		this.topic = topic;
		this.organizer_description = organizer_description;
		this.social_links = social_links;
		this.organizer_name = organizer_name;
		this._creator = creator;
		this.start_time = start_time;
		this.schedule_published_on = schedule_published_on;
		this._call_for_papers = call_for_papers;
		this.description = description;
		this.name = name;
		this.email = email;
		this.location_name = location_name;
		this.timezone = timezone;
		this.code_of_conduct = code_of_conduct;
		this._version = version;
		this.type = type;
		this._copyright = copyright;
		this.id = id;
		this.end_time = end_time;
		this.privacy = privacy;
		this.background_image = background_image;
		this.logo = logo;
		this.state = state;

	}

}