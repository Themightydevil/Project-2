package com.example.project2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    final int POINTS_SIX = 6; // Constant for value of 6.
    final int POINTS_FOUR = 4; // Constant for value of 4.
    final int POINT_ONE = 1; // Constant for value of 1.
    int totalScoreA = 0; // Global variable to save the score for Team A.
    int totalScoreB = 0; // Global variable to save the score for Team B.
    int oversForTeamA = 0; // Global variable to save the overs for Team A.
    int oversForTeamB = 0; // Global variable to save the overs for Team B.

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        teamAScore(totalScoreA);
        teamBScore(totalScoreB);
    }

    /**
     * Display points for Team A
     */
    public void teamAScore(int score) {
        TextView scoreView = findViewById(R.id.team1Score);
        scoreView.setText(String.valueOf(score));
        totalScoreA = score;

    }

    /**
     * Add 6 points to Team A
     */
    public void sixRunsTeamA(View view) {
        totalScoreA = totalScoreA + POINTS_SIX;
        teamAScore(totalScoreA);
    }

    /**
     * Add 4 points to Team A
     */
    public void fourRunsTeamA(View view) {
        totalScoreA = totalScoreA + POINTS_FOUR;
        teamAScore(totalScoreA);
    }

    /**
     * Add 1 point to Team A
     */
    public void oneRunTeamA(View view) {
        totalScoreA = totalScoreA + POINT_ONE;
        teamAScore(totalScoreA);
    }

    /**
     * Display points for Team B
     */
    public void teamBScore(int score) {
        TextView scoreView = findViewById(R.id.team2Score);
        scoreView.setText(String.valueOf(score));
        totalScoreB = score;

    }

    /**
     * Add 6 points to Team B
     */
    public void sixRunsTeamB(View view) {
        totalScoreB = totalScoreB + POINTS_SIX;
        teamBScore(totalScoreB);
    }

    /**
     * Add 4 points to Team B
     */
    public void fourRunsTeamB(View view) {
        totalScoreB = totalScoreB + POINTS_FOUR;
        teamBScore(totalScoreB);
    }

    /**
     * Add 1 point to Team B
     */
    public void oneRunTeamB(View view) {
        totalScoreB = totalScoreB + POINT_ONE;
        teamBScore(totalScoreB);
    }

    /**
     * Resets the score and overs to 0 for both the teams
     */
    public void resetScore(View view) {
        totalScoreA = 0;
        totalScoreB = 0;
        oversForTeamA = 0;
        oversForTeamB = 0;
        teamAScore(totalScoreA);
        teamBScore(totalScoreB);
        teamAOvers(oversForTeamA);
        teamBOvers(oversForTeamB);
    }

    // Displays the overs for team A.
    public void teamAOvers(int over) {
        TextView overView = findViewById(R.id.team1overs);
        overView.setText(String.valueOf(over));
        oversForTeamA = over;

    }

    // Adds 1 to over.
    public void overOneTeamA(View view) {
        oversForTeamA = oversForTeamA + POINT_ONE;
        teamAOvers(oversForTeamA);
    }

    // Displays the overs for team B.
    public void teamBOvers(int over) {
        TextView overView = findViewById(R.id.team2overs);
        overView.setText(String.valueOf(over));
        oversForTeamB = over;

    }


    // Adds 1 to over.
    public void overOneTeamB(View view) {
        oversForTeamB = oversForTeamB + POINT_ONE;
        teamBOvers(oversForTeamB);
    }
}
