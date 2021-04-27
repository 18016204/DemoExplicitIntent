package sg.edu.rp.c346.id18016204.demoexplicitintent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

public class HeroStatsActivity extends AppCompatActivity {
TextView tvName,tvStrength ,tvTechnicalProwess;
Button btnLike,btnDislike;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hero_stats);
        //get the intent
        Intent i = getIntent();
        //Get the hero object first activity put in intent
        Hero hero = (Hero)i.getSerializableExtra("hero");

        tvName=findViewById(R.id.textViewName);
        tvStrength=findViewById(R.id.textViewStrength);
        tvTechnicalProwess=findViewById(R.id.textViewTechnicalProwess);

        // use getters of Hero object to get the attrbutes
        tvName.setText(hero.getName());
        tvStrength.setText("Strength :" + hero.getStrength());
        tvTechnicalProwess.setText("Technical : " + hero.getTechnicalProwess());
    }
}