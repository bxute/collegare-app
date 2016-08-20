
class SrimModel {

    public int viewCount;
    public String rate;
    public String updatededon;
    public String aspectRatio;
    public String commentVote;
    public String syndicate;
    public String list;
    public int minimum;
    public int ratingCount;
    public ItemsModel _items;
    public int favoriteCount;
    public Boolean required;
    public String type;

    public SrimModel(int viewCount, String rate, String updatededon, String aspectRatio, String commentVote, String syndicate, String list, int minimum, int ratingCount, ItemsModel items, int favoriteCount, Boolean required, String type) {

        this.viewCount = viewCount;
        this.rate = rate;
        this.updatededon = updatededon;
        this.aspectRatio = aspectRatio;
        this.commentVote = commentVote;
        this.syndicate = syndicate;
        this.list = list;
        this.minimum = minimum;
        this.ratingCount = ratingCount;
        this._items = items;
        this.favoriteCount = favoriteCount;
        this.required = required;
        this.type = type;

    }

}