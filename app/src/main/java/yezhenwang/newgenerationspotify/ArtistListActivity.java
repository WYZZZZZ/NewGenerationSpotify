package yezhenwang.newgenerationspotify;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class ArtistListActivity extends AppCompatActivity {

    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_artist_list);
        listView = (ListView) findViewById(R.id.listView);


        String artistList = getIntent().getStringExtra("artistList");

        Downloader downloader = new Downloader(this);
        downloader.execute(artistList);
    }


    public void drawListView(ArrayList<Results> resultsArray){

    }


}
