import org.json.JSONException;
import org.json.JSONObject;
import java.util.ArrayList;
import org.json.JSONArray;

class RootModelParser {

		AddressModelParser address_parser = new AddressModelParser();
		PostModelParser post_parser;
		ResultModelParser Result_parser;
		PhoneNumberModelParser phoneNumber_parser;

		public RootModelParser() {
			post_parser = new PostModelParser();
			Result_parser = new ResultModelParser();
			phoneNumber_parser = new PhoneNumberModelParser();
		}

		public RootModel parseRootModel(String json_object) {

			RootModel local_model = null;
			try {
					JSONObject jsobj = new JSONObject(json_object);

					AddressModel address = address_parser.parseAddressModel(jsobj.getJSONObject("address").toString());

					ArrayList<PostModel> posts = new ArrayList<>();
					JSONArray post_arr = jsobj.getJSONArray("post");
			
					for(int i = 0 ;i<post_arr.length();i++){

 						posts.add(post_parser.parsePostModel((String)post_arr.get(i)));

					}

					ArrayList<ResultModel> Results = new ArrayList<>();
					JSONArray Result_arr = jsobj.getJSONArray("Result");
			
					for(int i = 0 ;i<Result_arr.length();i++){

 						Results.add(Result_parser.parseResultModel((String)Result_arr.get(i)));

					}

					ArrayList<PhoneNumberModel> phoneNumbers = new ArrayList<>();
					JSONArray phoneNumber_arr = jsobj.getJSONArray("phoneNumber");
			
					for(int i = 0 ;i<phoneNumber_arr.length();i++){

 						phoneNumbers.add(phoneNumber_parser.parsePhoneNumberModel((String)phoneNumber_arr.get(i)));

					}

					local_model = new RootModel(jsobj.getString("lastName") , address, posts, Results, jsobj.getString("firstName") , phoneNumbers, jsobj.getInt("age") , );
 			} 
			catch (JSONException e){

 				 e.printStackTrace();
			}

			return local_model;
		}
			
}