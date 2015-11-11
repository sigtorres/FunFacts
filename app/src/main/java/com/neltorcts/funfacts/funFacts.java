package com.neltorcts.funfacts;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;
import android.widget.Button;

import java.util.Random;

public class funFacts extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fun_facts);

        //declare our view variables and assign them the views from layout file
        final TextView factLabelZ = (TextView) findViewById(R.id.factTextView);
        Button showFactButtonZ = (Button) findViewById(R.id.showFactButton);
        View.OnClickListener listener = new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                //the button was clicked so update the fact label with new fact
                //String fact = "Ostriches can run faster than horses!";
                String fact = "";
                //randomly select a fact
                Random randomGenerator = new Random(); //construct a new random number generator
                int randomNumber = randomGenerator.nextInt(3);

                //if statement to convert randomNumber to fact
                //if randomNumber is 0
                if (randomNumber == 0)
                {
                    fact="ant stretch when they wake up in the morning";
                }

                else if (randomNumber == 1)
                {
                    fact="ostriches can run faster than horses";
                }

                else if (randomNumber == 2)
                {
                    fact="olympic gold medals are actually made mostly of silver";
                }

                else
                {
                    fact="sorry, there was an error";
                }

                //update the label with our dynamic fact
                factLabelZ.setText(fact);

            };
        };
        showFactButtonZ.setOnClickListener(listener);


        //Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        //setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_fun_facts, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
