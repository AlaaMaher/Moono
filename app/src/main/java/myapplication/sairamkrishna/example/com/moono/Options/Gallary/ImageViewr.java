package myapplication.sairamkrishna.example.com.moono.Options.Gallary;

import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import com.squareup.picasso.Picasso;

import myapplication.sairamkrishna.example.com.moono.R;

public class ImageViewr extends AppCompatActivity   {

    ImageView imageView ;
    Intent intent;
    Integer image ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_image_viewr);
        intent = this.getIntent() ;
        image = intent.getIntExtra("image",R.drawable.image1);
        imageView = (ImageView) findViewById(R.id.image_viewer);
        Picasso.with(this).load(image).into(imageView);

    }
    public  void save (View view)
    {

        Toast.makeText(this,"added to the gallery ",Toast.LENGTH_LONG).show();
    }
/*

adding to the Gallry !!!!!
 */
    public static void addImageToGallery(final String filePath, final Context context) {

        ContentValues values = new ContentValues();
        values.put(MediaStore.Images.Media.DATE_TAKEN, System.currentTimeMillis());
        values.put(MediaStore.Images.Media.MIME_TYPE, "image/jpeg");
        values.put(MediaStore.MediaColumns.DATA, filePath);
        context.getContentResolver().insert(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, values);
    }

}
