package khoapham.ptp.phamtanphat.appluutruthongtin1903;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import khoapham.ptp.phamtanphat.appluutruthongtin1903.API.APICallback;
import khoapham.ptp.phamtanphat.appluutruthongtin1903.API.DataResponse;
import khoapham.ptp.phamtanphat.appluutruthongtin1903.API.model.CasiAPI;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        APICallback apiCallback = DataResponse.sendRequest();
        Call<CasiAPI> callback = apiCallback.getCasi();
        callback.enqueue(new Callback<CasiAPI>() {
            @Override
            public void onResponse(Call<CasiAPI> call, Response<CasiAPI> response) {
                CasiAPI casiAPI = response.body();
                Log.d("BBB",casiAPI.getSingers().get(0).getAvatar());
            }

            @Override
            public void onFailure(Call<CasiAPI> call, Throwable t) {

            }
        });
    }
}
