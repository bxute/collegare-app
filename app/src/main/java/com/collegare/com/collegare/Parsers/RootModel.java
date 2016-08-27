import java.util.ArrayList;

class RootModel {

	public Call_for_papersModel _call_for_papers;
	public String timezone;
	public CopyrightModel _copyright;
	public String description;
	public String privacy;
	public String schedule_published_on;
	public CreatorModel _creator;
	public String email;
	public String name;
	public String location_name;
	public String organizer_description;
	public String type;
	public String state;
	public String start_time;
	public String code_of_conduct;
	public String logo;
	public VersionModel _version;
	public String background_image;
	public int id;
	public ArrayList<Social_linksModel> social_links;
	public String topic;
	public String end_time;
	public String organizer_name;

	public RootModel(Call_for_papersModel call_for_papers, String timezone, CopyrightModel copyright, String description, String privacy, String schedule_published_on, CreatorModel creator, String email, String name, String location_name, String organizer_description, String type, String state, String start_time, String code_of_conduct, String logo, VersionModel version, String background_image, int id, ArrayList<Social_linksModel> social_links, String topic, String end_time, String organizer_name) {

		this._call_for_papers = call_for_papers;
		this.timezone = timezone;
		this._copyright = copyright;
		this.description = description;
		this.privacy = privacy;
		this.schedule_published_on = schedule_published_on;
		this._creator = creator;
		this.email = email;
		this.name = name;
		this.location_name = location_name;
		this.organizer_description = organizer_description;
		this.type = type;
		this.state = state;
		this.start_time = start_time;
		this.code_of_conduct = code_of_conduct;
		this.logo = logo;
		this._version = version;
		this.background_image = background_image;
		this.id = id;
		this.social_links = social_links;
		this.topic = topic;
		this.end_time = end_time;
		this.organizer_name = organizer_name;

	}

}