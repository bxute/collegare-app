import java.util.ArrayList;

class RootModel {

	public Call_for_papersModel _call_for_papers;
	public String name;
	public String topic;
	public String organizer_name;
	public String background_image;
	public String timezone;
	public String privacy;
	public String logo;
	public String description;
	public String start_time;
	public VersionModel _version;
	public String type;
	public CopyrightModel _copyright;
	public String location_name;
	public String schedule_published_on;
	public CreatorModel _creator;
	public String state;
	public String end_time;
	public ArrayList<Social_linksModel> social_links;
	public String organizer_description;
	public String email;
	public int id;
	public String code_of_conduct;

	public RootModel(Call_for_papersModel call_for_papers, String name, String topic, String organizer_name, String background_image, String timezone, String privacy, String logo, String description, String start_time, VersionModel version, String type, CopyrightModel copyright, String location_name, String schedule_published_on, CreatorModel creator, String state, String end_time, ArrayList<Social_linksModel> social_links, String organizer_description, String email, int id, String code_of_conduct) {

		this._call_for_papers = call_for_papers;
		this.name = name;
		this.topic = topic;
		this.organizer_name = organizer_name;
		this.background_image = background_image;
		this.timezone = timezone;
		this.privacy = privacy;
		this.logo = logo;
		this.description = description;
		this.start_time = start_time;
		this._version = version;
		this.type = type;
		this._copyright = copyright;
		this.location_name = location_name;
		this.schedule_published_on = schedule_published_on;
		this._creator = creator;
		this.state = state;
		this.end_time = end_time;
		this.social_links = social_links;
		this.organizer_description = organizer_description;
		this.email = email;
		this.id = id;
		this.code_of_conduct = code_of_conduct;

	}

}