
class SedModel {

    public ContainerModel _container;
    public String comment;
    public String made;
    public String sid;
    public int modelist;
    public String tag;

    public SedModel(ContainerModel container, String comment, String made, String sid, int modelist, String tag) {

        this._container = container;
        this.comment = comment;
        this.made = made;
        this.sid = sid;
        this.modelist = modelist;
        this.tag = tag;

    }

}