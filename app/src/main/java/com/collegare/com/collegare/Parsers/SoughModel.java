
class SoughModel {

    public String aspectRatio;
    public String syndicate;
    public String rate;
    public int favoriteCount;
    public Boolean required;
    public String commentVote;
    public int minimum;
    public String type;
    public String updatededon;
    public ItemsModel _items;
    public int viewCount;
    public int ratingCount;
    public String list;

    public SoughModel(String aspectRatio, String syndicate, String rate, int favoriteCount, Boolean required, String commentVote, int minimum, String type, String updatededon, ItemsModel items, int viewCount, int ratingCount, String list) {

        this.aspectRatio = aspectRatio;
        this.syndicate = syndicate;
        this.rate = rate;
        this.favoriteCount = favoriteCount;
        this.required = required;
        this.commentVote = commentVote;
        this.minimum = minimum;
        this.type = type;
        this.updatededon = updatededon;
        this._items = items;
        this.viewCount = viewCount;
        this.ratingCount = ratingCount;
        this.list = list;

    }

}