package np.edu.nast.demoapp.qrce.activities;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import np.edu.nast.demoapp.qrce.R;

public class NTCActivity extends AppCompatActivity {
    TextView tv_header;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ntc);
//        setContentView(R.layout.layout_header);
//        tv_header=findViewById(R.id.header_text);
//        tv_header.setText((R.string.nav_ntc));
    }
}
