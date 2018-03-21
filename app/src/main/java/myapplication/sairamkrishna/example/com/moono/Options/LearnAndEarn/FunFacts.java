package myapplication.sairamkrishna.example.com.moono.Options.LearnAndEarn;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import myapplication.sairamkrishna.example.com.moono.R;
import myapplication.sairamkrishna.example.com.moono.adapter.FunFactsAdapter;

public class FunFacts extends AppCompatActivity {


    Integer [] images = {R.drawable.fact1 , R.drawable.fact2,R.drawable.fact3,R.drawable.fact4,R.drawable.fact5};
    String [] titles = {"Learning about the moon ","How Moon Shines ?", "Moon Phases Demonstration","Lunar Eclipse Essentials","The Solar System Song"};
    String [] keys = {"B-b4XvuQo1Y","cGhqDqs6s8Q" ,"wz01pTvuMa0" ,"wuhNZejHeBg" ,"BZ-qLUIj_A0"};
    ListView listView ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fun_facts);
        listView = (ListView)findViewById(R.id.fun_facts);
        FunFactsAdapter adapter = new FunFactsAdapter(this,titles,images);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        Intent intent = new Intent(FunFacts.this , FunFactsDetails.class);
        intent.putExtra("key",keys[position]);
        intent.putExtra("title",titles[position]);
        startActivity(intent);
    }
});
    }
}
