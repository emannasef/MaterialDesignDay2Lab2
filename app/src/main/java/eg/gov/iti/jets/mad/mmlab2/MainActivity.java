package eg.gov.iti.jets.mad.mmlab2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class MainActivity extends AppCompatActivity {

    private FloatingActionButton fabPerson, fabFlower, fabParty;

    private FloatingActionButton mainFloatingActionButton;
    private Boolean isOPen;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        fabFlower = findViewById(R.id.floatingActionButton2);
        fabParty = findViewById(R.id.floatingActionButton3);
        fabPerson = findViewById(R.id.floatingActionButton4);
        mainFloatingActionButton = findViewById(R.id.floating_action_button);
        isOPen = false;

        mainFloatingActionButton.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        if (isOPen) {
                            fabFlower.show();
                            fabParty.show();
                            fabPerson.show();
                            isOPen = false;
                        } else {
                            fabFlower.hide();
                            fabParty.hide();
                            fabPerson.hide();
                            isOPen = true;
                        }
                    }
                }
        );

    }
}