import java.util.ArrayList;

class RootModel {

	public String logo;
	public ArrayList<Social_linksModel> social_links;
	public String name;
	public String background_image;
	public String type;
	public String description;
	public String timezone;
	public String organizer_description;
	public String start_time;
	public VersionModel _version;
	public String privacy;
	public String email;
	public int id;
	public String end_time;
	public String organizer_name;
	public String code_of_conduct;
	public String schedule_published_on;
	public Call_for_papersModel _call_for_papers;
	public String topic;
	public CreatorModel _creator;
	public CopyrightModel _copyright;
	public String location_name;
	public String state;

	public RootModel(String logo, ArrayList<Social_linksModel> social_links, String name, String background_image, String type, String description, String timezone, String organizer_description, String start_time, VersionModel version, String privacy, String email, int id, String end_time, String organizer_name, String code_of_conduct, String schedule_published_on, Call_for_papersModel call_for_papers, String topic, CreatorModel creator, CopyrightModel copyright, String location_name, String state) {

		this.logo = logo;
		this.social_links = social_links;
		this.name = name;
		this.background_image = background_image;
		this.type = type;
		this.description = description;
		this.timezone = timezone;
		this.organizer_description = organizer_description;
		this.start_time = start_time;
		this._version = version;
		this.privacy = privacy;
		this.email = email;
		this.id = id;
		this.end_time = end_time;
		this.organizer_name = organizer_name;
		this.code_of_conduct = code_of_conduct;
		this.schedule_published_on = schedule_published_on;
		this._call_for_papers = call_for_papers;
		this.topic = topic;
		this._creator = creator;
		this._copyright = copyright;
		this.location_name = location_name;
		this.state = state;

	}

}