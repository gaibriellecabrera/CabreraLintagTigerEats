package gaibrielle.cabrera.com.tigereats;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

public class Filipino extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_filipino);
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

    public void Lovelite (View v){
        Intent i = new Intent (this, Lovelite.class);
        startActivity(i);
    }

    public void RicingStar (View v){
        Intent i = new Intent (this, RicingStar.class);
        startActivity(i);
    }

    public void TapaKing (View v){
        Intent i = new Intent (this, TapaKing.class);
        startActivity(i);
    }

    public void Celys (View v){
        Intent i = new Intent (this, Celys.class);
        startActivity(i);
    }

    public void Goldilocks (View v){
        Intent i = new Intent (this, Goldilocks.class);
        startActivity(i);
    }
}
