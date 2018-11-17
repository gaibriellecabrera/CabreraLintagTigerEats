package gaibrielle.cabrera.com.tigereats;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class Hokusai extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hokusai);
    }

    public void Back (View v){
        Intent i = new Intent (this, Japanese.class);
        startActivity(i);
    }

    public void HokusaiMap(View v){
        Intent i=null, chooser=null;
        i = new Intent(Intent.ACTION_VIEW);
        i.setData(Uri.parse("geo:14.607740, 120.988516"));
        chooser = Intent.createChooser(i, "Open with?");
        startActivity(chooser);
    }
}
