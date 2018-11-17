package gaibrielle.cabrera.com.tigereats;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

public class Korean extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_korean);
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

    public void Samgyup (View v){
        Intent i = new Intent (this, Samgyup.class);
        startActivity(i);
    }

    public void Samgyupsarap (View v){
        Intent i = new Intent (this, Samgyupsarap.class);
        startActivity(i);
    }

    public void Santorini (View v){
        Intent i = new Intent (this, Santorini.class);
        startActivity(i);
    }

    public void Hanayo (View v){
        Intent i = new Intent (this, Hanayo.class);
        startActivity(i);
    }

    public void Bonchon (View v){
        Intent i = new Intent (this, Bonchon.class);
        startActivity(i);
    }
}
