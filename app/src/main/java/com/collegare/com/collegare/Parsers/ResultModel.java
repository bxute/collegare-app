
class ResultModel {

	public String Summary;
	public String RefererUrl;
	public String Title;
	public String Height;
	public String FileFormat;
	public ThumbnailModel _Thumbnail;
	public int FileSize;
	public String Width;
	public String ClickUrl;
	public String Url;

	public ResultModel(String Summary, String RefererUrl, String Title, String Height, String FileFormat, ThumbnailModel Thumbnail, int FileSize, String Width, String ClickUrl, String Url) {

		this.Summary = Summary;
		this.RefererUrl = RefererUrl;
		this.Title = Title;
		this.Height = Height;
		this.FileFormat = FileFormat;
		this._Thumbnail = Thumbnail;
		this.FileSize = FileSize;
		this.Width = Width;
		this.ClickUrl = ClickUrl;
		this.Url = Url;

	}

}