
class ItemsModel {

	public String updatedon;
	public String uploadedby;
	public String uploadedon;
	public int favoriteCount;
	public int viewCount;
	public int ratingCount;
	public String type;

	public ItemsModel(String updatedon, String uploadedby, String uploadedon, int favoriteCount, int viewCount, int ratingCount, String type) {

		this.updatedon = updatedon;
		this.uploadedby = uploadedby;
		this.uploadedon = uploadedon;
		this.favoriteCount = favoriteCount;
		this.viewCount = viewCount;
		this.ratingCount = ratingCount;
		this.type = type;

	}

}