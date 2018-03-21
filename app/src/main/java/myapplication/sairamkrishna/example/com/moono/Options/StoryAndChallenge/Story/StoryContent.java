package myapplication.sairamkrishna.example.com.moono.Options.StoryAndChallenge.Story;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.youtube.player.YouTubeBaseActivity;
import com.google.android.youtube.player.YouTubeInitializationResult;
import com.google.android.youtube.player.YouTubePlayer;
import com.google.android.youtube.player.YouTubePlayerView;

import myapplication.sairamkrishna.example.com.moono.R;

public class StoryContent extends YouTubeBaseActivity implements YouTubePlayer.OnInitializedListener {

    TextView header ;
    Button button;
    TextView content ;
    Intent intent ;
//    public final String title = "Moon Phases Demonstration";
   public static final String API_KEY = "AIzaSyDmpzHilyMIM-tsj2y-waC8qKX5RsK_3Dk";
//AIzaSyDmpzHilyMIM-tsj2y-waC8qKX5RsK_3Dk                        mine
String VIDEO_ID  ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_story_content);
        intent = this.getIntent();
        header = (TextView) findViewById(R.id.story_name);
        header.setText(intent.getStringExtra("name"));
        VIDEO_ID = intent.getStringExtra("key");
        content = (TextView) findViewById(R.id.content);
        content.setText(intent.getStringExtra("content"));

        YouTubePlayerView youTubePlayerView = (YouTubePlayerView) findViewById(R.id.youtube_video);
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