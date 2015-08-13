package com.jcorpac.udacity.myappportfolio;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnSpotify = (Button) findViewById(R.id.btnSpotify);
        btnSpotify.setOnClickListener(mClickedListener);

        Button btnScores = (Button) findViewById(R.id.btnScores);
        btnScores.setOnClickListener(mClickedListener);

        Button btnLibrary = (Button) findViewById(R.id.btnLibrary);
        btnLibrary.setOnClickListener(mClickedListener);

        Button btnBuildItBigger = (Button) findViewById(R.id.btnBuildItBigger);
        btnBuildItBigger.setOnClickListener(mClickedListener);

        Button btnXYZReader = (Button) findViewById(R.id.btnXYZReader);
        btnXYZReader.setOnClickListener(mClickedListener);

        Button btnCapstone = (Button) findViewById(R.id.btnCapstone);
        btnCapstone.setOnClickListener(mClickedListener);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
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

    private OnClickListener mClickedListener = new OnClickListener() {
        @Override
        public void onClick(View v) {
            switch (v.getId()) {
                case R.id.btnSpotify: onClickedSpotify(); break;
                case R.id.btnScores: onClickedScores(); break;
                case R.id.btnLibrary: onClickedLibrary(); break;
                case R.id.btnBuildItBigger: onClickedBuildItBigger(); break;
                case R.id.btnXYZReader: onClickedReader(); break;
                case R.id.btnCapstone: onClickedCapstone(); break;
                default:
                    Toast.makeText(getApplicationContext(), "Okay, how'd you do that?!", Toast.LENGTH_SHORT).show();
                    break;
            }
        }

        protected void onClickedSpotify() {
            Toast.makeText(getApplicationContext(), "Let's play some music! - Coming soon", Toast.LENGTH_SHORT).show();
        }

        protected void onClickedScores() {
            Toast.makeText(getApplicationContext(), "Yay, Sportsball! - Coming soon", Toast.LENGTH_SHORT).show();
        }

        protected void onClickedLibrary() {
            Toast.makeText(getApplicationContext(), "Shh! It's a Library! - Coming soon", Toast.LENGTH_SHORT).show();
        }

        protected void onClickedBuildItBigger() {
            Toast.makeText(getApplicationContext(), "Bigger and Better! - Coming soon", Toast.LENGTH_SHORT).show();
        }

        protected void onClickedReader() {
            Toast.makeText(getApplicationContext(), "XYZ, easy as ABC? - Coming soon", Toast.LENGTH_SHORT).show();
        }

        protected void onClickedCapstone() {
            Toast.makeText(getApplicationContext(), "I'm wondering what it'll be too. - Coming soon", Toast.LENGTH_SHORT).show();
        }

    };
}
