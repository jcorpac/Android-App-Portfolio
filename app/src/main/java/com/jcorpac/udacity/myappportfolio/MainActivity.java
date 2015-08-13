package com.jcorpac.udacity.myappportfolio;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnSpotify = (Button) findViewById(R.id.btnSpotify);
        Button btnScores = (Button) findViewById(R.id.btnScores);
        Button btnLibrary = (Button) findViewById(R.id.btnLibrary);
        Button btnBuildItBigger = (Button) findViewById(R.id.btnBuildItBigger);
        Button btnXYZReader = (Button) findViewById(R.id.btnXYZReader);
        Button btnCapstone = (Button) findViewById(R.id.btnCapstone);
    }

    public void onClickedSpotify(View view) {
        makeToast("Let's play some music! - Coming soon");
    }

    public void onClickedScores(View view) {
        makeToast("Yay, Sportsball! - Coming soon");
    }

    public void onClickedLibrary(View view) {
        makeToast("Shh! It's a Library! - Coming soon");
    }

    public void onClickedBuildItBigger(View view) {
        makeToast("Bigger and Better! - Coming soon");
    }

    public void onClickedReader(View view) {
        makeToast("XYZ, easy as ABC? - Coming soon");
    }

    public void onClickedCapstone(View view) {
        makeToast("I'm wondering what it'll be too. - Coming soon");
    }

    private void makeToast(String message) {
        Toast.makeText(getApplicationContext(), message, Toast.LENGTH_SHORT).show();
    }
}
