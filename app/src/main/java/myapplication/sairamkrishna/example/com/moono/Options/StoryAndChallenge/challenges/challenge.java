package myapplication.sairamkrishna.example.com.moono.Options.StoryAndChallenge.challenges;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import myapplication.sairamkrishna.example.com.moono.R;

public class challenge extends AppCompatActivity {
    Button ch1 ;
    Button ch2 ;
    Button ch3 ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_challenge1);


        ch1 =(Button) findViewById(R.id.ch1);
        ch1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(challenge.this,Ch1.class);
                startActivity(intent);
            }
        });
        ch2 =(Button) findViewById(R.id.ch2);
        ch2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(challenge.this,Ch2.class);
                startActivity(intent);
            }
        });


    }

}
