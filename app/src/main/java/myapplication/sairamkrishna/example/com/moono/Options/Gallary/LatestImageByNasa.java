package myapplication.sairamkrishna.example.com.moono.Options.Gallary;

import android.os.AsyncTask;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.squareup.picasso.Picasso;

import org.json.JSONException;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import myapplication.sairamkrishna.example.com.moono.R;

public class LatestImageByNasa extends AppCompatActivity {
    ImageView nasaImage;
    TextView nasaTitle ;
    TextView nasaDate ;
    TextView nasaContent ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Toast.makeText(this,"Loading the Data ",Toast.LENGTH_LONG).show();
        setContentView(R.layout.activity_latest_image_by_nasa);
    nasaImage = (ImageView) findViewById(R.id.nasa_image);
        nasaTitle = (TextView) findViewById(R.id.nasa_title);
        nasaDate = (TextView) findViewById(R.id.nasa_date);
        nasaContent= (TextView)findViewById(R.id.nasa_content);
         LatestImage latest = new LatestImage();
           latest.execute();
    }
    public class LatestImage extends AsyncTask<Void, Void, String> {
        String title , date, content ,url,hdUrl ;

        myapplication.sairamkrishna.example.com.moono.adapter.imageAdapter imageAdapter ;
        public
        List<String> paths = new ArrayList<>();

        @Override
        protected String doInBackground(Void... params) {

            HttpURLConnection urlConnection = null;
            BufferedReader bufferedReader = null;
            String JsonResponse = null;
            try {
                String link = "https://api.nasa.gov/planetary/apod?api_key=0oT53FXlR3IbTPLdnoJQdA6hgG8oarDH4wJWOJN1";
                URL url = new URL(link);

                urlConnection = (HttpURLConnection) url.openConnection();
                urlConnection.setRequestMethod("GET");
                urlConnection.connect();

                //take the input into a string
                InputStream inputStream = urlConnection.getInputStream();

                StringBuffer buffer = new StringBuffer();
                if (inputStream == null) {
                    return null;
                }

                bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
                String line;
                while ((line = bufferedReader.readLine()) != null) {

                    buffer.append(line + "\n");
                }
                if (buffer.length() == 0) {
                    return null;
                }
                JsonResponse = buffer.toString();

            } catch (IOException e) {

                return null;
            }
            finally {
                if (urlConnection!=null)
                {
                    urlConnection.disconnect();
                }
                if (bufferedReader!=null)
                {
                    try {
                        bufferedReader.close();
                    } catch (final IOException e) {
                        e.printStackTrace();
                    }
                }
            }
            return JsonResponse;
        }//back
        @Override
        protected void onPostExecute(String s) {
            super.onPostExecute(s);
            try {
                JSONObject json = new JSONObject(s);
                content = json.getString("explanation");
                date = json.getString("date");
                title = json.getString("title");
                url = json.getString("url");
                hdUrl = json.getString("hdurl");
                nasaTitle.setText(title);
                nasaContent.setText(content);
                nasaDate.setText(date);
                Picasso.with(LatestImageByNasa.this).load(url).error(R.drawable.apollo11).into(nasaImage);
            }
            catch (JSONException e)
            {
                e.printStackTrace();
            }
        }
    }//inner class


}//main class
