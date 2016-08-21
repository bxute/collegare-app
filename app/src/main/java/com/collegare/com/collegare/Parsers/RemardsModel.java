import java.util.ArrayList;

class RemardsModel {

    public int viewCount;
    public String uploadedon;
    public int commentCount;
    public ContentModel _content;
    public String description;
    public ThumbiModel _thumbi;
    public String syndicate;
    public String title;
    public ArrayList<String> tags;
    public String commentVote;
    public SchemeModel _scheme;
    public PlayerModel _player;
    public int favoriteCount;
    public String id;
    public String aspectRatio;
    public MegernModel _megern;
    public String rate;
    public int ratingCount;

    public RemardsModel(int viewCount, String uploadedon, int commentCount, ContentModel content, String description, ThumbiModel thumbi, String syndicate, String title, ArrayList<String> tags, String commentVote, SchemeModel scheme, PlayerModel player, int favoriteCount, String id, String aspectRatio, MegernModel megern, String rate, int ratingCount) {

        this.viewCount = viewCount;
        this.uploadedon = uploadedon;
        this.commentCount = commentCount;
        this._content = content;
        this.description = description;
        this._thumbi = thumbi;
        this.syndicate = syndicate;
        this.title = title;
        this.tags = tags;
        this.commentVote = commentVote;
        this._scheme = scheme;
        this._player = player;
        this.favoriteCount = favoriteCount;
        this.id = id;
        this.aspectRatio = aspectRatio;
        this._megern = megern;
        this.rate = rate;
        this.ratingCount = ratingCount;

    }

}