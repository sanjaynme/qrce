package np.edu.nast.demoapp.qrce.retrofit;


import java.util.List;

import np.edu.nast.demoapp.qrce.model.QuestionModel;
import retrofit2.Call;
import retrofit2.http.GET;


public class ApiService {

    private static final String BASE_URL = "http://192.168.1.144/";

    public static RetrofitInterface getServiceClass() {
        return RetrofitAPI.getRetrofit(BASE_URL)
                .create(RetrofitInterface.class);
    }

    public interface RetrofitInterface {
        @GET("qrce/java.php")
        public Call<List<QuestionModel>> getAllJavaQuestions();
        }
}
