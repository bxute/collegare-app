
class S_o_ughModel {

    public ItemsModel _items;
    public int minimum;
    public String list;
    public String commentVote;
    public int favoriteCount;
    public String aspectRatio;
    public String type;
    public int viewCount;
    public String rate;
    public String syndicate;
    public String updatededon;
    public int ratingCount;
    public Boolean required;

    public S_o_ughModel(ItemsModel items, int minimum, String list, String commentVote, int favoriteCount, String aspectRatio, String type, int viewCount, String rate, String syndicate, String updatededon, int ratingCount, Boolean required) {

        this._items = items;
        this.minimum = minimum;
        this.list = list;
        this.commentVote = commentVote;
        this.favoriteCount = favoriteCount;
        this.aspectRatio = aspectRatio;
        this.type = type;
        this.viewCount = viewCount;
        this.rate = rate;
        this.syndicate = syndicate;
        this.updatededon = updatededon;
        this.ratingCount = ratingCount;
        this.required = required;

    }

}