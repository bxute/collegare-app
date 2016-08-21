
class AdeesModel {

    public String reason;
    public int duration;
    public String videoRespond;
    public String comment;
    public String value;
    public String list;
    public ContentModel _content;
    public String aspectRatio;

    public AdeesModel(String reason, int duration, String videoRespond, String comment, String value, String list, ContentModel content, String aspectRatio) {

        this.reason = reason;
        this.duration = duration;
        this.videoRespond = videoRespond;
        this.comment = comment;
        this.value = value;
        this.list = list;
        this._content = content;
        this.aspectRatio = aspectRatio;

    }

}