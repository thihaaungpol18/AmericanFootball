package com.example.android.americanfootball;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int initialGoalA = 0;
    int initialGoalB = 0;
    int playersInA = 11;
    int playersInB = 11;
    int initialYellowA = 0;
    int initialRedA = 0;
    int initialYellowB = 0;
    int initialRedB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    //A goal add for Team A(Man Utd)
    public void goalForA(View view) {
        TextView goalsA = findViewById(R.id.goalsA);
        initialGoalA = initialGoalA + 1;
        goalsA.setText("Goals : " + initialGoalA);
    }

    //Show a yellow card to team B
    public void yellowCardA(View v) {
        initialYellowA = initialYellowA + 1;
        TextView yellowCardsInA = findViewById(R.id.yellow_cardA);
        yellowCardsInA.setText("Yellow Card : " + initialYellowA);
    }

    public void redCardA(View v) {
        initialRedA = initialRedA + 1;
        playersInA = playersInA - 1;
        TextView redCardInA = findViewById(R.id.red_CardA);
        TextView playersLeft = findViewById(R.id.playersInA);
        redCardInA.setText("Red Cards: " + initialRedA);
        playersLeft.setText("Players: " + playersInA);
    }

    //A goal add for Team B(Man City)
    public void goalForB(View view) {
        TextView goalsB = findViewById(R.id.goalsB);
        initialGoalB = initialGoalB + 1;
        goalsB.setText("Goals : " + initialGoalB);
    }

    //Show a yellow card to team B
    public void yellowCardB(View v) {
        initialYellowB = initialYellowB + 1;
        TextView yellowCardsInB = findViewById(R.id.yellow_cardB);
        yellowCardsInB.setText("Yellow Card : " + initialYellowB);
    }

    public void redCardB(View v) {
        initialRedB = initialRedB + 1;
        playersInB = playersInB - 1;
        TextView redCardInA = findViewById(R.id.red_CardB);
        TextView playersLeft = findViewById(R.id.playersInB);
        redCardInA.setText("Red Cards: " + initialRedB);
        playersLeft.setText("Players: " + playersInB);
    }

    public void resetButton(View view) {
        TextView goalsA = findViewById(R.id.goalsA);
        TextView goalsB = findViewById(R.id.goalsB);
        TextView yellowCardsInA = findViewById(R.id.yellow_cardA);
        TextView yellowCardsInB = findViewById(R.id.yellow_cardB);
        TextView redCardInA = findViewById(R.id.red_CardA);
        TextView playersLeftA = findViewById(R.id.playersInA);
        TextView redCardInB = findViewById(R.id.red_CardB);
        TextView playersLeftB = findViewById(R.id.playersInB);

        initialGoalA = 0;
        initialGoalB = 0;
        initialYellowA = 0;
        initialYellowB = 0;
        initialRedA = 0;
        initialRedB = 0;
        playersInA = 11;
        playersInB = 11;

        goalsA.setText("Goals : " + initialGoalA);
        goalsB.setText("Goals : " + initialGoalB);
        yellowCardsInA.setText("Yellow Cards:" + initialYellowA);
        yellowCardsInB.setText("Yellow Cards:" + initialYellowB);
        redCardInA.setText("Red Cars:" + initialRedA);
        playersLeftA.setText("Players:" + playersInA);
        redCardInB.setText("Red Cars:" + initialRedB);
        playersLeftB.setText("Players:" + playersInB);


    }

}
