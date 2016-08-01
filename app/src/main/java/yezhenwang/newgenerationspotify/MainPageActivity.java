package yezhenwang.newgenerationspotify;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

import android.widget.TextView;

public class MainPageActivity extends AppCompatActivity {


    TextView greetings;
    ImageView imageView;



    ArtistPicFragment artistPicFragment;


    TextView greetings;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_page);
        imageView = (ImageView) findViewById(R.id.imageView);


    }




}

=======
<<<<<<< HEAD

        artistPicFragment = (ArtistPicFragment) getFragmentManager().findFragmentById(R.id.artist_pic_fragment);


    }

=======
    }
>>>>>>> 92d146395969b4e0906412cb729b5da00aec5de0
}
>>>>>>> 6364af332a4b9630d4b3021abe991e5ad82b1c3a
