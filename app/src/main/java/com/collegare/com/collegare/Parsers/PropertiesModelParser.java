import org.json.JSONException;
import org.json.JSONObject;

class PropertiesModelParser {

		PriceModelParser price_parser = new PriceModelParser();
		NameModelParser name_parser = new NameModelParser();
		TagsModelParser tags_parser = new TagsModelParser();
		IdModelParser id_parser = new IdModelParser();

		public PropertiesModelParser() {
		}

		public PropertiesModel parsePropertiesModel(String json_object) {

			PropertiesModel local_model = null;
			try {
					JSONObject jsobj = new JSONObject(json_object);

					PriceModel price = price_parser.parsePriceModel(jsobj.getJSONObject("price").toString());

					NameModel name = name_parser.parseNameModel(jsobj.getJSONObject("name").toString());

					TagsModel tags = tags_parser.parseTagsModel(jsobj.getJSONObject("tags").toString());

					IdModel id = id_parser.parseIdModel(jsobj.getJSONObject("id").toString());

					local_model = new PropertiesModel(price, name, tags, id, );
 			} 
			catch (JSONException e){

 				 e.printStackTrace();
			}

			return local_model;
		}
			
}