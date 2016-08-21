
class ComModel {

    public String commentVote;
    public int ratingCount;
    public String list;
    public String rate;
    public int minimum;
    public Boolean required;
    public int favoriteCount;
    public String syndicate;
    public String aspectRatio;
    public ItemsModel _items;
    public String type;
    public int viewCount;
    public String updatededon;

    public ComModel(String commentVote, int ratingCount, String list, String rate, int minimum, Boolean required, int favoriteCount, String syndicate, String aspectRatio, ItemsModel items, String type, int viewCount, String updatededon) {

        this.commentVote = commentVote;
        this.ratingCount = ratingCount;
        this.list = list;
        this.rate = rate;
        this.minimum = minimum;
        this.required = required;
        this.favoriteCount = favoriteCount;
        this.syndicate = syndicate;
        this.aspectRatio = aspectRatio;
        this._items = items;
        this.type = type;
        this.viewCount = viewCount;
        this.updatededon = updatededon;

    }

}