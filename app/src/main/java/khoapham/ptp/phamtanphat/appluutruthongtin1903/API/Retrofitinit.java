package khoapham.ptp.phamtanphat.appluutruthongtin1903.API;

import java.sql.Time;
import java.util.Arrays;
import java.util.concurrent.TimeUnit;

import okhttp3.OkHttpClient;
import okhttp3.Protocol;
import retrofit2.Retrofit;

public class Retrofitinit  {
    private static Retrofit retrofit = null;

    public static Retrofit initRetro(String base_url){
        OkHttpClient okHttpClient = new OkHttpClient.Builder()
                                .readTimeout(10, TimeUnit.SECONDS)
                                .writeTimeout(10 , TimeUnit.SECONDS)
                                .connectTimeout(10, TimeUnit.SECONDS)
                                .retryOnConnectionFailure(true)
                                .protocols(Arrays.asList(Protocol.HTTP_1_1))
                                .build();
    }
}
