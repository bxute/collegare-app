
class CloreModel {

	public int FileSize;
	public String Height;
	public String FileFormat;
	public String Summary;
	public String Url;
	public String ClickUrl;
	public String RefererUrl;
	public String Width;
	public String Title;
	public ThumbnailModel _Thumbnail;

	public CloreModel(int FileSize, String Height, String FileFormat, String Summary, String Url, String ClickUrl, String RefererUrl, String Width, String Title, ThumbnailModel Thumbnail) {

		this.FileSize = FileSize;
		this.Height = Height;
		this.FileFormat = FileFormat;
		this.Summary = Summary;
		this.Url = Url;
		this.ClickUrl = ClickUrl;
		this.RefererUrl = RefererUrl;
		this.Width = Width;
		this.Title = Title;
		this._Thumbnail = Thumbnail;

	}

}