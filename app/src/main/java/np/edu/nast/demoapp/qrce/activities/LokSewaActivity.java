package np.edu.nast.demoapp.qrce.activities;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.ZoomControls;

import np.edu.nast.demoapp.qrce.R;

public class LokSewaActivity extends AppCompatActivity {
    TextView tv_header;
    Button btn_test;
    Button btn_sample_question;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lok_sewa);
//        setContentView(R.layout.layout_header);
//        tv_header=findViewById(R.id.header_text);
//        tv_header.setText((R.string.nav_loksewa));

//        btn_test=findViewById(R.id.btn_test_loksewa);
        btn_sample_question=findViewById(R.id.btn_sample_questions);

        btn_sample_question.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

             ViewGroup layout=findViewById(R.id.rl_layout_top);
             layout.setVisibility(View.INVISIBLE);
              ImageView img_sample_question=findViewById(R.id.iv_sample_questions);
              img_sample_question.setVisibility(View.VISIBLE);

            }
        });

    }
}
