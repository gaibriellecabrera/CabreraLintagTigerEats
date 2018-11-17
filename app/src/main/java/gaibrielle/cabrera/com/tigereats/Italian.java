package gaibrielle.cabrera.com.tigereats;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

public class Italian extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_italian);
        Toolbar tb = (Toolbar) findViewById(R.id.toolbar);
        tb.setNavigationIcon(R.drawable.ic_arrow_back_black_24dp);
        tb.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),MainActivity.class));
            }
        });
    }


    public void Back (View v){
        Intent i = new Intent (this, MainActivity.class);
        startActivity(i);
    }

    public void Yellowcab (View v){
        Intent i = new Intent (this, Yellowcab.class);
        startActivity(i);
    }

    public void Dominos (View v){
        Intent i = new Intent (this, Dominos.class);
        startActivity(i);
    }

    public void Shakeys (View v){
        Intent i = new Intent (this, Shakeys.class);
        startActivity(i);
    }

    public void Sbarro (View v){
        Intent i = new Intent (this, Sbarro.class);
        startActivity(i);
    }

    public void Pizzahut (View v){
        Intent i = new Intent (this, Pizzahut.class);
        startActivity(i);
    }
}
