package gaibrielle.cabrera.com.tigereats;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

public class Japanese extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_japanese);
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

    public void Hokusai (View v){
        Intent i = new Intent (this, Hokusai.class);
        startActivity(i);
    }

    public void Ichiro (View v){
        Intent i = new Intent (this, Ichiro.class);
        startActivity(i);
    }

    public void Toribox (View v){
        Intent i = new Intent (this, Toribox.class);
        startActivity(i);
    }

    public void Legit (View v){
        Intent i = new Intent (this, Legit.class);
        startActivity(i);
    }

    public void TokyoTokyo (View v){
        Intent i = new Intent (this, TokyoTokyo.class);
        startActivity(i);
    }

}
