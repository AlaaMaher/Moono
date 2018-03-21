package myapplication.sairamkrishna.example.com.moono.Options.Gallary;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageButton;
import android.widget.ListView;

import myapplication.sairamkrishna.example.com.moono.R;
import myapplication.sairamkrishna.example.com.moono.adapter.imageAdapter;

public class Images extends AppCompatActivity {
    Integer[] images = {R.drawable.image4,R.drawable.image1 , R.drawable.image2,R.drawable.im5,R.drawable.image6,R.drawable.image7,R.drawable.image9,R.drawable.image10,
    R.drawable.gal1};
    imageAdapter adapter ;
    ListView listView;
    ImageButton nasa;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_images);

        listView = (ListView) findViewById(R.id.list_view);
        adapter= new imageAdapter(this,images);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(Images.this,ImageViewr.class);
                intent.putExtra("image",images[position]);
                startActivity(intent);
            }
        });
        nasa = (ImageButton) findViewById(R.id.nasa);
        nasa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Images.this,LatestImageByNasa.class);
                startActivity(intent);
            }
        });
    }

    }

