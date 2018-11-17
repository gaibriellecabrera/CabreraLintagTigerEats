package gaibrielle.cabrera.com.tigereats;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

public class American extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_american);
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

    public void Army (View v){
        Intent i = new Intent (this, Army.class);
        startActivity(i);
    }

    public void Wendys (View v){
        Intent i = new Intent (this, Wendys.class);
        startActivity(i);
    }

    public void Jackos (View v){
        Intent i = new Intent (this, Jackos.class);
        startActivity(i);
    }

    public void WingVibe (View v){
        Intent i = new Intent (this, WingVibe.class);
        startActivity(i);
    }

    public void Mcdonalds (View v){
        Intent i = new Intent (this, Mcdonalds.class);
        startActivity(i);
    }
}
