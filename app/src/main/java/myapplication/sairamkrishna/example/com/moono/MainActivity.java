package myapplication.sairamkrishna.example.com.moono;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import myapplication.sairamkrishna.example.com.moono.Options.optionsActivity;

public class MainActivity extends AppCompatActivity {

    Button logIn ;
    EditText enterYourName ;
    Intent intent ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        enterYourName = (EditText) findViewById(R.id.name);
        logIn = (Button) findViewById(R.id.login);
        logIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
        intent = new Intent(MainActivity.this , optionsActivity.class);
            if (enterYourName.getText().length()==0)
            {
               enterYourName.getError();
            }
                else
            {
                intent.putExtra("Name" , enterYourName.getText().toString());
                startActivity(intent);
            }
            }
        });


    }
}
