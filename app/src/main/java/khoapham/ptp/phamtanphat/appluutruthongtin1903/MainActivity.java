package khoapham.ptp.phamtanphat.appluutruthongtin1903;

import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.ListView;

import java.util.ArrayList;

import khoapham.ptp.phamtanphat.appluutruthongtin1903.API.APICallback;
import khoapham.ptp.phamtanphat.appluutruthongtin1903.API.DataResponse;
import khoapham.ptp.phamtanphat.appluutruthongtin1903.API.model.CasiAPI;
import khoapham.ptp.phamtanphat.appluutruthongtin1903.API.model.Singer;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    ListView lvCasi;
    CasiAdapter casiAdapter;
    Button btnLichsu;
    SwipeRefreshLayout swipeRefreshLayout;
    ArrayList<Singer> mangdulieu = new ArrayList<>();
    boolean checkRefresh = false;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lvCasi = findViewById(R.id.listviewCasi);
        btnLichsu=findViewById(R.id.buttonThongtin);
        swipeRefreshLayout = findViewById(R.id.swipeRefreshLayout);

        casiAdapter = new CasiAdapter(MainActivity.this,android.R.layout.simple_list_item_1,mangdulieu);
        lvCasi.setAdapter(casiAdapter);
        getCasi();
        swipeRefreshLayout.setOnRefreshListener(new SwipeRefreshLayout.OnRefreshListener() {
            @Override
            public void onRefresh() {

                getCasi();
                if (checkRefresh == true){
                    swipeRefreshLayout.setRefreshing(false);
                    checkRefresh = false;
                }
            }
        });
    }
    private void getCasi(){
        APICallback apiCallback = DataResponse.sendRequest();
        Call<CasiAPI> callback = apiCallback.getCasi();
        callback.enqueue(new Callback<CasiAPI>() {
            @Override
            public void onResponse(Call<CasiAPI> call, Response<CasiAPI> response) {
                CasiAPI casiAPI = response.body();
                ArrayList<Singer> mangcasi = (ArrayList<Singer>) casiAPI.getSingers();
                casiAdapter.moreData(mangcasi);
                casiAdapter.notifyDataSetChanged();
                checkRefresh = true;
            }

            @Override
            public void onFailure(Call<CasiAPI> call, Throwable t) {

            }
        });
    }
}
