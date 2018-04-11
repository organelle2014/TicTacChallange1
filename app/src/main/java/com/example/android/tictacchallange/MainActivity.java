package com.example.android.tictacchallange;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    //array declaration is done here

    /*
        [00][01][01]
        [01][11][12]
        [02][22][23]
    */

    private Button[][] play = new Button[3][3];
    //a boolean data type for the players.
    private boolean player_a = true;
    private boolean player_b = true;

    //the number of turns each player has played
    private int countTurn;

    //data type to store the scores
    private int player_a_score, player_b_score;

    //for the text views where the scored will be displayed after the game ends
    private TextView player_a_view, player_b_view;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Locate the button
        Button act2 =findViewById(R.id.act_2);
        Button act3 =findViewById(R.id.act_3);
        Button act4 =findViewById(R.id.act_4);
        // Capture button clicks
        act2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, Main2Activity.class);
                startActivity(intent);
            }
        });
        act3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, Main3Activity.class);
                startActivity(intent);
            }
        });
        act4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, Main4Activity.class);
                startActivity(intent);
            }
        });

        //we have to reference our text view once the onCreate is loaded
        player_a_view = findViewById(R.id.player_a);
        player_b_view = findViewById(R.id.player_b);

        //we then assign references to the arrays declared above
        /*
        [00][01][01]
        [01][11][12]
        [02][22][23]
        */

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {

                //this will populate the arrays under each button that we created.
                String buttonID = "button_" + i + j;
                //resource IDs locator i.e. find view by ID
                int resID = getResources().getIdentifier(buttonID, "id", getPackageName());
                play[i][j] = findViewById(resID);

                //this implements the onlclick listener in ths class
               // play[i][j].setOnClickListener(this);
            }

            //the rest button function and onlick listener begins at this point
            Button clearButton = findViewById(R.id.btn_clear);
            clearButton.setOnClickListener(new View.OnClickListener() {

                //the clear method
                @Override
                public void onClick(View view) {

                }
            });

        }

    }

    //the onclick method implements this line play[i][j].setOnClickListener(this);
    @Override
    public void onClick(View view) {

        //if the button is not equal to an empty string ....
        if (!((Button) view).getText().toString().equals("")) {
            return;
        }
        if (player_a) {
            ((Button) view).setText("X");
        } else {
            ((Button) view).setText("O");
        }
        countTurn++;

        if(winnerCheck()){
            if(player_a){
                player_a_wins();
            }else {
                player_b_wins();
            }
        }else if (countTurn==9){
           isaDraw();
        }else {
            player_a=!player_a;
        }
    }

    //then check is there is a winner in the game
    private boolean winnerCheck() {
        String winner[][] = new String[3][3];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                winner[i][j] = play[i][j].getText().toString();
            }
        }
        //coloumn check for winnder
        for (int i = 0; i < 3; i++) {
            if (winner[i][0].equals(winner[i][1])
                    &&(winner[i][0].equals(winner[i][2]))
                    &&!winner[i][0].equals("")) {
                return true;

            }
        }
        //row check for a winner
        for (int i = 0; i < 3; i++) {
            if (winner[0][i].equals(winner[1][i])
                    &&(winner[0][i].equals(winner[2][i]))
                    &&!winner[0][i].equals("")) {
                return true;
            }
        }

        if (winner[0][0].equals(winner[1][1])
                &&(winner[0][0].equals(winner[2][1]))
                &&!winner[0][0].equals("")) {
            return true;
        }
        if (winner[0][2].equals(winner[1][1])
                &&(winner[0][2].equals(winner[2][0]))
                &&!winner[0][2].equals("")) {
            return true;
        }

        return false;
    }
    private void player_a_wins(){
        player_a_score ++;
        Toast.makeText(this,"Player A has won!",Toast.LENGTH_LONG).show();

        //show the score on the screen
        updateScores();
        //then reset the entire game view
        resetBoard();

    }
    private void player_b_wins(){
        player_b_score ++;
        Toast.makeText(this,"Player B has won!",Toast.LENGTH_LONG).show();

        //show the score on the screen
        updateScores();
        //then reset the entire game view
        resetBoard();

    }
    private void isaDraw(){
        Toast.makeText(this,"Is a Draw!",Toast.LENGTH_LONG).show();
        resetBoard();

    }
    private void updateScores(){
        player_a_view.setText("A:"+ player_a_score);
        player_b_view.setText("B:"+ player_b_score);
    }

    private void resetBoard() {
        for (int i = 0; i < 3; i++){
            for (int j = 0; j < 3; j++){
                play[i][j].setText("");
            }
        }
        countTurn=0;
        player_a=true;
    }
}