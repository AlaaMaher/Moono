package myapplication.sairamkrishna.example.com.moono.Options.BookItToTheMoon;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.webkit.WebSettings;
import android.webkit.WebView;

import myapplication.sairamkrishna.example.com.moono.R;

public class SolarSimulation extends AppCompatActivity {

    WebView webView ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_solar_simulation);
        webView = (WebView) findViewById(R.id.webView);
        WebSettings webSettings = webView.getSettings();
        webSettings.setJavaScriptEnabled(true);

        String data_html = "<iframe src=\"http://www.solarsystemscope.com/embed/sssemb.html?lang=en\" style=\"border:0;\" ></iframe>";

     webView.loadDataWithBaseURL("http://www.solarsystemscope.com/embed/sssemb.html?lang=en",data_html,"text/html",null,null);

    }
}
