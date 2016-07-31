package yezhenwang.newgenerationspotify;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ArtistActivity extends AppCompatActivity {


    Button artistButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_artist);
        artistButton = (Button) findViewById(R.id.artistList);
    }

    public void artistList(View view) {
        Intent intent = new Intent(this, ArtistListActivity.class);
        intent.putExtra("artistList", artistButton.getText().toString());
        startActivity(intent);

    }

    public void userPlaylist(View view) {
    }

    public void concerts(View view) {

    }


}
