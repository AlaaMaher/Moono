package myapplication.sairamkrishna.example.com.moono.Options;

import android.content.DialogInterface;
import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import myapplication.sairamkrishna.example.com.moono.Options.BookItToTheMoon.SolarSimulation;
import myapplication.sairamkrishna.example.com.moono.Options.Gallary.Images;
import myapplication.sairamkrishna.example.com.moono.Options.LearnAndEarn.ApolloMissions;
import myapplication.sairamkrishna.example.com.moono.Options.LearnAndEarn.FunFacts;
import myapplication.sairamkrishna.example.com.moono.Options.StoryAndChallenge.challenges.challenge;
import myapplication.sairamkrishna.example.com.moono.R;

public class optionsActivity extends AppCompatActivity {


    String name ; //Player Name
    TextView comingName ;
    Button moonLocation ;
    Button stories;
    Button gallary ;
    Button challenges ;
    String [] gallaryOptions = {"IMAGES" , "VIDEOS" } ;
    String [] moon  = {"Solar System Simulation","Moon information"}; //"Map Location" ,
     String [] learn = {"Moon interesting Facts", "Apollo missions"};
    Intent images ;
    Intent videos ;
    Intent funFacts ;
    Intent scope ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_options);
        MediaPlayer player  ;
        player = MediaPlayer.create(this, R.raw.s2);
        player.start();
        final Intent intent = this.getIntent() ;
        comingName = (TextView) findViewById(R.id.coming_name);
        name = intent.getStringExtra("Name");
         comingName.setText(name);
        moonLocation = (Button) findViewById(R.id.moon_location);
        stories = (Button) findViewById(R.id.stories);
        gallary= (Button) findViewById(R.id.galary);
        challenges = (Button)findViewById(R.id.settings);

        moonLocation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder builder = new AlertDialog.Builder( optionsActivity.this);
                builder.setTitle("Book it the Moon");
                builder.setItems(moon, new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        if (which == 0 )
                        {
                            Intent i  = new Intent(Intent.ACTION_VIEW);
                            String url = "http://www.solarsystemscope.com/";
                            i.setData(Uri.parse(url));
                            startActivity(i);
                        }
                        else if (which == 1)
                        {

                            scope = new Intent(Intent.ACTION_VIEW);
                            String url = "http://www.mooncalc.org/#/-11.8674,130.7813";
                            scope.setData(Uri.parse(url));
                            startActivity(scope);

                        }
                        else
                        {
                            Intent intent  = new Intent(optionsActivity.this,SolarSimulation.class);
                            startActivity(intent);
                        }
                    }
                });
                builder.create().show();
            }

        }  );

        gallary.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1 = new Intent(optionsActivity.this,Images.class);
                startActivity(intent1);
            }

        }  );
        stories.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                AlertDialog.Builder builder = new AlertDialog.Builder(  optionsActivity.this);
                builder.setTitle("Stories and Fun Facts ");
                builder.setItems(learn, new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {

                        if (which == 0)
                        {
                          Intent  intent1 = new Intent(optionsActivity.this, FunFacts.class);
                            startActivity(intent1);
                        }
                        else
                        {
                            Intent intent1 = new Intent(optionsActivity.this, ApolloMissions.class);
                            startActivity(intent1);
                        }
                    }
                });
                builder.create().show();
            }

        }  );

        challenges.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1 = new Intent(optionsActivity.this, challenge.class);
                startActivity(intent1);

            }
        });
    }
}
