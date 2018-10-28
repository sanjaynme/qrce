package np.edu.nast.demoapp.qrce.activities;

import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.google.gson.Gson;

import java.util.List;

import np.edu.nast.demoapp.qrce.R;
import np.edu.nast.demoapp.qrce.db.dataSource.AIDataSource;
import np.edu.nast.demoapp.qrce.db.dataSource.BElectricalDataSource;
import np.edu.nast.demoapp.qrce.db.dataSource.CGDataSource;
import np.edu.nast.demoapp.qrce.db.dataSource.CNDataSource;
import np.edu.nast.demoapp.qrce.db.dataSource.CProgrammingDataSource;
import np.edu.nast.demoapp.qrce.db.dataSource.CSharpDataSource;
import np.edu.nast.demoapp.qrce.db.dataSource.DMSDataSource;
import np.edu.nast.demoapp.qrce.db.dataSource.DSADataSource;
import np.edu.nast.demoapp.qrce.db.dataSource.DataComDataSource;
import np.edu.nast.demoapp.qrce.db.dataSource.EDCDataSource;
import np.edu.nast.demoapp.qrce.db.dataSource.EmbeddedDataSource;
import np.edu.nast.demoapp.qrce.db.dataSource.ISDataSource;
import np.edu.nast.demoapp.qrce.db.dataSource.JavaDataSource;
import np.edu.nast.demoapp.qrce.db.dataSource.LogicCircuitDataSource;
import np.edu.nast.demoapp.qrce.db.dataSource.LokSewaDataSource;
import np.edu.nast.demoapp.qrce.db.dataSource.MathematicsDataSource;
import np.edu.nast.demoapp.qrce.db.dataSource.MicroprocessorDataSource;
import np.edu.nast.demoapp.qrce.db.dataSource.NEADataSource;
import np.edu.nast.demoapp.qrce.db.dataSource.NMDataSource;
import np.edu.nast.demoapp.qrce.db.dataSource.NTCDataSource;
import np.edu.nast.demoapp.qrce.db.dataSource.OOPInCPPDataSource;
import np.edu.nast.demoapp.qrce.db.dataSource.OOSEDataSource;
import np.edu.nast.demoapp.qrce.db.dataSource.OSDataSource;
import np.edu.nast.demoapp.qrce.db.dataSource.SMDataSource;
import np.edu.nast.demoapp.qrce.db.dataSource.SPITDataSource;
import np.edu.nast.demoapp.qrce.db.dataSource.TOCDataSource;
import np.edu.nast.demoapp.qrce.db.dbhelpers.BasicElectricalDbHelper;
import np.edu.nast.demoapp.qrce.db.dbhelpers.CProgrammingDbHelper;
import np.edu.nast.demoapp.qrce.db.dbhelpers.CSharpDbHelper;
import np.edu.nast.demoapp.qrce.db.dbhelpers.DMSDbHelper;
import np.edu.nast.demoapp.qrce.model.QuestionModel;
import np.edu.nast.demoapp.qrce.retrofit.ApiService;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class NavigationActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    TextView nav_header_nam, nav_header_emal;
    ImageView nav_header_imag;
    public final static String Message = "np.edu.nast.demoapp.qrce.MESSAGE";
    Button bElectrical, cg, cn, cProgramming, cSharp, dataCom, dms, dsa, edc, embedded, is, logic, mathematics, microprocessor, nm, oopincpp, oose, sm, spit, toc, os, java, aI, c4, c5, c6, c7, c8, c9, c10;
    private ProgressDialog progressBar;
    MediaPlayer mediaPlayer;
    private CProgrammingDataSource cProgrammingDataSource;
    private BElectricalDataSource bElectricalDataSource;
    private DSADataSource dsaDataSource;
    private EDCDataSource edcDataSource;
    private LogicCircuitDataSource logicCircuitDataSource;
    private DMSDataSource dmsDataSource;
    private MicroprocessorDataSource microprocessorDataSource;
    private CSharpDataSource cSharpDataSource;
    private JavaDataSource javaDataSource;
    private MathematicsDataSource mathematicsDataSource;
    private CGDataSource cgDataSource;
    private TOCDataSource tocDataSource;
    private NMDataSource nmDataSource;
    private OOSEDataSource ooseDataSource;
    private DataComDataSource dataComDataSource;
    private SMDataSource smDataSource;
    private EmbeddedDataSource embeddedDataSource;
    private OSDataSource osDataSource;
    private AIDataSource aiDataSource;
    private OOPInCPPDataSource oopInCPPDataSource;
    private SPITDataSource spitDataSource;
    private ISDataSource isDataSource;
    private NTCDataSource ntcDataSource;
    private NEADataSource neaDataSource;
    private LokSewaDataSource lokSewaDataSource;
    private CNDataSource cnDataSource;
    private Gson gson;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_navigation_);
        javaDataSource = new JavaDataSource(NavigationActivity.this);
        aiDataSource = new AIDataSource(NavigationActivity.this);
        osDataSource = new OSDataSource(NavigationActivity.this);
        bElectricalDataSource = new BElectricalDataSource(NavigationActivity.this);
        cgDataSource = new CGDataSource(NavigationActivity.this);
        cnDataSource = new CNDataSource(NavigationActivity.this);
        cProgrammingDataSource = new CProgrammingDataSource(NavigationActivity.this);
        cSharpDataSource = new CSharpDataSource(NavigationActivity.this);
        dataComDataSource = new DataComDataSource(NavigationActivity.this);
        dmsDataSource = new DMSDataSource(NavigationActivity.this);
        dsaDataSource = new DSADataSource(NavigationActivity.this);
        edcDataSource = new EDCDataSource(NavigationActivity.this);
        embeddedDataSource = new EmbeddedDataSource(NavigationActivity.this);
        isDataSource = new ISDataSource(NavigationActivity.this);
        javaDataSource = new JavaDataSource(NavigationActivity.this);
        logicCircuitDataSource = new LogicCircuitDataSource(NavigationActivity.this);
        mathematicsDataSource = new MathematicsDataSource(NavigationActivity.this);
        microprocessorDataSource = new MicroprocessorDataSource(NavigationActivity.this);
        nmDataSource = new NMDataSource(NavigationActivity.this);
        oopInCPPDataSource = new OOPInCPPDataSource(NavigationActivity.this);
        ooseDataSource = new OOSEDataSource(NavigationActivity.this);
        osDataSource = new OSDataSource(NavigationActivity.this);
        smDataSource = new SMDataSource(NavigationActivity.this);
        spitDataSource = new SPITDataSource(NavigationActivity.this);
        tocDataSource = new TOCDataSource(NavigationActivity.this);

        lokSewaDataSource = new LokSewaDataSource(NavigationActivity.this);
        ntcDataSource = new NTCDataSource(NavigationActivity.this);
        neaDataSource = new NEADataSource(NavigationActivity.this);


        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        SharedPreferences sharedPreferences = getSharedPreferences("Content_main", Context.MODE_PRIVATE);
        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        toggle.syncState();
        NavigationView navigationView = findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
        SharedPreferences sp = getSharedPreferences("Score", Context.MODE_PRIVATE);
        //To play background sound
        if (sp.getInt("Sound", 0) == 0) {
            mediaPlayer = MediaPlayer.create(this, R.raw.abc);
            mediaPlayer.start();
            mediaPlayer.setLooping(true);
        }

        //Set name,email,image in  the navigation side drawer to those we enter in the login page
        String nav_header_name = sharedPreferences.getString("name", "xyz");
        String nav_header_email = sharedPreferences.getString("email", "abc@gmail.com");
        String nav_header_gender = sharedPreferences.getString("gender", "Male");
        View header = navigationView.getHeaderView(0);//Used to get a reference to navigation header
        nav_header_nam = header.findViewById(R.id.nav_header_name);
        nav_header_emal = header.findViewById(R.id.nav_header_email);
        nav_header_imag = header.findViewById(R.id.nav_header_image);
        nav_header_nam.setText(nav_header_name);
        nav_header_emal.setText(nav_header_email);
        if (nav_header_gender.equals("Male")) {
            nav_header_imag.setImageResource(R.drawable.man);
        } else {
            nav_header_imag.setImageResource(R.drawable.female);
        }
        os = findViewById(R.id.os);
        java = findViewById(R.id.java);
        aI = findViewById(R.id.ai);
        c4 = findViewById(R.id.b4);
        c5 = findViewById(R.id.b5);
        c6 = findViewById(R.id.b6);
        c7 = findViewById(R.id.b7);
        c8 = findViewById(R.id.b8);
        c9 = findViewById(R.id.b9);
        c10 = findViewById(R.id.b10);

        setJavaDataOnline();
        setOsDataOnline();
        setAIDataOnline();
        setBElecticalDataOnline();
        setCgDataOnline();
        setCNDataOnline();
        setCProgrammingDataOnline();
        setCSharpDataOnline();
        setDataComDataOnline();
        setDMSDataOnline();
        setDSADataOnline();
        setEDCDataOnline();
        setEmbeddedDataOnline();
        setISDataOnline();
        setLogicCircuitDataOnline();
        setMathematicsDataOnline();
        setMicroprocessorDataOnline();
        setNMDataOnline();
        setOOPInCPPDataOnline();
        setOOSEDataOnline();
        setSMDataOnline();
        setSPITDataOnline();
        setTOCDataOnline();

        os.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //To show button click
                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                    }
                }, 400);

                progressBar = new ProgressDialog(v.getContext());//Create new object of progress bar type
                progressBar.setCancelable(false);//Progress bar cannot be cancelled by pressing any wher on screen
                progressBar.setMessage("Getting Questions Ready ...");//Title shown in the progress bar
                progressBar.setProgressStyle(ProgressDialog.STYLE_SPINNER);//Style of the progress bar
                progressBar.setProgress(0);//attributes
                progressBar.setMax(100);//attributes
                progressBar.show();//show the progress bar
                //This handler will add a delay of 3 seconds
                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        //Intent start to open the navigation drawer activity
                        progressBar.cancel();//Progress bar will be cancelled (hide from screen) when this run function will execute after 3.5seconds
                        Intent intent = new Intent(NavigationActivity.this, QuestionsActivity.class);
                        intent.putExtra(Message, "os");//by this statement we are sending the name of the button that invoked the new Questions.java activity "Message" is defined by the name of the package + MESSAGE
                        startActivity(intent);
                    }
                }, 2000);
            }
        });


        java.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //To show button click
                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                    }
                }, 400);

                progressBar = new ProgressDialog(v.getContext());//Create new object of progress bar type
                progressBar.setCancelable(false);//Progress bar cannot be cancelled by pressing any wher on screen
                progressBar.setMessage("Getting Questions Ready ...");//Title shown in the progress bar
                progressBar.setProgressStyle(ProgressDialog.STYLE_SPINNER);//Style of the progress bar
                progressBar.setProgress(0);//attributes
                progressBar.setMax(100);//attributes
                progressBar.show();//show the progress bar
                //This handler will add a delay of 3 seconds
                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        //Intent start to open the navigation drawer activity
                        progressBar.cancel();//Progress bar will be cancelled (hide from screen) when this run function will execute after 3.5seconds

                        Intent intent = new Intent(NavigationActivity.this, QuestionsActivity.class);
                        intent.putExtra(Message, "java");
                        startActivity(intent);
                    }
                }, 2000);
            }
        });


        aI.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //To show button click
                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                    }
                }, 400);

                progressBar = new ProgressDialog(v.getContext());//Create new object of progress bar type
                progressBar.setCancelable(false);//Progress bar cannot be cancelled by pressing any wher on screen
                progressBar.setMessage("Getting Questions Ready ...");//Title shown in the progress bar
                progressBar.setProgressStyle(ProgressDialog.STYLE_SPINNER);//Style of the progress bar
                progressBar.setProgress(0);//attributes
                progressBar.setMax(100);//attributes
                progressBar.show();//show the progress bar
                //This handler will add a delay of 3 seconds
                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        //Intent start to open the navigation drawer activity
                        progressBar.cancel();//Progress bar will be cancelled (hide from screen) when this run function will execute after 3.5seconds
                        Intent intent = new Intent(NavigationActivity.this, QuestionsActivity.class);
                        intent.putExtra(Message, "aI");
                        startActivity(intent);
                    }
                }, 2000);
            }
        });


        c4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //To show button click
                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                    }
                }, 400);

                progressBar = new ProgressDialog(v.getContext());//Create new object of progress bar type
                progressBar.setCancelable(false);//Progress bar cannot be cancelled by pressing any wher on screen
                progressBar.setMessage("Getting Questions Ready ...");//Title shown in the progress bar
                progressBar.setProgressStyle(ProgressDialog.STYLE_SPINNER);//Style of the progress bar
                progressBar.setProgress(0);//attributes
                progressBar.setMax(100);//attributes
                progressBar.show();//show the progress bar
                //This handler will add a delay of 3 seconds
                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        //Intent start to open the navigation drawer activity
                        progressBar.cancel();//Progress bar will be cancelled (hide from screen) when this run function will execute after 3.5seconds
                        Intent intent = new Intent(NavigationActivity.this, QuestionsActivity.class);
                        intent.putExtra(Message, "c4");
                        startActivity(intent);
                    }
                }, 2000);
            }
        });


        c5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //To show button click
                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                    }
                }, 400);

                progressBar = new ProgressDialog(v.getContext());//Create new object of progress bar type
                progressBar.setCancelable(false);//Progress bar cannot be cancelled by pressing any wher on screen
                progressBar.setMessage("Getting Questions Ready ...");//Title shown in the progress bar
                progressBar.setProgressStyle(ProgressDialog.STYLE_SPINNER);//Style of the progress bar
                progressBar.setProgress(0);//attributes
                progressBar.setMax(100);//attributes
                progressBar.show();//show the progress bar
                //This handler will add a delay of 3 seconds
                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        //Intent start to open the navigation drawer activity
                        progressBar.cancel();//Progress bar will be cancelled (hide from screen) when this run function will execute after 3.5seconds
                        Intent intent = new Intent(NavigationActivity.this, QuestionsActivity.class);
                        intent.putExtra(Message, "c5");
                        startActivity(intent);
                    }
                }, 2000);
            }
        });


        c6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //To show button click
                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                    }
                }, 400);

                progressBar = new ProgressDialog(v.getContext());//Create new object of progress bar type
                progressBar.setCancelable(false);//Progress bar cannot be cancelled by pressing any wher on screen
                progressBar.setMessage("Getting Questions Ready ...");//Title shown in the progress bar
                progressBar.setProgressStyle(ProgressDialog.STYLE_SPINNER);//Style of the progress bar
                progressBar.setProgress(0);//attributes
                progressBar.setMax(100);//attributes
                progressBar.show();//show the progress bar
                //This handler will add a delay of 3 seconds
                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        //Intent start to open the navigation drawer activity
                        progressBar.cancel();//Progress bar will be cancelled (hide from screen) when this run function will execute after 3.5seconds
                        Intent intent = new Intent(NavigationActivity.this, QuestionsActivity.class);
                        intent.putExtra(Message, "c6");
                        startActivity(intent);
                    }
                }, 2000);
            }
        });


        c7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //To show button click
                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                    }
                }, 400);

                progressBar = new ProgressDialog(v.getContext());//Create new object of progress bar type
                progressBar.setCancelable(false);//Progress bar cannot be cancelled by pressing any wher on screen
                progressBar.setMessage("Getting Questions Ready ...");//Title shown in the progress bar
                progressBar.setProgressStyle(ProgressDialog.STYLE_SPINNER);//Style of the progress bar
                progressBar.setProgress(0);//attributes
                progressBar.setMax(100);//attributes
                progressBar.show();//show the progress bar
                //This handler will add a delay of 3 seconds
                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        //Intent start to open the navigation drawer activity
                        progressBar.cancel();//Progress bar will be cancelled (hide from screen) when this run function will execute after 3.5seconds
                        Intent intent = new Intent(NavigationActivity.this, QuestionsActivity.class);
                        intent.putExtra(Message, "c7");
                        startActivity(intent);
                    }
                }, 2000);
            }
        });


        c8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //To show button click
                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                    }
                }, 400);

                progressBar = new ProgressDialog(v.getContext());//Create new object of progress bar type
                progressBar.setCancelable(false);//Progress bar cannot be cancelled by pressing any wher on screen
                progressBar.setMessage("Getting Questions Ready ...");//Title shown in the progress bar
                progressBar.setProgressStyle(ProgressDialog.STYLE_SPINNER);//Style of the progress bar
                progressBar.setProgress(0);//attributes
                progressBar.setMax(100);//attributes
                progressBar.show();//show the progress bar
                //This handler will add a delay of 3 seconds
                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        //Intent start to open the navigation drawer activity
                        progressBar.cancel();//Progress bar will be cancelled (hide from screen) when this run function will execute after 3.5seconds
                        Intent intent = new Intent(NavigationActivity.this, QuestionsActivity.class);
                        intent.putExtra(Message, "c8");
                        startActivity(intent);
                    }
                }, 2000);
            }
        });


        c9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //To show button click
                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                    }
                }, 400);

                progressBar = new ProgressDialog(v.getContext());//Create new object of progress bar type
                progressBar.setCancelable(false);//Progress bar cannot be cancelled by pressing any wher on screen
                progressBar.setMessage("Getting Questions Ready ...");//Title shown in the progress bar
                progressBar.setProgressStyle(ProgressDialog.STYLE_SPINNER);//Style of the progress bar
                progressBar.setProgress(0);//attributes
                progressBar.setMax(100);//attributes
                progressBar.show();//show the progress bar
                //This handler will add a delay of 3 seconds
                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        //Intent start to open the navigation drawer activity
                        progressBar.cancel();//Progress bar will be cancelled (hide from screen) when this run function will execute after 3.5seconds
                        Intent intent = new Intent(NavigationActivity.this, QuestionsActivity.class);
                        intent.putExtra(Message, "c9");
                        startActivity(intent);
                    }
                }, 2000);
            }
        });


        c10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //To show button click
                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                    }
                }, 400);

                progressBar = new ProgressDialog(v.getContext());//Create new object of progress bar type
                progressBar.setCancelable(false);//Progress bar cannot be cancelled by pressing any wher on screen
                progressBar.setMessage("Getting Questions Ready ...");//Title shown in the progress bar
                progressBar.setProgressStyle(ProgressDialog.STYLE_SPINNER);//Style of the progress bar
                progressBar.setProgress(0);//attributes
                progressBar.setMax(100);//attributes
                progressBar.show();//show the progress bar
                //This handler will add a delay of 3 seconds
                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        //Intent start to open the navigation drawer activity
                        progressBar.cancel();//Progress bar will be cancelled (hide from screen) when this run function will execute after 3.5seconds
                        Intent intent = new Intent(NavigationActivity.this, QuestionsActivity.class);
                        intent.putExtra(Message, "c10");
                        startActivity(intent);
                    }
                }, 2000);
            }
        });

    }

    private void setOsDataOnline() {
        ApiService.getServiceClass().getAllOSQuestions().enqueue(new Callback<List<QuestionModel>>() {
            @Override
            public void onResponse(Call<List<QuestionModel>> call, Response<List<QuestionModel>> response) {
                if (response.isSuccessful()) {
                    setOsQuestionsTable(response);
                }
            }

            @Override
            public void onFailure(Call<List<QuestionModel>> call, Throwable t) {
                Log.d("", "Error msg is :::" + t.getMessage());
            }
        });
    }

    private void setOsQuestionsTable(Response<List<QuestionModel>> response) {
        osDataSource.open();
        QuestionModel question = new QuestionModel();
        for (int i = 0; i < response.body().size(); i++) {
            String id = response.body().get(i).getId();
            question.setId(id);
            question.setAnswer(response.body().get(i).getAnswer());
            question.setOptionA(response.body().get(i).getOptionA());
            question.setOptionB(response.body().get(i).getOptionB());
            question.setOptionC(response.body().get(i).getOptionC());
            question.setOptionD(response.body().get(i).getOptionD());
            question.setQuestion(response.body().get(i).getQuestion());
            osDataSource.insertOrUpdateGkQuestion(question);
        }
        osDataSource.close();
    }

    private void setJavaDataOnline() {
        ApiService.getServiceClass().getAllJavaQuestions().enqueue(new Callback<List<QuestionModel>>() {
            @Override
            public void onResponse(Call<List<QuestionModel>> call, Response<List<QuestionModel>> response) {
                if (response.isSuccessful()) {
                    setJavaQuestionsTable(response);
                }
            }

            @Override
            public void onFailure(Call<List<QuestionModel>> call, Throwable t) {
                Log.d("", "Error msg is :::" + t.getMessage());
            }
        });
    }

    private void setJavaQuestionsTable(Response<List<QuestionModel>> response) {
        javaDataSource.open();
        QuestionModel question = new QuestionModel();
        for (int i = 0; i < response.body().size(); i++) {
            String id = response.body().get(i).getId();
            question.setId(id);
            question.setAnswer(response.body().get(i).getAnswer());
            question.setOptionA(response.body().get(i).getOptionA());
            question.setOptionB(response.body().get(i).getOptionB());
            question.setOptionC(response.body().get(i).getOptionC());
            question.setOptionD(response.body().get(i).getOptionD());
            question.setQuestion(response.body().get(i).getQuestion());
            javaDataSource.insertOrUpdateGkQuestion(question);
        }
        javaDataSource.close();
    }

    private void setAIDataOnline() {
        ApiService.getServiceClass().getAllAIQuestions().enqueue(new Callback<List<QuestionModel>>() {
            @Override
            public void onResponse(Call<List<QuestionModel>> call, Response<List<QuestionModel>> response) {
                if (response.isSuccessful()) {
                    setAIQuestionsTable(response);
                }
            }

            @Override
            public void onFailure(Call<List<QuestionModel>> call, Throwable t) {
                Log.d("", "Error msg is :::" + t.getMessage());
            }
        });

    }

    private void setAIQuestionsTable(Response<List<QuestionModel>> response) {
        aiDataSource.open();
        QuestionModel question = new QuestionModel();
        for (int i = 0; i < response.body().size(); i++) {
            String id = response.body().get(i).getId();
            question.setId(id);
            question.setAnswer(response.body().get(i).getAnswer());
            question.setOptionA(response.body().get(i).getOptionA());
            question.setOptionB(response.body().get(i).getOptionB());
            question.setOptionC(response.body().get(i).getOptionC());
            question.setOptionD(response.body().get(i).getOptionD());
            question.setQuestion(response.body().get(i).getQuestion());
            aiDataSource.insertOrUpdateGkQuestion(question);
        }
        aiDataSource.close();
    }

    private void setBElecticalDataOnline() {
        ApiService.getServiceClass().getAllBasicElectricalQuestions().enqueue(new Callback<List<QuestionModel>>() {
            @Override
            public void onResponse(Call<List<QuestionModel>> call, Response<List<QuestionModel>> response) {
                if (response.isSuccessful()) {
                    setBElectricalQuestionsTable(response);
                }
            }

            @Override
            public void onFailure(Call<List<QuestionModel>> call, Throwable t) {
                Log.d("", "Error msg is :::" + t.getMessage());
            }
        });
    }

    private void setBElectricalQuestionsTable(Response<List<QuestionModel>> response) {
        bElectricalDataSource.open();
        QuestionModel question = new QuestionModel();
        for (int i = 0; i < response.body().size(); i++) {
            String id = response.body().get(i).getId();
            question.setId(id);
            question.setAnswer(response.body().get(i).getAnswer());
            question.setOptionA(response.body().get(i).getOptionA());
            question.setOptionB(response.body().get(i).getOptionB());
            question.setOptionC(response.body().get(i).getOptionC());
            question.setOptionD(response.body().get(i).getOptionD());
            question.setQuestion(response.body().get(i).getQuestion());
            bElectricalDataSource.insertOrUpdateGkQuestion(question);
        }
        bElectricalDataSource.close();
    }

    private void setCgDataOnline() {
        ApiService.getServiceClass().getAllCGQuestions().enqueue(new Callback<List<QuestionModel>>() {
            @Override
            public void onResponse(Call<List<QuestionModel>> call, Response<List<QuestionModel>> response) {
                if (response.isSuccessful()) {
                    setCgQuestionsTable(response);
                }
            }

            @Override
            public void onFailure(Call<List<QuestionModel>> call, Throwable t) {
                Log.d("", "Error msg is :::" + t.getMessage());
            }
        });
    }

    private void setCgQuestionsTable(Response<List<QuestionModel>> response) {
        cgDataSource.open();
        QuestionModel question = new QuestionModel();
        for (int i = 0; i < response.body().size(); i++) {
            String id = response.body().get(i).getId();
            question.setId(id);
            question.setAnswer(response.body().get(i).getAnswer());
            question.setOptionA(response.body().get(i).getOptionA());
            question.setOptionB(response.body().get(i).getOptionB());
            question.setOptionC(response.body().get(i).getOptionC());
            question.setOptionD(response.body().get(i).getOptionD());
            question.setQuestion(response.body().get(i).getQuestion());
            cgDataSource.insertOrUpdateGkQuestion(question);
        }
        cgDataSource.close();
    }

    private void setCNDataOnline() {
        ApiService.getServiceClass().getAllCNQuestions().enqueue(new Callback<List<QuestionModel>>() {
            @Override
            public void onResponse(Call<List<QuestionModel>> call, Response<List<QuestionModel>> response) {
                if (response.isSuccessful()) {
                    setCNQuestionsTable(response);
                }
            }

            @Override
            public void onFailure(Call<List<QuestionModel>> call, Throwable t) {
                Log.d("", "Error msg is :::" + t.getMessage());
            }
        });
    }

    private void setCNQuestionsTable(Response<List<QuestionModel>> response) {
        cnDataSource.open();
        QuestionModel question = new QuestionModel();
        for (int i = 0; i < response.body().size(); i++) {
            String id = response.body().get(i).getId();
            question.setId(id);
            question.setAnswer(response.body().get(i).getAnswer());
            question.setOptionA(response.body().get(i).getOptionA());
            question.setOptionB(response.body().get(i).getOptionB());
            question.setOptionC(response.body().get(i).getOptionC());
            question.setOptionD(response.body().get(i).getOptionD());
            question.setQuestion(response.body().get(i).getQuestion());
            cnDataSource.insertOrUpdateGkQuestion(question);
        }
        cnDataSource.close();
    }


    private void setCProgrammingDataOnline() {
        ApiService.getServiceClass().getAllCProgrammingQuestions().enqueue(new Callback<List<QuestionModel>>() {
            @Override
            public void onResponse(Call<List<QuestionModel>> call, Response<List<QuestionModel>> response) {
                if (response.isSuccessful()) {
                    setCProgrammingQuestionsTable(response);
                }
            }

            @Override
            public void onFailure(Call<List<QuestionModel>> call, Throwable t) {
                Log.d("", "Error msg is :::" + t.getMessage());
            }
        });
    }

    private void setCProgrammingQuestionsTable(Response<List<QuestionModel>> response) {
        cProgrammingDataSource.open();
        QuestionModel question = new QuestionModel();
        for (int i = 0; i < response.body().size(); i++) {
            String id = response.body().get(i).getId();
            question.setId(id);
            question.setAnswer(response.body().get(i).getAnswer());
            question.setOptionA(response.body().get(i).getOptionA());
            question.setOptionB(response.body().get(i).getOptionB());
            question.setOptionC(response.body().get(i).getOptionC());
            question.setOptionD(response.body().get(i).getOptionD());
            question.setQuestion(response.body().get(i).getQuestion());
            cProgrammingDataSource.insertOrUpdateGkQuestion(question);
        }
        cProgrammingDataSource.close();
    }

    private void setCSharpDataOnline() {
        ApiService.getServiceClass().getAllCSharpQuestions().enqueue(new Callback<List<QuestionModel>>() {
            @Override
            public void onResponse(Call<List<QuestionModel>> call, Response<List<QuestionModel>> response) {
                if (response.isSuccessful()) {
                    setCSharpQuestionsTable(response);
                }
            }

            @Override
            public void onFailure(Call<List<QuestionModel>> call, Throwable t) {
                Log.d("", "Error msg is :::" + t.getMessage());
            }
        });
    }

    private void setCSharpQuestionsTable(Response<List<QuestionModel>> response) {
        cSharpDataSource.open();
        QuestionModel question = new QuestionModel();
        for (int i = 0; i < response.body().size(); i++) {
            String id = response.body().get(i).getId();
            question.setId(id);
            question.setAnswer(response.body().get(i).getAnswer());
            question.setOptionA(response.body().get(i).getOptionA());
            question.setOptionB(response.body().get(i).getOptionB());
            question.setOptionC(response.body().get(i).getOptionC());
            question.setOptionD(response.body().get(i).getOptionD());
            question.setQuestion(response.body().get(i).getQuestion());
            cSharpDataSource.insertOrUpdateGkQuestion(question);
        }
        cSharpDataSource.close();
    }

    private void setDataComDataOnline() {
        ApiService.getServiceClass().getAllDataComQuestions().enqueue(new Callback<List<QuestionModel>>() {
            @Override
            public void onResponse(Call<List<QuestionModel>> call, Response<List<QuestionModel>> response) {
                if (response.isSuccessful()) {
                    setDataComQuestionsTable(response);
                }
            }

            @Override
            public void onFailure(Call<List<QuestionModel>> call, Throwable t) {
                Log.d("", "Error msg is :::" + t.getMessage());
            }
        });
    }

    private void setDataComQuestionsTable(Response<List<QuestionModel>> response) {
        dataComDataSource.open();
        QuestionModel question = new QuestionModel();
        for (int i = 0; i < response.body().size(); i++) {
            String id = response.body().get(i).getId();
            question.setId(id);
            question.setAnswer(response.body().get(i).getAnswer());
            question.setOptionA(response.body().get(i).getOptionA());
            question.setOptionB(response.body().get(i).getOptionB());
            question.setOptionC(response.body().get(i).getOptionC());
            question.setOptionD(response.body().get(i).getOptionD());
            question.setQuestion(response.body().get(i).getQuestion());
            dataComDataSource.insertOrUpdateGkQuestion(question);
        }
        dataComDataSource.close();
    }

    private void setDMSDataOnline() {
        ApiService.getServiceClass().getAllDMSQuestions().enqueue(new Callback<List<QuestionModel>>() {
            @Override
            public void onResponse(Call<List<QuestionModel>> call, Response<List<QuestionModel>> response) {
                if (response.isSuccessful()) {
                    setDMSQuestionsTable(response);
                }
            }

            @Override
            public void onFailure(Call<List<QuestionModel>> call, Throwable t) {
                Log.d("", "Error msg is :::" + t.getMessage());
            }
        });
    }

    private void setDMSQuestionsTable(Response<List<QuestionModel>> response) {
        dmsDataSource.open();
        QuestionModel question = new QuestionModel();
        for (int i = 0; i < response.body().size(); i++) {
            String id = response.body().get(i).getId();
            question.setId(id);
            question.setAnswer(response.body().get(i).getAnswer());
            question.setOptionA(response.body().get(i).getOptionA());
            question.setOptionB(response.body().get(i).getOptionB());
            question.setOptionC(response.body().get(i).getOptionC());
            question.setOptionD(response.body().get(i).getOptionD());
            question.setQuestion(response.body().get(i).getQuestion());
            dmsDataSource.insertOrUpdateGkQuestion(question);
        }
        dmsDataSource.close();
    }

    private void setDSADataOnline() {
        ApiService.getServiceClass().getAllDSAQuestions().enqueue(new Callback<List<QuestionModel>>() {
            @Override
            public void onResponse(Call<List<QuestionModel>> call, Response<List<QuestionModel>> response) {
                if (response.isSuccessful()) {
                    setDSAQuestionsTable(response);
                }
            }

            @Override
            public void onFailure(Call<List<QuestionModel>> call, Throwable t) {
                Log.d("", "Error msg is :::" + t.getMessage());
            }
        });
    }

    private void setDSAQuestionsTable(Response<List<QuestionModel>> response) {
        dsaDataSource.open();
        QuestionModel question = new QuestionModel();
        for (int i = 0; i < response.body().size(); i++) {
            String id = response.body().get(i).getId();
            question.setId(id);
            question.setAnswer(response.body().get(i).getAnswer());
            question.setOptionA(response.body().get(i).getOptionA());
            question.setOptionB(response.body().get(i).getOptionB());
            question.setOptionC(response.body().get(i).getOptionC());
            question.setOptionD(response.body().get(i).getOptionD());
            question.setQuestion(response.body().get(i).getQuestion());
            dsaDataSource.insertOrUpdateGkQuestion(question);
        }
        dsaDataSource.close();
    }

    private void setEDCDataOnline() {
        ApiService.getServiceClass().getAllEDCQuestions().enqueue(new Callback<List<QuestionModel>>() {
            @Override
            public void onResponse(Call<List<QuestionModel>> call, Response<List<QuestionModel>> response) {
                if (response.isSuccessful()) {
                    setEDCQuestionsTable(response);
                }
            }

            @Override
            public void onFailure(Call<List<QuestionModel>> call, Throwable t) {
                Log.d("", "Error msg is :::" + t.getMessage());
            }
        });
    }

    private void setEDCQuestionsTable(Response<List<QuestionModel>> response) {
        edcDataSource.open();
        QuestionModel question = new QuestionModel();
        for (int i = 0; i < response.body().size(); i++) {
            String id = response.body().get(i).getId();
            question.setId(id);
            question.setAnswer(response.body().get(i).getAnswer());
            question.setOptionA(response.body().get(i).getOptionA());
            question.setOptionB(response.body().get(i).getOptionB());
            question.setOptionC(response.body().get(i).getOptionC());
            question.setOptionD(response.body().get(i).getOptionD());
            question.setQuestion(response.body().get(i).getQuestion());
            edcDataSource.insertOrUpdateGkQuestion(question);
        }
        edcDataSource.close();
    }

    private void setEmbeddedDataOnline() {
        ApiService.getServiceClass().getAllEmbeddedQuestions().enqueue(new Callback<List<QuestionModel>>() {
            @Override
            public void onResponse(Call<List<QuestionModel>> call, Response<List<QuestionModel>> response) {
                if (response.isSuccessful()) {
                    setEmbeddedQuestionsTable(response);
                }
            }

            @Override
            public void onFailure(Call<List<QuestionModel>> call, Throwable t) {
                Log.d("", "Error msg is :::" + t.getMessage());
            }
        });
    }

    private void setEmbeddedQuestionsTable(Response<List<QuestionModel>> response) {
        embeddedDataSource.open();
        QuestionModel question = new QuestionModel();
        for (int i = 0; i < response.body().size(); i++) {
            String id = response.body().get(i).getId();
            question.setId(id);
            question.setAnswer(response.body().get(i).getAnswer());
            question.setOptionA(response.body().get(i).getOptionA());
            question.setOptionB(response.body().get(i).getOptionB());
            question.setOptionC(response.body().get(i).getOptionC());
            question.setOptionD(response.body().get(i).getOptionD());
            question.setQuestion(response.body().get(i).getQuestion());
            embeddedDataSource.insertOrUpdateGkQuestion(question);
        }
        embeddedDataSource.close();
    }

    private void setLogicCircuitDataOnline() {
        ApiService.getServiceClass().getAllLogicCircuitQuestions().enqueue(new Callback<List<QuestionModel>>() {
            @Override
            public void onResponse(Call<List<QuestionModel>> call, Response<List<QuestionModel>> response) {
                if (response.isSuccessful()) {
                    setLogicCircuitQuestionsTable(response);
                }
            }

            @Override
            public void onFailure(Call<List<QuestionModel>> call, Throwable t) {
                Log.d("", "Error msg is :::" + t.getMessage());
            }
        });
    }

    private void setLogicCircuitQuestionsTable(Response<List<QuestionModel>> response) {
        logicCircuitDataSource.open();
        QuestionModel question = new QuestionModel();
        for (int i = 0; i < response.body().size(); i++) {
            String id = response.body().get(i).getId();
            question.setId(id);
            question.setAnswer(response.body().get(i).getAnswer());
            question.setOptionA(response.body().get(i).getOptionA());
            question.setOptionB(response.body().get(i).getOptionB());
            question.setOptionC(response.body().get(i).getOptionC());
            question.setOptionD(response.body().get(i).getOptionD());
            question.setQuestion(response.body().get(i).getQuestion());
            logicCircuitDataSource.insertOrUpdateGkQuestion(question);
        }
        logicCircuitDataSource.close();
    }

    private void setMathematicsDataOnline() {
        ApiService.getServiceClass().getAllMathematicsQuestions().enqueue(new Callback<List<QuestionModel>>() {
            @Override
            public void onResponse(Call<List<QuestionModel>> call, Response<List<QuestionModel>> response) {
                if (response.isSuccessful()) {
                    setMathematicsQuestionsTable(response);
                }
            }

            @Override
            public void onFailure(Call<List<QuestionModel>> call, Throwable t) {
                Log.d("", "Error msg is :::" + t.getMessage());
            }
        });
    }

    private void setMathematicsQuestionsTable(Response<List<QuestionModel>> response) {
        mathematicsDataSource.open();
        QuestionModel question = new QuestionModel();
        for (int i = 0; i < response.body().size(); i++) {
            String id = response.body().get(i).getId();
            question.setId(id);
            question.setAnswer(response.body().get(i).getAnswer());
            question.setOptionA(response.body().get(i).getOptionA());
            question.setOptionB(response.body().get(i).getOptionB());
            question.setOptionC(response.body().get(i).getOptionC());
            question.setOptionD(response.body().get(i).getOptionD());
            question.setQuestion(response.body().get(i).getQuestion());
            mathematicsDataSource.insertOrUpdateGkQuestion(question);
        }
        mathematicsDataSource.close();
    }

    private void setMicroprocessorDataOnline() {
        ApiService.getServiceClass().getAllMicroprocessorQuestions().enqueue(new Callback<List<QuestionModel>>() {
            @Override
            public void onResponse(Call<List<QuestionModel>> call, Response<List<QuestionModel>> response) {
                if (response.isSuccessful()) {
                    setMicroprocessorQuestionsTable(response);
                }
            }

            @Override
            public void onFailure(Call<List<QuestionModel>> call, Throwable t) {
                Log.d("", "Error msg is :::" + t.getMessage());
            }
        });
    }

    private void setMicroprocessorQuestionsTable(Response<List<QuestionModel>> response) {
        microprocessorDataSource.open();
        QuestionModel question = new QuestionModel();
        for (int i = 0; i < response.body().size(); i++) {
            String id = response.body().get(i).getId();
            question.setId(id);
            question.setAnswer(response.body().get(i).getAnswer());
            question.setOptionA(response.body().get(i).getOptionA());
            question.setOptionB(response.body().get(i).getOptionB());
            question.setOptionC(response.body().get(i).getOptionC());
            question.setOptionD(response.body().get(i).getOptionD());
            question.setQuestion(response.body().get(i).getQuestion());
            microprocessorDataSource.insertOrUpdateGkQuestion(question);
        }
        microprocessorDataSource.close();
    }

    private void setNMDataOnline() {
        ApiService.getServiceClass().getAllNMQuestions().enqueue(new Callback<List<QuestionModel>>() {
            @Override
            public void onResponse(Call<List<QuestionModel>> call, Response<List<QuestionModel>> response) {
                if (response.isSuccessful()) {
                    setNMQuestionsTable(response);
                }
            }

            @Override
            public void onFailure(Call<List<QuestionModel>> call, Throwable t) {
                Log.d("", "Error msg is :::" + t.getMessage());
            }
        });
    }

    private void setNMQuestionsTable(Response<List<QuestionModel>> response) {
        nmDataSource.open();
        QuestionModel question = new QuestionModel();
        for (int i = 0; i < response.body().size(); i++) {
            String id = response.body().get(i).getId();
            question.setId(id);
            question.setAnswer(response.body().get(i).getAnswer());
            question.setOptionA(response.body().get(i).getOptionA());
            question.setOptionB(response.body().get(i).getOptionB());
            question.setOptionC(response.body().get(i).getOptionC());
            question.setOptionD(response.body().get(i).getOptionD());
            question.setQuestion(response.body().get(i).getQuestion());
            nmDataSource.insertOrUpdateGkQuestion(question);
        }
        nmDataSource.close();
    }

    private void setOOPInCPPDataOnline() {
        ApiService.getServiceClass().getAllOOPInCPPQuestions().enqueue(new Callback<List<QuestionModel>>() {
            @Override
            public void onResponse(Call<List<QuestionModel>> call, Response<List<QuestionModel>> response) {
                if (response.isSuccessful()) {
                    setOOPInCPPQuestionsTable(response);
                }
            }

            @Override
            public void onFailure(Call<List<QuestionModel>> call, Throwable t) {
                Log.d("", "Error msg is :::" + t.getMessage());
            }
        });
    }

    private void setOOPInCPPQuestionsTable(Response<List<QuestionModel>> response) {
        oopInCPPDataSource.open();
        QuestionModel question = new QuestionModel();
        for (int i = 0; i < response.body().size(); i++) {
            String id = response.body().get(i).getId();
            question.setId(id);
            question.setAnswer(response.body().get(i).getAnswer());
            question.setOptionA(response.body().get(i).getOptionA());
            question.setOptionB(response.body().get(i).getOptionB());
            question.setOptionC(response.body().get(i).getOptionC());
            question.setOptionD(response.body().get(i).getOptionD());
            question.setQuestion(response.body().get(i).getQuestion());
            oopInCPPDataSource.insertOrUpdateGkQuestion(question);
        }
        oopInCPPDataSource.close();
    }

    private void setOOSEDataOnline() {
        ApiService.getServiceClass().getAllOOSEQuestions().enqueue(new Callback<List<QuestionModel>>() {
            @Override
            public void onResponse(Call<List<QuestionModel>> call, Response<List<QuestionModel>> response) {
                if (response.isSuccessful()) {
                    setOOSEQuestionsTable(response);
                }
            }

            @Override
            public void onFailure(Call<List<QuestionModel>> call, Throwable t) {
                Log.d("", "Error msg is :::" + t.getMessage());
            }
        });
    }

    private void setOOSEQuestionsTable(Response<List<QuestionModel>> response) {
        ooseDataSource.open();
        QuestionModel question = new QuestionModel();
        for (int i = 0; i < response.body().size(); i++) {
            String id = response.body().get(i).getId();
            question.setId(id);
            question.setAnswer(response.body().get(i).getAnswer());
            question.setOptionA(response.body().get(i).getOptionA());
            question.setOptionB(response.body().get(i).getOptionB());
            question.setOptionC(response.body().get(i).getOptionC());
            question.setOptionD(response.body().get(i).getOptionD());
            question.setQuestion(response.body().get(i).getQuestion());
            ooseDataSource.insertOrUpdateGkQuestion(question);
        }
        ooseDataSource.close();
    }

    private void setSMDataOnline() {
        ApiService.getServiceClass().getAllSMQuestions().enqueue(new Callback<List<QuestionModel>>() {
            @Override
            public void onResponse(Call<List<QuestionModel>> call, Response<List<QuestionModel>> response) {
                if (response.isSuccessful()) {
                    setSMQuestionsTable(response);
                }
            }

            @Override
            public void onFailure(Call<List<QuestionModel>> call, Throwable t) {
                Log.d("", "Error msg is :::" + t.getMessage());
            }
        });
    }

    private void setSMQuestionsTable(Response<List<QuestionModel>> response) {
        smDataSource.open();
        QuestionModel question = new QuestionModel();
        for (int i = 0; i < response.body().size(); i++) {
            String id = response.body().get(i).getId();
            question.setId(id);
            question.setAnswer(response.body().get(i).getAnswer());
            question.setOptionA(response.body().get(i).getOptionA());
            question.setOptionB(response.body().get(i).getOptionB());
            question.setOptionC(response.body().get(i).getOptionC());
            question.setOptionD(response.body().get(i).getOptionD());
            question.setQuestion(response.body().get(i).getQuestion());
            smDataSource.insertOrUpdateGkQuestion(question);
        }
        smDataSource.close();
    }

    private void setSPITDataOnline() {
        ApiService.getServiceClass().getAllSPITQuestions().enqueue(new Callback<List<QuestionModel>>() {
            @Override
            public void onResponse(Call<List<QuestionModel>> call, Response<List<QuestionModel>> response) {
                if (response.isSuccessful()) {
                    setSPITQuestionsTable(response);
                }
            }

            @Override
            public void onFailure(Call<List<QuestionModel>> call, Throwable t) {
                Log.d("", "Error msg is :::" + t.getMessage());
            }
        });
    }

    private void setSPITQuestionsTable(Response<List<QuestionModel>> response) {
        spitDataSource.open();
        QuestionModel question = new QuestionModel();
        for (int i = 0; i < response.body().size(); i++) {
            String id = response.body().get(i).getId();
            question.setId(id);
            question.setAnswer(response.body().get(i).getAnswer());
            question.setOptionA(response.body().get(i).getOptionA());
            question.setOptionB(response.body().get(i).getOptionB());
            question.setOptionC(response.body().get(i).getOptionC());
            question.setOptionD(response.body().get(i).getOptionD());
            question.setQuestion(response.body().get(i).getQuestion());
            spitDataSource.insertOrUpdateGkQuestion(question);
        }
        spitDataSource.close();
    }

    private void setTOCDataOnline() {
        ApiService.getServiceClass().getAllTOCQuestions().enqueue(new Callback<List<QuestionModel>>() {
            @Override
            public void onResponse(Call<List<QuestionModel>> call, Response<List<QuestionModel>> response) {
                if (response.isSuccessful()) {
                    setTOCQuestionsTable(response);
                }
            }

            @Override
            public void onFailure(Call<List<QuestionModel>> call, Throwable t) {
                Log.d("", "Error msg is :::" + t.getMessage());
            }
        });
    }

    private void setTOCQuestionsTable(Response<List<QuestionModel>> response) {
        tocDataSource.open();
        QuestionModel question = new QuestionModel();
        for (int i = 0; i < response.body().size(); i++) {
            String id = response.body().get(i).getId();
            question.setId(id);
            question.setAnswer(response.body().get(i).getAnswer());
            question.setOptionA(response.body().get(i).getOptionA());
            question.setOptionB(response.body().get(i).getOptionB());
            question.setOptionC(response.body().get(i).getOptionC());
            question.setOptionD(response.body().get(i).getOptionD());
            question.setQuestion(response.body().get(i).getQuestion());
            tocDataSource.insertOrUpdateGkQuestion(question);
        }
        tocDataSource.close();
    }

    private void setISDataOnline() {
        ApiService.getServiceClass().getAllISQuestions().enqueue(new Callback<List<QuestionModel>>() {
            @Override
            public void onResponse(Call<List<QuestionModel>> call, Response<List<QuestionModel>> response) {
                if (response.isSuccessful()) {
                    setISQuestionsTable(response);
                }
            }

            @Override
            public void onFailure(Call<List<QuestionModel>> call, Throwable t) {
                Log.d("", "Error msg is :::" + t.getMessage());
            }
        });
    }

    private void setISQuestionsTable(Response<List<QuestionModel>> response) {
        isDataSource.open();
        QuestionModel question = new QuestionModel();
        for (int i = 0; i < response.body().size(); i++) {
            String id = response.body().get(i).getId();
            question.setId(id);
            question.setAnswer(response.body().get(i).getAnswer());
            question.setOptionA(response.body().get(i).getOptionA());
            question.setOptionB(response.body().get(i).getOptionB());
            question.setOptionC(response.body().get(i).getOptionC());
            question.setOptionD(response.body().get(i).getOptionD());
            question.setQuestion(response.body().get(i).getQuestion());
            isDataSource.insertOrUpdateGkQuestion(question);
        }
        isDataSource.close();
    }


    private void setNTCDataOnline() {
        ApiService.getServiceClass().getAllNTCQuestions().enqueue(new Callback<List<QuestionModel>>() {
            @Override
            public void onResponse(Call<List<QuestionModel>> call, Response<List<QuestionModel>> response) {
                if (response.isSuccessful()) {
                    setNTCQuestionsTable(response);
                }
            }

            @Override
            public void onFailure(Call<List<QuestionModel>> call, Throwable t) {
                Log.d("", "Error msg is :::" + t.getMessage());
            }
        });
    }

    private void setNTCQuestionsTable(Response<List<QuestionModel>> response) {
        ntcDataSource.open();
        QuestionModel question = new QuestionModel();
        for (int i = 0; i < response.body().size(); i++) {
            String id = response.body().get(i).getId();
            question.setId(id);
            question.setAnswer(response.body().get(i).getAnswer());
            question.setOptionA(response.body().get(i).getOptionA());
            question.setOptionB(response.body().get(i).getOptionB());
            question.setOptionC(response.body().get(i).getOptionC());
            question.setOptionD(response.body().get(i).getOptionD());
            question.setQuestion(response.body().get(i).getQuestion());
            ntcDataSource.insertOrUpdateGkQuestion(question);
        }
        ntcDataSource.close();
    }

    private void setNEADataOnline() {
        ApiService.getServiceClass().getAllNEAQuestions().enqueue(new Callback<List<QuestionModel>>() {
            @Override
            public void onResponse(Call<List<QuestionModel>> call, Response<List<QuestionModel>> response) {
                if (response.isSuccessful()) {
                    setNEAQuestionsTable(response);
                }
            }

            @Override
            public void onFailure(Call<List<QuestionModel>> call, Throwable t) {
                Log.d("", "Error msg is :::" + t.getMessage());
            }
        });
    }

    private void setNEAQuestionsTable(Response<List<QuestionModel>> response) {
        neaDataSource.open();
        QuestionModel question = new QuestionModel();
        for (int i = 0; i < response.body().size(); i++) {
            String id = response.body().get(i).getId();
            question.setId(id);
            question.setAnswer(response.body().get(i).getAnswer());
            question.setOptionA(response.body().get(i).getOptionA());
            question.setOptionB(response.body().get(i).getOptionB());
            question.setOptionC(response.body().get(i).getOptionC());
            question.setOptionD(response.body().get(i).getOptionD());
            question.setQuestion(response.body().get(i).getQuestion());
            neaDataSource.insertOrUpdateGkQuestion(question);
        }
        neaDataSource.close();
    }

    private void setLokSewaDataOnline() {
        ApiService.getServiceClass().getAllLokSewaQuestions().enqueue(new Callback<List<QuestionModel>>() {
            @Override
            public void onResponse(Call<List<QuestionModel>> call, Response<List<QuestionModel>> response) {
                if (response.isSuccessful()) {
                    setLokSewaQuestionsTable(response);
                }
            }

            @Override
            public void onFailure(Call<List<QuestionModel>> call, Throwable t) {
                Log.d("", "Error msg is :::" + t.getMessage());
            }
        });
    }

    private void setLokSewaQuestionsTable(Response<List<QuestionModel>> response) {
        lokSewaDataSource.open();
        QuestionModel question = new QuestionModel();
        for (int i = 0; i < response.body().size(); i++) {
            String id = response.body().get(i).getId();
            question.setId(id);
            question.setAnswer(response.body().get(i).getAnswer());
            question.setOptionA(response.body().get(i).getOptionA());
            question.setOptionB(response.body().get(i).getOptionB());
            question.setOptionC(response.body().get(i).getOptionC());
            question.setOptionD(response.body().get(i).getOptionD());
            question.setQuestion(response.body().get(i).getQuestion());
            lokSewaDataSource.insertOrUpdateGkQuestion(question);
        }
        lokSewaDataSource.close();
    }


    @Override
    public void onBackPressed() {
        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.nav_scorecard) {
            Intent intent = new Intent(this, ScoreCardActivity.class);
            startActivity(intent);

        } else if (id == R.id.nav_Setting) {
            /*  startActivity(new Intent(this,Setting.class));*/
            startActivity(new Intent(this, SettingActivity.class));

        } else if (id == R.id.nav_share) {
            //shareApplication();
            Intent intent = new Intent(Intent.ACTION_SEND);
            intent.setData(Uri.parse("mailto:"));
            intent.setType("message/rfc822");
            intent.putExtra(Intent.EXTRA_SUBJECT, "QRCE");
            System.out.println("" + R.string.email_content);
            intent.putExtra(Intent.EXTRA_TEXT, "" + getText(R.string.email_content) + getText(R.string.link) + getText(R.string.last_content));
            Intent chooser = Intent.createChooser(intent, "Share using");
            startActivity(chooser);
        } else if (id == R.id.nav_feedback) {
            Intent intent = new Intent(Intent.ACTION_SEND);
            intent.setData(Uri.parse("mailto:"));
            String[] recipents = {"spangeni44@gmail.com"};
            intent.setType("message/rfc822");
            intent.putExtra(Intent.EXTRA_EMAIL, recipents);
            intent.putExtra(Intent.EXTRA_SUBJECT, "QRCE Reviews");
            Intent chooser = Intent.createChooser(intent, "Send Feedback Via");
            startActivity(chooser);

        } else if (id == R.id.nav_Help) {
            Intent i = new Intent(this, HelpActivity.class);
            startActivity(i);

        } else if (id == R.id.nav_aboutus) {
            Intent i = new Intent(this, AboutUsActivity.class);
            startActivity(i);
        } else if (id == R.id.nav_ntc) {
            /*  startActivity(new Intent(this,Setting.class));*/
            startActivity(new Intent(this, NTCActivity.class));

        } else if (id == R.id.nav_nea) {
            /*  startActivity(new Intent(this,Setting.class));*/
            startActivity(new Intent(this, NEAActivity.class));
        } else if (id == R.id.nav_loksewa) {
            /*  startActivity(new Intent(this,Setting.class));*/
            startActivity(new Intent(this, LokSewaActivity.class));

        }
        DrawerLayout drawer = findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }

    @Override
    protected void onPause() {
        super.onPause();
        SharedPreferences sp = getSharedPreferences("Score", Context.MODE_PRIVATE);
        if (sp.getInt("Sound", 0) == 0)
            mediaPlayer.pause();
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        SharedPreferences sp = getSharedPreferences("Score", Context.MODE_PRIVATE);
        if (sp.getInt("Sound", 0) == 0)
            mediaPlayer.start();
    }
}

