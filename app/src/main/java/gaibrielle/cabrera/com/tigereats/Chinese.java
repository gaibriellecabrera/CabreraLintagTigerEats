package gaibrielle.cabrera.com.tigereats;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

public class Chinese extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_chinese);
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

    public void Dimsum (View v){
        Intent i = new Intent (this, Dimsum.class);
        startActivity(i);
    }

    public void Angkong (View v){
        Intent i = new Intent (this, Angkong.class);
        startActivity(i);
    }

    public void GoldenChopstick (View v){
        Intent i = new Intent (this, GoldenChopstick.class);
        startActivity(i);
    }

    public void FastFoo (View v){
        Intent i = new Intent (this, FastFoo.class);
        startActivity(i);
    }

    public void Chowking (View v){
        Intent i = new Intent (this, Chowking.class);
        startActivity(i);
    }
}
