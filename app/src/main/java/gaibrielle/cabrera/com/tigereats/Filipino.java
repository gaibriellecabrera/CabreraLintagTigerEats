package gaibrielle.cabrera.com.tigereats;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Filipino extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_filipino);
    }


    public void Back (View v){
        Intent i = new Intent (this, MainActivity.class);
        startActivity(i);
    }

    public void Lovelite (View v){
        Intent i = new Intent (this, Lovelite.class);
        startActivity(i);
    }
}
