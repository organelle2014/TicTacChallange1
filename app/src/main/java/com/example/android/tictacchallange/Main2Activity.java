package com.example.android.tictacchallange;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity implements View.OnClickListener {

    //initialize all buttons
    //this is the next and back button
    private Button back;
    //the play button intstances

    private Button play [][]= new Button[5][5];
    /*
    Each player has a chance to plat. Therfore if player A is not playing then player B is playing.
    The if aspect in this case implies that we have a boolean data type.
    */
    private boolean player_a=true;
    private boolean player_b=true;
    //Each player has an equal chance to play the game in this case. Therefore we should equally have a variable that would help in counting this.
    private int countTurn;
    //equally, the scores need to be calculated and stored in a variable for both A and B
    private int player_a_score;
    private int player_b_score;
    //The views will equally have a variable to store data as well.
    private TextView player_a_view,player_b_view;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
              //creating instances for the views
        player_a_view=findViewById(R.id.player_a);
        player_b_view=findViewById(R.id.player_b);
                      /*
        This is the array structure that needs to be implemented in a 5 by 5 game play
        [][][][][]
        [][][][][]
        [][][][][]
        [][][][][]
        [][][][][]

        */
        //working on the array list
        for(int i=0;i<5; i++){
            for(int j=0;j<5;j++){
                //we populate all the arrays of each button.
                String buttonID="button_"+ i + j;
                //then we use a resource locator ID
                int resID=getResources().getIdentifier(buttonID,"id",getPackageName());
                play[i][j]=findViewById(resID);

                //then we implement the action listiner when each button is clicked
                //play[i][j].setOnClickListener(this);
            }
            //After each play, there is need to reset the game.
            Button clearButton=findViewById(R.id.btn_clear);
            clearButton.setOnClickListener(new View.OnClickListener() {

                //implements Clear on the game
                @Override
                public void onClick(View view) {

                }
            });
        }
        // Locate the button
        Button back =findViewById(R.id.btn_back);
        // Capture button clicks
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Main2Activity.this, MainActivity.class);
                startActivity(intent);
            }
        });

    }

    //implements the onCLick for the game buttons
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
        //counts the number of times each player does
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

    //a boolean method because of the If aspect above
    private boolean winnerCheck(){
        String winner[][] = new String[5][5];

        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                winner[i][j] = play[i][j].getText().toString();
            }
        }
        //coloumn check for winnder
        for (int i = 0; i < 5; i++) {
            if (winner[i][0].equals(winner[i][1])
                    &&(winner[i][0].equals(winner[i][2]))
                    &&!winner[i][0].equals("")) {
                return true;

            }
        }
        //row check for a winner
        for (int i = 0; i < 5; i++) {
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
    private void player_a_wins(){}
    private void player_b_wins(){}
    private void isaDraw(){}
}
