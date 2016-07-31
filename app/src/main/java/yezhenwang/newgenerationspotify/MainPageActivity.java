package yezhenwang.newgenerationspotify;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class MainPageActivity extends AppCompatActivity {


    TextView greetings;
    ImageView imageView;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_page);
        imageView = (ImageView) findViewById(R.id.imageView);


    }




}

