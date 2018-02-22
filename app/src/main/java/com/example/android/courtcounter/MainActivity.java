package com.example.android.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private int scoreTeamA= 0;
    private int scoreTeamB= 0;
    final static String STATE_SCORE_A="scoreTeamA";
    final static String STATE_SCORE_B="scoreTeamB";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        scoreTeamA = savedInstanceState.getInt(STATE_SCORE_A);
        scoreTeamB = savedInstanceState.getInt(STATE_SCORE_B);
        displayForTeamA(scoreTeamA);
        displayForTeamB(scoreTeamB);
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putInt(STATE_SCORE_A, scoreTeamA);
        outState.putInt(STATE_SCORE_B, scoreTeamB);
    }

    public void displayForTeamA(int score) {
        TextView scoreView = findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }


    public void showThreeA(View view){
        scoreTeamA += 3;
        displayForTeamA(scoreTeamA );
    }

    public void showTwoA(View view){
        scoreTeamA += 2;
        displayForTeamA(scoreTeamA );
    }

    public void showOneA(View view){
        scoreTeamA += 1;
        displayForTeamA(scoreTeamA );
    }

    public void displayForTeamB(int score) {
        TextView scoreView = findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }


    public void showThreeB(View view){
        scoreTeamB += 3;
        displayForTeamB(scoreTeamB );
    }

    public void showTwoB(View view){
        scoreTeamB += 2;
        displayForTeamB(scoreTeamB);
    }

    public void showOneB(View view){
        scoreTeamB += 1;
        displayForTeamB(scoreTeamB );
    }

    public void resetScore(View view){
        scoreTeamA=0;
        scoreTeamB=0;
        displayForTeamA(0);
        displayForTeamB (0);
    }
}
