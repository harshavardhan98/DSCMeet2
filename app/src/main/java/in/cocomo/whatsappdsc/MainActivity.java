package in.cocomo.whatsappdsc;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView iv_dp1 = findViewById(R.id.dp1);
        ImageView iv_dp2 = findViewById(R.id.dp2);

        String url1="http://goo.gl/gEgYUd";
        String url2="http://goo.gl/gEgYUd";


        Glide.with(this).load(url1).into(iv_dp1);
        Glide.with(this).load(url2).into(iv_dp2);

    }
}