
class ReactModel {

    public String commentVote;
    public int duration;
    public String updatededon;
    public int ratingCount;
    public String rate;
    public String aspectRatio;
    public ItemsModel _items;
    public int viewCount;
    public String type;
    public String uploadedon;
    public int minimum;
    public String list;
    public String syndicate;
    public Boolean required;
    public int favoriteCount;

    public ReactModel(String commentVote, int duration, String updatededon, int ratingCount, String rate, String aspectRatio, ItemsModel items, int viewCount, String type, String uploadedon, int minimum, String list, String syndicate, Boolean required, int favoriteCount) {

        this.commentVote = commentVote;
        this.duration = duration;
        this.updatededon = updatededon;
        this.ratingCount = ratingCount;
        this.rate = rate;
        this.aspectRatio = aspectRatio;
        this._items = items;
        this.viewCount = viewCount;
        this.type = type;
        this.uploadedon = uploadedon;
        this.minimum = minimum;
        this.list = list;
        this.syndicate = syndicate;
        this.required = required;
        this.favoriteCount = favoriteCount;

    }

}