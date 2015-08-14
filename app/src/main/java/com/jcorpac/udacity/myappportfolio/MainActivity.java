package com.jcorpac.udacity.myappportfolio;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /*
        Button btnMovies = (Button) findViewById(R.id.btnMovies);
        Button btnScores = (Button) findViewById(R.id.btnScores);
        Button btnLibrary = (Button) findViewById(R.id.btnLibrary);
        Button btnBuildItBigger = (Button) findViewById(R.id.btnBuildItBigger);
        Button btnXYZReader = (Button) findViewById(R.id.btnXYZReader);
        Button btnCapstone = (Button) findViewById(R.id.btnCapstone);
        */
    }

    public void onClickedMovies(View view) {
        makeToast("What movies are playing? - Coming soon", false);
    }

    public void onClickedScores(View view) {
        makeToast("Yay, Sportsball! - Coming soon", false);
    }

    public void onClickedLibrary(View view) {
        makeToast("Shh! It's a Library! - Coming soon", false);
    }

    public void onClickedBuildItBigger(View view) {
        makeToast("Bigger and Better! - Coming soon", false);
    }

    public void onClickedReader(View view) {
        makeToast("XYZ, easy as ABC? - Coming soon", false);
    }

    public void onClickedCapstone(View view) {
        makeToast("I'm wondering what it'll be too. - Coming soon", false);
    }

    private void makeToast(String message, boolean isLong) {
        Toast.makeText(getApplicationContext(), message, isLong? Toast.LENGTH_LONG:Toast.LENGTH_SHORT).show();
    }
}
