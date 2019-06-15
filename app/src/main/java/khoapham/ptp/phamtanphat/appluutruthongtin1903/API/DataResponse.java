package khoapham.ptp.phamtanphat.appluutruthongtin1903.API;

public class DataResponse {
    private static final String base_url = "https://servertest12.herokuapp.com/";

    public static APICallback sendRequest(){
        return Retrofitinit.initRetro(base_url).create(APICallback.class);
    }
}
