package myapplication.sairamkrishna.example.com.moono.Options.StoryAndChallenge.challenges;


import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.RadioButton;
import android.widget.Toast;

import myapplication.sairamkrishna.example.com.moono.R;

public class Ch1 extends AppCompatActivity {
    MediaPlayer player ;
    RadioButton r1;
    RadioButton r2;
    RadioButton r3;
    RadioButton r4;
    int score = 0;
    boolean[] rightClicks = {false, true, true, false};
    boolean[] answers = new boolean[4];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ch1);

        r1 = (RadioButton) findViewById(R.id.r11);
        r2 = (RadioButton) findViewById(R.id.r21);
        r3 = (RadioButton) findViewById(R.id.r31);
        r4 = (RadioButton) findViewById(R.id.r41);
    }
    public void ch1(View v) throws InterruptedException {
        answers[0] = r1.isChecked();
        answers[1] = r2.isChecked();
        answers[2] = r3.isChecked();
        answers[3] = r4.isChecked();
        for (int i = 0; i < 4; i++) {
            if (answers[i] == rightClicks[i]) {
                score += 25;
            }
        }
        if (answers[1] == false && answers[2] == false) {

            Toast.makeText(this, "unfortunately both answers wrong .. try Again", Toast.LENGTH_LONG).show();

            player = MediaPlayer.create(this, R.raw.fail);
            player.start();

        } else if (answers[1] == false || answers[2] == false) {
            if (answers[1]== false) {
                Toast.makeText(this, "Wrong Answer with Question 1 .. try Again ", Toast.LENGTH_LONG).show();
                player = MediaPlayer.create(this, R.raw.fail);
                player.start();
            } else if (answers[2] == false) {
                Toast.makeText(this, "Wrong answer with question 2 .. try Again", Toast.LENGTH_LONG).show();
                player = MediaPlayer.create(this, R.raw.fail);
                player.start();

                 }
        } else {
            Toast.makeText(getApplicationContext(), "Congratulations", Toast.LENGTH_LONG).show();
            player = MediaPlayer.create(this, R.raw.congratulation);
            player.start();
            Intent intent = new Intent(Ch1.this,Ch2.class);
            startActivity(intent);
        }
    }
}
