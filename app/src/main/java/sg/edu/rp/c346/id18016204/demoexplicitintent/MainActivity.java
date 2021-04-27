package sg.edu.rp.c346.id18016204.demoexplicitintent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    //These request identify who started the second activity
    int requestCodeForSupermanStats = 1;
    int getRequestCodeForBatmanStats = 2 ;

TextView tvSuperman ,   tvBatman;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvSuperman= findViewById(R.id.textViewSuperman);
        tvBatman=findViewById(R.id.textViewBatman);

        //set listenner to handle the clicking of superman TextView
        tvSuperman.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Create hero object of strength 100 & technical 60
                Hero superman = new Hero("Superman",100,60);
                Intent i = new Intent(MainActivity.this, HeroStatsActivity.class);

                //Put hero object in Intent
                i.putExtra("hero",superman);
                //start activity with requestCodeForSupermanStats to identify it was started by clicking on Superman
                startActivityForResult(i, requestCodeForSupermanStats);
            }
        });
        //set listenner to handle the clicking of batman textview
        tvBatman.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //create hero object of strength 60 & tehnical 90
                Hero batman = new Hero("Batman",60,90);
                Intent i =new Intent(MainActivity.this, HeroStatsActivity.class);
                //put hero object in intent
                i.putExtra("hero",batman);
                startActivityForResult(i,getRequestCodeForBatmanStats);
            }
        });
        
    }
}