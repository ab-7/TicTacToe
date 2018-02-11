package com.example.adrija.tic_tac_toe;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;

/**
 * Created by Adrija on 31-01-2018.
 */

public class AboutUs extends AppCompatActivity{

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);
        ImageButton fb = (ImageButton)findViewById(R.id.facebook);
        ImageButton twitter = (ImageButton)findViewById(R.id.twitter);

        fb.setOnClickListener(
                new ImageButton.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent browseFb = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.facebook.com/adrija.bhowmik.1"));
                        startActivity(browseFb);
                    }
                });

        twitter.setOnClickListener(
                new ImageButton.OnClickListener()
                {
                    @Override
                    public void onClick(View v) {
                        Intent browseTwitter = new Intent(Intent.ACTION_VIEW, Uri.parse("https://twitter.com/Adrija71411"));
                        startActivity(browseTwitter);
                    }
                });
    }
}
