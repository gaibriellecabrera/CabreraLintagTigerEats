package gaibrielle.cabrera.com.tigereats;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class Omelet extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_omelet);
    }

    public void Back (View v){
        Intent i = new Intent (this, MainActivity.class);
        startActivity(i);
    }
}
