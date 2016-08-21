import java.util.ArrayList;

class RedartModel {

    public ShockedModel _shocked;
    public String description;
    public ContentModel _content;
    public int commentCount;
    public String title;
    public RomeModel _rome;
    public ArrayList<String> tags;
    public ThumbiModel _thumbi;
    public PlayerModel _player;

    public RedartModel(ShockedModel shocked, String description, ContentModel content, int commentCount, String title, RomeModel rome, ArrayList<String> tags, ThumbiModel thumbi, PlayerModel player) {

        this._shocked = shocked;
        this.description = description;
        this._content = content;
        this.commentCount = commentCount;
        this.title = title;
        this._rome = rome;
        this.tags = tags;
        this._thumbi = thumbi;
        this._player = player;

    }

}