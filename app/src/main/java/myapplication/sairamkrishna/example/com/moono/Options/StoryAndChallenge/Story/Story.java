package myapplication.sairamkrishna.example.com.moono.Options.StoryAndChallenge.Story;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import myapplication.sairamkrishna.example.com.moono.R;
import myapplication.sairamkrishna.example.com.moono.Options.StoryAndChallenge.challenges.challenge;

public class Story extends AppCompatActivity {


    Button chb ;
StoryItem storyItem  = new StoryItem();
    String [] videoKeys = storyItem.getVideoKeys();
    String []videoTitles = storyItem.getVideoTitles();
    String [] content =storyItem.getContent();
    TextView playerName ;
    TextView points ;
    Button story1 ;
    Button story2 ;
    Button story3 ;
    Button story4 ;
    Button story5 ;
    Button story6 ;
    Button story7 ;
    Button story8 ;
    Button story9 ;
    Button story10 ;
    Intent intent ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_story);

        chb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ch = new Intent(Story.this,challenge.class);
                startActivity(ch);
            }
        });
     intent = this.getIntent();

    playerName.setText(intent.getStringExtra("Name"));

        //story1
    story1 = (Button) findViewById(R.id.button1);
        story1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent = new Intent(Story.this, StoryContent.class);
                intent.putExtra("name",videoTitles[0]);
                intent.putExtra("content",content[0]);
                intent.putExtra("key",videoKeys[0]);
                startActivity(intent);
            }
        });
        //2
        story2 = (Button) findViewById(R.id.button2);
        story2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent = new Intent(Story.this, StoryContent.class);
                intent.putExtra("name",videoTitles[1]);
                intent.putExtra("content",content[1]);
                intent.putExtra("key",videoKeys[1]);
                startActivity(intent);
            }
        });
        story3 = (Button) findViewById(R.id.button3);
        story3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent = new Intent(Story.this, StoryContent.class);
                intent.putExtra("name",videoTitles[2]);
                intent.putExtra("content",content[2]);
                intent.putExtra("key",videoKeys[2]);
                startActivity(intent);
            }
        });
        story4 = (Button) findViewById(R.id.button4);
        story4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent = new Intent(Story.this, StoryContent.class);
                intent.putExtra("name",videoTitles[3]);
                intent.putExtra("content",content[3]);
                intent.putExtra("key",videoKeys[3]);
                startActivity(intent);
            }
        });
        story5 = (Button) findViewById(R.id.button5);
        story5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent = new Intent(Story.this, StoryContent.class);
                intent.putExtra("name",videoTitles[4]);
                intent.putExtra("content",content[4]);
                intent.putExtra("key",videoKeys[4]);
                startActivity(intent);
            }
        });
        story6 = (Button) findViewById(R.id.button6);
        story6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent = new Intent(Story.this, StoryContent.class);
                intent.putExtra("name",videoTitles[5]);
                intent.putExtra("content",content[5]);
                intent.putExtra("key",videoKeys[5]);
                startActivity(intent);
            }
        });
        story7 = (Button) findViewById(R.id.button7);
        story7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent = new Intent(Story.this, StoryContent.class);
                intent.putExtra("name",videoTitles[6]);
                intent.putExtra("content",content[6]);
                intent.putExtra("key",videoKeys[6]);
                startActivity(intent);
            }
        });
        story8 = (Button) findViewById(R.id.button8);
        story8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent = new Intent(Story.this, StoryContent.class);
                intent.putExtra("name",videoTitles[7]);
                intent.putExtra("content",content[7]);
                intent.putExtra("key",videoKeys[7]);
                startActivity(intent);
            }
        });
        story9 = (Button) findViewById(R.id.button9);
        story9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent = new Intent(Story.this, StoryContent.class);
                intent.putExtra("name",videoTitles[8]);
                intent.putExtra("content",content[8]);
                intent.putExtra("key",videoKeys[8]);
                startActivity(intent);
            }
        });
        story10 = (Button) findViewById(R.id.button10);
        story10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent = new Intent(Story.this, StoryContent.class);
                intent.putExtra("name",videoTitles[9]);
                intent.putExtra("content",content[9]);
                intent.putExtra("key",videoKeys[9]);
                startActivity(intent);
            }
        });

    }

}
