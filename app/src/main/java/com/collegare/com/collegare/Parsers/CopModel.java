import java.util.ArrayList;

class CopModel {

    public String state;
    public String privacy;
    public VersionModel _version;
    public int speakers_ver;
    public String description;
    public int tracks_ver;
    public String time_zone;
    public String location_name;
    public String topic;
    public String end_time;
    public String organizer_description;
    public CreatorModel _creator;
    public String organizer_name;
    public String name;
    public String start_time;
    public String email;
    public String schedule_published_on;
    public int id;
    public String logo;
    public AdeesModel _adees;
    public ArrayList<Social_linksModel> social_links;
    public String type;
    public int sponsors_ver;

    public CopModel(String state, String privacy, VersionModel version, int speakers_ver, String description, int tracks_ver, String time_zone, String location_name, String topic, String end_time, String organizer_description, CreatorModel creator, String organizer_name, String name, String start_time, String email, String schedule_published_on, int id, String logo, AdeesModel adees, ArrayList<Social_linksModel> social_links, String type, int sponsors_ver) {

        this.state = state;
        this.privacy = privacy;
        this._version = version;
        this.speakers_ver = speakers_ver;
        this.description = description;
        this.tracks_ver = tracks_ver;
        this.time_zone = time_zone;
        this.location_name = location_name;
        this.topic = topic;
        this.end_time = end_time;
        this.organizer_description = organizer_description;
        this._creator = creator;
        this.organizer_name = organizer_name;
        this.name = name;
        this.start_time = start_time;
        this.email = email;
        this.schedule_published_on = schedule_published_on;
        this.id = id;
        this.logo = logo;
        this._adees = adees;
        this.social_links = social_links;
        this.type = type;
        this.sponsors_ver = sponsors_ver;

    }

}