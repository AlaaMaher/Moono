package myapplication.sairamkrishna.example.com.moono.Options.LearnAndEarn;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.youtube.player.YouTubeBaseActivity;
import com.google.android.youtube.player.YouTubeInitializationResult;
import com.google.android.youtube.player.YouTubePlayer;
import com.google.android.youtube.player.YouTubePlayerView;

import myapplication.sairamkrishna.example.com.moono.R;

public class FunFactsDetails extends YouTubeBaseActivity implements YouTubePlayer.OnInitializedListener {

    TextView header ;
    Intent intent ;

    public static final String API_KEY = "AIzaSyDmpzHilyMIM-tsj2y-waC8qKX5RsK_3Dk";

    String VIDEO_ID  ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fun_facts_details);
        intent = this.getIntent();
        header = (TextView) findViewById(R.id.fact_name);
        header.setText(intent.getStringExtra("title"));
        VIDEO_ID = intent.getStringExtra("key");
        YouTubePlayerView youTubePlayerView = (YouTubePlayerView) findViewById(R.id.fun_fact_video);
        youTubePlayerView.initialize(API_KEY, this);

    }

    @Override
    public void onInitializationSuccess(YouTubePlayer.Provider provider, YouTubePlayer youTubePlayer, boolean b) {
        if (!b) {
            youTubePlayer.cueVideo(VIDEO_ID);
        }
    }

    @Override
    public void onInitializationFailure(YouTubePlayer.Provider provider, YouTubeInitializationResult youTubeInitializationResult) {
        Toast.makeText(getApplicationContext(),
                "An Error occurred",
                Toast.LENGTH_LONG).show();
    }

}
