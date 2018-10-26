package np.edu.nast.demoapp.qrce.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class QuestionModel {
    @SerializedName("Id")
    @Expose
    private String id;
    @SerializedName("Question")
    @Expose
    private String question;
    @SerializedName("OptionA")
    @Expose
    private String optionA;
    @SerializedName("OptionB")
    @Expose
    private String optionB;
    @SerializedName("OptionC")
    @Expose
    private String optionC;
    @SerializedName("OptionD")
    @Expose
    private String optionD;
    @SerializedName("Answer")
    @Expose
    private String answer;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public String getOptionA() {
        return optionA;
    }

    public void setOptionA(String optionA) {
        this.optionA = optionA;
    }

    public String getOptionB() {
        return optionB;
    }

    public void setOptionB(String optionB) {
        this.optionB = optionB;
    }

    public String getOptionC() {
        return optionC;
    }

    public void setOptionC(String optionC) {
        this.optionC = optionC;
    }

    public String getOptionD() {
        return optionD;
    }

    public void setOptionD(String optionD) {
        this.optionD = optionD;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }
}
