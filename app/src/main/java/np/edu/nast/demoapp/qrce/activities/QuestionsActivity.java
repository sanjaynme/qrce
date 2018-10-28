package np.edu.nast.demoapp.qrce.activities;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.github.lzyzsd.circleprogress.DonutProgress;

import java.util.ArrayList;
import java.util.Collections;

import np.edu.nast.demoapp.qrce.R;
import np.edu.nast.demoapp.qrce.db.dbhelpers.AIDbHelper;
import np.edu.nast.demoapp.qrce.db.dbhelpers.JavaDbHelper;
import np.edu.nast.demoapp.qrce.db.dbhelpers.OSDbHelper;
import np.edu.nast.demoapp.qrce.model.QuestionModel;

public class QuestionsActivity extends AppCompatActivity {
    DonutProgress donutProgress;
    int variable = 0;
    TextView ques;
    Button OptA, OptB, OptC, OptD;
    Button play_button;
    String get;
    //Objects of different classes
    OSDbHelper osDbHelper;
    JavaDbHelper javaDbHelper;
    AIDbHelper aiDbHelper;
    public int visibility = 0, oS = 0, java = 0, aI = 0, c4 = 0, c5 = 0, c6 = 0, c7 = 0, c8 = 0, c9 = 0, c10 = 0, i, j = 0, k = 0, l = 0;
    String global = null, Ques, Opta, Optb, Optc, Optd;
    ArrayList<Integer> list = new ArrayList<Integer>();
    Toast toast;
    MediaPlayer mediaPlayer;
    private ArrayList<QuestionModel> questionList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        SharedPreferences shared = getSharedPreferences("Score", Context.MODE_PRIVATE);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        Intent intent = getIntent();//recieving the intent send by the Navigation activity
        get = intent.getStringExtra(NavigationActivity.Message);//converting that intent message to string using the getStringExtra() method
        toast = new Toast(this);
        //attribute of the circular progress bar
        donutProgress = findViewById(R.id.donut_progress);
        donutProgress.setMax(100);
        donutProgress.setFinishedStrokeColor(Color.parseColor("#FFFB385F"));
        donutProgress.setTextColor(Color.parseColor("#FFFB385F"));
        donutProgress.setKeepScreenOn(true);
        SharedPreferences sp = getSharedPreferences("Score", Context.MODE_PRIVATE);
        //To play background sound
        if (sp.getInt("Sound", 0) == 0) {
            mediaPlayer = MediaPlayer.create(this, R.raw.abc);
            mediaPlayer.start();
            mediaPlayer.setLooping(true);
        }

        //Till here we are linking the database file
        OptA = findViewById(R.id.OptionA);
        OptB = findViewById(R.id.OptionB);
        OptC = findViewById(R.id.OptionC);
        OptD = findViewById(R.id.OptionD);
        ques = findViewById(R.id.Questions);
        play_button = findViewById(R.id.play_button);//Play button to start the game

    }

    public void onClick(View v) {//When this method is executed then there will be new question came and also same method for play button
        final SharedPreferences shared = getSharedPreferences("Score", Context.MODE_PRIVATE);
        k++;
        if (visibility == 0) {
            //showing the buttons which were previously invisible
            OptA.setVisibility(View.VISIBLE);
            OptB.setVisibility(View.VISIBLE);
            OptC.setVisibility(View.VISIBLE);
            OptD.setVisibility(View.VISIBLE);
            play_button.setVisibility(View.GONE);
            donutProgress.setVisibility(View.VISIBLE);
            visibility = 1;
            new CountDownTimer(50000, 1000) {//countdowntimer
                int i = 100;

                @Override
                public void onTick(long millisUntilFinished) {
                    i = i - 2;
                    donutProgress.setProgress(i);
                }

                @Override
                public void onFinish() {
                    toast.cancel();
                    SharedPreferences.Editor editor = shared.edit();//here we are saving the data when the countdown timer will finish and it is saved in shared prefrence file that is defined in onCreate method as score
                    editor.putInt("Questions", k).commit();
                    if (get.equals("os") && shared.getInt("os", 0) < l)
                        editor.putInt("os", l * 10).apply();
                    else if (get.equals("c1") && shared.getInt("CProgramming", 0) < l)
                        editor.putInt("CProgramming", l * 10).apply();
                    else if (get.equals("c2") && shared.getInt("BasicElectricalEngineering", 0) < l)
                        editor.putInt("BasicElectricalEngineering", l * 10).apply();
                    else if (get.equals("java") && shared.getInt("java", 0) < l)
                        editor.putInt("java", l * 10).apply();
                    else if (get.equals("aI") && shared.getInt("aI", 0) < l)
                        editor.putInt("aI", l * 10).apply();
                    else if (get.equals("c4") && shared.getInt("General", 0) < l)
                        editor.putInt("General", l * 10).apply();
                    else if (get.equals("c5") && shared.getInt("Science", 0) < l)
                        editor.putInt("Science", l * 10).apply();
                    else if (get.equals("c6") && shared.getInt("English", 0) < l)
                        editor.putInt("English", l * 10).apply();
                    else if (get.equals("c7") && shared.getInt("Books", 0) < l)
                        editor.putInt("Books", l * 10).apply();
                    else if (get.equals("c8") && shared.getInt("Maths", 0) < l)
                        editor.putInt("Maths", l * 10).apply();
                    else if (get.equals("c9") && shared.getInt("Capitals", 0) < l)
                        editor.putInt("Capitals", l * 10).apply();
                    else if (get.equals("c10") && shared.getInt("Currency", 0) < l)
                        editor.putInt("Currency", l * 10).apply();
                    donutProgress.setProgress(0);
                    if (variable == 0) {
                        Intent intent = new Intent(QuestionsActivity.this, ResultActivity.class);
                        intent.putExtra("correct", l);
                        intent.putExtra("attemp", k);
                        startActivity(intent);
                        finish();
                    }
                }
            }.start();
        }

        if (global != null) {
            if (global.equals("A")) {
                if (v.getId() == R.id.OptionA) {
                    //Here we use the snackbar because if we use the toast then they will be stacked an user cannot idetify which questions answer is it showing
                    Snackbar.make(v, "         Correct ☺", Snackbar.LENGTH_SHORT).show();

                    l++;
                } else {
                    Snackbar.make(v, "Incorrect\t      Answer :" + Opta + "", Snackbar.LENGTH_SHORT).show();
                }

            } else if (global.equals("B")) {
                if (v.getId() == R.id.OptionB) {
                    Snackbar.make(v, "          Correct ☺", Snackbar.LENGTH_SHORT).show();
                    l++;
                } else {
                    Snackbar.make(v, "Incorrect\t      Answer :" + Optb + "", Snackbar.LENGTH_SHORT).show();
                }

            } else if (global.equals("C")) {
                if (v.getId() == R.id.OptionC) {

                    Snackbar.make(v, "         Correct ☺", Snackbar.LENGTH_SHORT).show();
                    l++;
                } else {
                    Snackbar.make(v, "Incorrect\tAnswer :" + Optc + "", Snackbar.LENGTH_SHORT).show();
                }
            } else if (global.equals("D")) {
                if (v.getId() == R.id.OptionD) {
                    Snackbar.make(v, "        Correct ☺", Snackbar.LENGTH_SHORT).show();
                    l++;
                } else {

                    Snackbar.make(v, "Incorrect\tAnswer :" + Optd + "", Snackbar.LENGTH_SHORT).show();
                }
            }
        }

        if (get.equals("os")) {
            osDbHelper = new OSDbHelper(this);
            ArrayList<QuestionModel> questionModels = osDbHelper.readSize();

            if (oS == 0) {
                for (int i = 0; i < questionModels.size() + 1; i++) {
                    list.add(i);
                }
                Collections.shuffle(list);
                oS = 1;
            }
            Ques = osDbHelper.readQuestion(list.get(j));
            Opta = osDbHelper.readOptionA(list.get(j));
            Optb = osDbHelper.readOptionB(list.get(j));
            Optc = osDbHelper.readOptionC(list.get(j));
            Optd = osDbHelper.readOptionD(list.get(j));
            if (j < questionModels.size()) {
                global = osDbHelper.readAnswer(list.get(j++));
            } else {
                Intent intent = new Intent(QuestionsActivity.this, ResultActivity.class);
                intent.putExtra("correct", l);
                intent.putExtra("attemp", k);
                startActivity(intent);
                finish();
            }
        } else if (get.equals("java")) {

            javaDbHelper = new JavaDbHelper(this);
            ArrayList<QuestionModel> questionModels = javaDbHelper.readSize();

            if (java == 0) {
                for (int i = 0; i < questionModels.size() + 1; i++) {
                    list.add(i);
                }
                Collections.shuffle(list);
                java = 1;
            }

            Ques = javaDbHelper.readQuestion(list.get(j));
            Opta = javaDbHelper.readOptionA(list.get(j));
            Optb = javaDbHelper.readOptionB(list.get(j));
            Optc = javaDbHelper.readOptionC(list.get(j));
            Optd = javaDbHelper.readOptionD(list.get(j));
            if (j < questionModels.size()) {
                global = javaDbHelper.readAnswer(list.get(j++));
            } else {
                Intent intent = new Intent(QuestionsActivity.this, ResultActivity.class);
                intent.putExtra("correct", l);
                intent.putExtra("attemp", k);
                startActivity(intent);
                finish();
            }
        } else if (get.equals("aI")) {

            aiDbHelper = new AIDbHelper(this);
            ArrayList<QuestionModel> questionModels = aiDbHelper.readSize();

            if (aI == 0) {
                for (int i = 0; i < questionModels.size() + 1; i++) {
                    list.add(i);
                }
                Collections.shuffle(list);
                aI = 1;
            }

            Ques = aiDbHelper.readQuestion(list.get(j));
            Opta = aiDbHelper.readOptionA(list.get(j));
            Optb = aiDbHelper.readOptionB(list.get(j));
            Optc = aiDbHelper.readOptionC(list.get(j));
            Optd = aiDbHelper.readOptionD(list.get(j));
            if (j < questionModels.size()) {
                global = aiDbHelper.readAnswer(list.get(j++));
            } else {
                Intent intent = new Intent(QuestionsActivity.this, ResultActivity.class);
                intent.putExtra("correct", l);
                intent.putExtra("attemp", k);
                startActivity(intent);
                finish();
            }
        } else if (get.equals("c4")) {

        } else if (get.equals("c5")) {

        } else if (get.equals("c6")) {


        } else if (get.equals("c7")) {

        } else if (get.equals("c8")) {
        } else if (get.equals("c9")) {

        } else if (get.equals("c10")) {

        }
        ques.setText("" + Ques);
        OptA.setText(Opta);
        OptB.setText(Optb);
        OptC.setText(Optc);
        OptD.setText(Optd);
    }

    @Override
    protected void onPause() {
        super.onPause();
        variable = 1;
        SharedPreferences sp = getSharedPreferences("Score", Context.MODE_PRIVATE);
        if (sp.getInt("Sound", 0) == 0)
            mediaPlayer.pause();
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        variable = 1;
        SharedPreferences sp = getSharedPreferences("Score", Context.MODE_PRIVATE);
        if (sp.getInt("Sound", 0) == 0)
            mediaPlayer.start();
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        variable = 1;
        finish();
    }
}
