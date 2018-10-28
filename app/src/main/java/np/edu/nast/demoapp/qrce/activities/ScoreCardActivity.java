package np.edu.nast.demoapp.qrce.activities;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.widget.TextView;
import android.widget.Toast;

import np.edu.nast.demoapp.qrce.R;

public class ScoreCardActivity extends AppCompatActivity {
    TextView a1, a2, a3, a4, a5, a6, a7, a8, a9, a10,a11, a12, a13, a14, a15, a16, a17, a18, a19, a20, a21, a22, a23, a24;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_score_card);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        SharedPreferences sharedPreferences = getSharedPreferences("Score", Context.MODE_PRIVATE);
        a1 = (TextView) findViewById(R.id.c_programming);
        a2 = (TextView) findViewById(R.id.basic_electrical_engineering);
        a3 = (TextView) findViewById(R.id.cplus);
        a4 = (TextView) findViewById(R.id.data_structures_and_algorithms);
        a5 = (TextView) findViewById(R.id.edc);
        a6 = (TextView) findViewById(R.id.logic_circuit);
        a7 = (TextView) findViewById(R.id.dbms);
        a8 = (TextView) findViewById(R.id.microprocessor);
        a9 = (TextView) findViewById(R.id.csharp);
        a10 = (TextView) findViewById(R.id.java);
        a11 = (TextView) findViewById(R.id.maths);
        a12 = (TextView) findViewById(R.id.computer_graphics);
        a13 = (TextView) findViewById(R.id.toc);
        a14 = (TextView) findViewById(R.id.numerical_methods);
        a15 = (TextView) findViewById(R.id.oose);
        a16 = (TextView) findViewById(R.id.data_communication);
        a17 = (TextView) findViewById(R.id.simulation_and_modeling);
        a18 = (TextView) findViewById(R.id.embedded_system);
        a19 = (TextView) findViewById(R.id.os);
        a20 = (TextView) findViewById(R.id.artificial_intelligence);
        a21 = (TextView) findViewById(R.id.computer_networks);
        a22 = (TextView) findViewById(R.id.digital_signal_processing);
        a23 = (TextView) findViewById(R.id.information_system);
        a24 = (TextView) findViewById(R.id.spit);
        try {
            a1.setText("" + sharedPreferences.getInt("CProgramming", 0));
            a2.setText("" + sharedPreferences.getInt("BasicElectricalEngineering", 0));
            a3.setText("" + sharedPreferences.getInt("CPlus", 0));
            a4.setText("" + sharedPreferences.getInt("DataStructureAndAlgorithms", 0));
            a5.setText("" + sharedPreferences.getInt("ElectronicDevicesAndCircuits", 0));
            a6.setText("" + sharedPreferences.getInt("LogicCircuits", 0));
            a7.setText("" + sharedPreferences.getInt("DatabaseManagementSystem", 0));
            a8.setText("" + sharedPreferences.getInt("MIcroprocessor", 0));
            a9.setText("" + sharedPreferences.getInt("C#", 0));
            a10.setText("" + sharedPreferences.getInt("Java", 0));
            a11.setText("" + sharedPreferences.getInt("Mathematics", 0));
            a12.setText("" + sharedPreferences.getInt("ComputerGraphics", 0));
            a13.setText("" + sharedPreferences.getInt("TheoryOfComputation", 0));
            a14.setText("" + sharedPreferences.getInt("NumericalMethods", 0));
            a15.setText("" + sharedPreferences.getInt("ObjectOrientedSoftwareEngineering", 0));
            a16.setText("" + sharedPreferences.getInt("DataCommunication", 0));
            a17.setText("" + sharedPreferences.getInt("SimulationAndModeling", 0));
            a18.setText("" + sharedPreferences.getInt("EmbeddedSystem", 0));
            a19.setText("" + sharedPreferences.getInt("OperatingSystem", 0));
            a20.setText("" + sharedPreferences.getInt("ArtificialIntelligence", 0));
            a21.setText("" + sharedPreferences.getInt("ComputerNetworks", 0));
            a22.setText("" + sharedPreferences.getInt("DigitalSignalProcessing", 0));
            a23.setText("" + sharedPreferences.getInt("InformationSystem", 0));
            a24.setText("" + sharedPreferences.getInt("SocialAndProfessionalIssuesInIt", 0));

        } catch (Exception e) {
            Toast.makeText(ScoreCardActivity.this, "" + e, Toast.LENGTH_SHORT).show();
        }
    }

}
