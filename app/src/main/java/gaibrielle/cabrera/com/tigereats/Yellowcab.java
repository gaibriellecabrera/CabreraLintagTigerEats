package gaibrielle.cabrera.com.tigereats;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class Yellowcab extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_yellowcab);
    }

    public void Back (View v){
        Intent i = new Intent (this, Italian.class);
        startActivity(i);
    }

    public void yellowcabMap(View v){
        Intent i=null, chooser=null;
        i = new Intent(Intent.ACTION_VIEW);
        i.setData(Uri.parse("geo:14.612560, 120.991659"));
        chooser = Intent.createChooser(i, "Open with?");
        startActivity(chooser);
    }
}
