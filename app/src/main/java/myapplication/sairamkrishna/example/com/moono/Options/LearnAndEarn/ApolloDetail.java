package myapplication.sairamkrishna.example.com.moono.Options.LearnAndEarn;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;

import myapplication.sairamkrishna.example.com.moono.R;

public class ApolloDetail extends AppCompatActivity {
    ImageView imageView ;
    TextView content ;
    TextView title ;
    Intent intent ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_apollo_detail);
        intent = this.getIntent();

        String contentString = intent.getStringExtra("content");

        imageView = (ImageView) findViewById(R.id.apollo_image_detail);

        content = (TextView) findViewById(R.id.apollo_content);

        title = (TextView) findViewById(R.id.apollo_title_detail);

        imageView.setImageResource(  intent.getIntExtra("image",R.drawable.apollo11));

        content.setText( contentString);

        title.setText(intent.getStringExtra("title"));

    }
}
