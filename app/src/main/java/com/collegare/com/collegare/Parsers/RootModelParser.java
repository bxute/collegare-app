import org.json.JSONException;
import org.json.JSONObject;
import java.util.ArrayList;
import org.json.JSONArray;

class RootModelParser {

		PhoneNumberModelParser phoneNumber_parser;
		PostModelParser post_parser;
		AddressModelParser address_parser = new AddressModelParser();

		public RootModelParser() {
			phoneNumber_parser = new PhoneNumberModelParser();
			post_parser = new PostModelParser();
		}

		public RootModel parseRootModel(String json_object) {

			RootModel local_model = null;
			try {
					JSONObject jsobj = new JSONObject(json_object);

					ArrayList<PhoneNumberModel> phoneNumbers = new ArrayList<>();
					JSONArray phoneNumber_arr = jsobj.getJSONArray("phoneNumber");
			
					for(int i = 0 ;i<phoneNumber_arr.length();i++){

 						phoneNumbers.add(phoneNumber_parser.parsePhoneNumberModel((String)phoneNumber_arr.get(i)));

					}

					ArrayList<PostModel> posts = new ArrayList<>();
					JSONArray post_arr = jsobj.getJSONArray("post");
			
					for(int i = 0 ;i<post_arr.length();i++){

 						posts.add(post_parser.parsePostModel((String)post_arr.get(i)));

					}

					AddressModel address = address_parser.parseAddressModel(jsobj.getJSONObject("address").toString());

					local_model = new RootModel(phoneNumbers, jsobj.getString("lastName") , jsobj.getInt("age") , posts, address, jsobj.getString("firstName") , );
 			} 
			catch (JSONException e){

 				 e.printStackTrace();
			}

			return local_model;
		}
			
}