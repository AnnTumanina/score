package com.example.score;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int mools=0;
    int hamsters=0;

    public void onClickScoreMools(View view) {
        mools++;
        TextView textViewMools = findViewById(R.id.scoreMools);
        textViewMools.setText(mools);
    }

    public void onClickScoreHamsters(View view) {
        hamsters++;
        TextView textViewHamsters = findViewById(R.id.scoreHamsters);
        textViewHamsters.setText(hamsters);
    }

    public void onClickDrop(View view){
        mools = 0;
        hamsters = 0;
        TextView textViewMools = findViewById(R.id.scoreMools);
        TextView textViewHamsters = findViewById(R.id.scoreHamsters);
        textViewMools.setText(mools);
        textViewHamsters.setText(hamsters);
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (savedInstanceState != null && savedInstanceState.containsKey("mools")
                && savedInstanceState.containsKey("hamsters")) {
            mools = savedInstanceState.getInt("mools");
            hamsters = savedInstanceState.getInt("hamsters");

        }
        setContentView(R.layout.activity_main);
        TextView textViewMools = findViewById(R.id.scoreMools);
        textViewMools.setText(mools);
        TextView textViewHamsters = findViewById(R.id.scoreHamsters);
        textViewHamsters.setText(hamsters);
    }
    @Override
    protected void onSaveInstanceState(Bundle outState)
    {
        super.onSaveInstanceState(outState);
        outState.putInt("mools", mools);
        outState.putInt("hamsters", hamsters);
    }




}