package at.klestil.funfacts;

import android.content.res.Resources;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class FunFactsActivity extends AppCompatActivity {
    public static final String TAG = FunFactsActivity.class.getSimpleName();
    private FactBook factBook = new FactBook();
    private ColorWheel colorWheel = new ColorWheel();

    // Declare our View variables
    private TextView factTextView;
    private Button showFactButton;
    private RelativeLayout mylayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Assing the Views form the layout file to the corresponding variables
        factTextView = findViewById(R.id.factTextView);
        showFactButton = findViewById(R.id.showFactButton);
        mylayout = findViewById((R.id.relativeLayout));

        View.OnClickListener listener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                int color = colorWheel.getColor();
                // Update der App auf Deutsche Sprache, zugriff auf Resources nur in der Activity möglich nicht in der Java Klasse
                Resources resources = getResources();
                String[] facts = getResources().getStringArray(R.array.facts);
                // Update the screen with our new fact
                factTextView.setText(factBook.getFact(facts));
                mylayout.setBackgroundColor(color);
                showFactButton.setTextColor(color);

            }
        };
        showFactButton.setOnClickListener(listener);

        //Toast.makeText(this, "Yay ! Our Activity was created!", Toast.LENGTH_SHORT).show();
        Log.d(TAG, "We're logging from the on Creat() mehtod!");
    }
}
