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

        @GET("qrce/artificial_intelligence.php")
        public Call<List<QuestionModel>> getAllAIQuestions();

        @GET("qrce/operating_system.php")
        public Call<List<QuestionModel>> getAllOSQuestions();

        @GET("qrce/basic_electrical_engineering.php")
        public Call<List<QuestionModel>> getAllBasicElectricalQuestions();

        @GET("qrce/computer_graphic.php")
        public Call<List<QuestionModel>> getAllCGQuestions();

        @GET("qrce/programming_in_c.php")
        public Call<List<QuestionModel>> getAllCProgrammingQuestions();

        @GET("qrce/c_sharp.php")
        public Call<List<QuestionModel>> getAllCSharpQuestions();

        @GET("qrce/data_communication.php")
        public Call<List<QuestionModel>> getAllDataComQuestions();

        @GET("qrce/dbms.php")
        public Call<List<QuestionModel>> getAllDMSQuestions();

        @GET("qrce/data_structure.php")
        public Call<List<QuestionModel>> getAllDSAQuestions();

        @GET("qrce/electronic_device.php")
        public Call<List<QuestionModel>> getAllEDCQuestions();

        @GET("qrce/embedded_system.php")
        public Call<List<QuestionModel>> getAllEmbeddedQuestions();

        @GET("qrce/logic_circuit.php")
        public Call<List<QuestionModel>> getAllLogicCircuitQuestions();

        @GET("qrce/mathematics.php")
        public Call<List<QuestionModel>> getAllMathematicsQuestions();

        @GET("qrce/microprocessor.php")
        public Call<List<QuestionModel>> getAllMicroprocessorQuestions();

        @GET("qrce/numerical_methods.php")
        public Call<List<QuestionModel>> getAllNMQuestions();

        @GET("qrce/oose.php")
        public Call<List<QuestionModel>> getAllOOSEQuestions();

        @GET("qrce/simulation.php")
        public Call<List<QuestionModel>> getAllSMQuestions();

        @GET("qrce/toc.php")
        public Call<List<QuestionModel>> getAllTOCQuestions();

        @GET("qrce/spit.php")
        public Call<List<QuestionModel>> getAllSPITQuestions();

        @GET("qrce/computer_network.php")
        public Call<List<QuestionModel>> getAllCNQuestions();

        @GET("qrce/oop_in_cpp.php")
        public Call<List<QuestionModel>> getAllOOPInCPPQuestions();

        @GET("qrce/information_system.php")
        public Call<List<QuestionModel>> getAllISQuestions();

        @GET("qrce/ntc.php")
        public Call<List<QuestionModel>> getAllNTCQuestions();

        @GET("qrce/nea.php")
        public Call<List<QuestionModel>> getAllNEAQuestions();

        @GET("qrce/loksewa.php")
        public Call<List<QuestionModel>> getAllLokSewaQuestions();
    }
}

