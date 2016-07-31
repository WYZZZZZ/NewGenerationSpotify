package yezhenwang.newgenerationspotify;

import android.content.Intent;
import android.os.AsyncTask;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;

/**
 * Created by dhana on 7/31/2016.
 */
public class Downloader extends AsyncTask<String, Integer, ArrayList> {

    ArtistListActivity artistListActivity;

    public Downloader(ArtistListActivity artistListActivity){
        this.artistListActivity = artistListActivity;
    }

    @Override
    protected ArrayList doInBackground(String... params) {

        String url = "https://api.spotify.com/v1/artists/06HL4z0CvFAxyc27GXpf02/top-tracks?country=US";


        ArrayList<Results> resultsArrayList = new ArrayList<Results>();
        try {
            URL theURL = new URL(url);
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }


        return null;
    }
}
