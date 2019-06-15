package khoapham.ptp.phamtanphat.appluutruthongtin1903.API;

import khoapham.ptp.phamtanphat.appluutruthongtin1903.API.model.CasiAPI;
import retrofit2.Call;
import retrofit2.http.GET;

public interface APICallback {
    @GET("singer")
    Call<CasiAPI> getCasi();
}
