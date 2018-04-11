package com.example.android.tictacchallange;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Main4Activity extends AppCompatActivity implements View.OnClickListener {

    private Button nextButton, clearButton ;
    private Button btn_1, btn_2, btn_3, btn_4, btn_5, btn_6, btn_7,btn_8, btn_9, btn_10, btn_11, btn_12, btn_13, btn_14, btn_15, btn_16, btn_17,btn_18, btn_19, btn_20,btn_21, btn_22, btn_23, btn_24, btn_25;
    //each player has an equal chance of playing the game
    int chance=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);

        //locate the button
        nextButton=findViewById(R.id.btn_next);
        clearButton=findViewById(R.id.btn_clear);


        //locate all the 6 buttons

        btn_1=findViewById(R.id.btnbtn_1);
        btn_2=findViewById(R.id.btnbtn_2);
        btn_3=findViewById(R.id.btnbtn_3);
        btn_4=findViewById(R.id.btnbtn_4);
        btn_5=findViewById(R.id.btnbtn_5);
        btn_6=findViewById(R.id.btnbtn_6);
        btn_7=findViewById(R.id.btnbtn_7);
        btn_8=findViewById(R.id.btnbtn_8);
        btn_9=findViewById(R.id.btnbtn_9);
        btn_10=findViewById(R.id.btnbtn_10);
        btn_10=findViewById(R.id.btnbtn_11);
        btn_12=findViewById(R.id.btnbtn_12);
        btn_13=findViewById(R.id.btnbtn_13);
        btn_14=findViewById(R.id.btnbtn_14);
        btn_15=findViewById(R.id.btnbtn_15);
        btn_16=findViewById(R.id.btnbtn_16);
        btn_17=findViewById(R.id.btnbtn_17);
        btn_18=findViewById(R.id.btnbtn_18);
        btn_19=findViewById(R.id.btnbtn_19);
        btn_21=findViewById(R.id.btnbtn_21);
        btn_20=findViewById(R.id.btnbtn_20);
        btn_22=findViewById(R.id.btnbtn_22);
        btn_23=findViewById(R.id.btnbtn_23);
        btn_24=findViewById(R.id.btnbtn_24);
        btn_25=findViewById(R.id.btnbtn_25);


        //setting an onClick Listeer for each button
        btn_1.setOnClickListener(this);
        btn_2.setOnClickListener(this);
        btn_3.setOnClickListener(this);
        btn_4.setOnClickListener(this);
        btn_5.setOnClickListener(this);
        btn_6.setOnClickListener(this);
        btn_7.setOnClickListener(this);
        btn_8.setOnClickListener(this);
        btn_9.setOnClickListener(this);
        btn_10.setOnClickListener(this);
        btn_11.setOnClickListener(this);
        btn_12.setOnClickListener(this);
        btn_13.setOnClickListener(this);
        btn_14.setOnClickListener(this);
        btn_15.setOnClickListener(this);
        btn_16.setOnClickListener(this);
        btn_17.setOnClickListener(this);
        btn_18.setOnClickListener(this);
        btn_19.setOnClickListener(this);
        btn_21.setOnClickListener(this);
        btn_20.setOnClickListener(this);
        btn_22.setOnClickListener(this);
        btn_23.setOnClickListener(this);
        btn_24.setOnClickListener(this);
        btn_25.setOnClickListener(this);

        //capture the button On Click
        nextButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Main4Activity.this, MainActivity.class);
                startActivity(intent);
            }
        });
        //though unethical, the clear button in both one user 3 by 3 and 5 by 5 reopen the activity as a way of resetting the buttons
        clearButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Main4Activity.this, Main4Activity.class);
                startActivity(intent);
            }
        });

    }

    //the main class implements this onCLik when the game is being played
    @Override
    public void onClick(View view) {

        //we have to collect the scores when the game is being played in the fist place.

        //Step 1: we have to get the ID of the first button to the last one (25 buttons)
        switch (view.getId()){
            case R.id.btnbtn_1:
                //what happens when the first button is clicked for the first time?
                if(btn_1.getText().toString().equals("")){
                    //the chance is at zero. The player has only one chance to click it.
                    if(chance==0){
                        //if chance is zero it means that the button has not been used therefore, the game lables a zero
                        chance=1;
                        //you can use the button once
                        scoreResults();
                    }else{
                        chance=1;
                        //X is used meaning the button has already been used
                        btn_1.setText("X");
                        scoreResults();
                    }
                }
                //the same applies to all the buttons i.e. same process same procedure.
                break;
            case R.id.btnbtn_2:
                if(btn_2.getText().toString().equals("")){
                    if(chance==0){

                        chance=1;
                        btn_2.setText("0");
                        scoreResults();
                    }else {

                        chance=1;
                        btn_2.setText("X");
                        scoreResults();
                    }
                }

                break;
            case R.id.btnbtn_3:
                if(btn_3.getText().toString().equals("")){
                    if(chance==0){

                        chance=1;
                        btn_3.setText("0");
                        scoreResults();
                    }else {

                        chance=1;
                        btn_3.setText("X");
                        scoreResults();
                    }
                }

                break;
            case R.id.btnbtn_4:
                if(btn_4.getText().toString().equals("")){
                    if(chance==0){

                        chance=1;
                        btn_4.setText("0");
                        scoreResults();
                    }else {

                        chance=1;
                        btn_4.setText("X");
                        scoreResults();
                    }
                }

                break;
            case R.id.btnbtn_5:
                if(btn_5.getText().toString().equals("")){
                    if(chance==0){

                        chance=1;
                        btn_5.setText("0");
                        scoreResults();
                    }else {

                        chance=1;
                        btn_5.setText("X");
                        scoreResults();
                    }
                }

                break;
            case R.id.btnbtn_6:
                if(btn_6.getText().toString().equals("")){
                    if(chance==0){

                        chance=1;
                        btn_6.setText("0");
                        scoreResults();
                    }else {

                        chance=1;
                        btn_6.setText("X");
                        scoreResults();
                    }
                }

                break;
            case R.id.btnbtn_7:
                if(btn_7.getText().toString().equals("")){
                    if(chance==0){

                        chance=1;
                        btn_7.setText("0");
                        scoreResults();
                    }else {

                        chance=1;
                        btn_7.setText("X");
                        scoreResults();
                    }
                }

                break;
            case R.id.btnbtn_8:
                if(btn_8.getText().toString().equals("")){
                    if(chance==0){

                        chance=1;
                        btn_8.setText("0");
                        scoreResults();
                    }else {

                        chance=1;
                        btn_8.setText("X");
                        scoreResults();
                    }
                }

                break;
            case R.id.btnbtn_9:
                if(btn_9.getText().toString().equals("")){
                    if(chance==0){

                        chance=1;
                        btn_9.setText("0");
                        scoreResults();
                    }else {

                        chance=1;
                        btn_9.setText("X");
                        scoreResults();
                    }
                }
            case R.id.btnbtn_10:
                if(btn_2.getText().toString().equals("")){
                    if(chance==0){

                        chance=1;
                        btn_10.setText("0");
                        scoreResults();
                    }else {

                        chance=1;
                        btn_10.setText("X");
                        scoreResults();
                    }
                }

                break;
            case R.id.btnbtn_11:
                if(btn_3.getText().toString().equals("")){
                    if(chance==0){

                        chance=1;
                        btn_11.setText("0");
                        scoreResults();
                    }else {

                        chance=1;
                        btn_3.setText("X");
                        scoreResults();
                    }
                }

                break;
            case R.id.btnbtn_12:
                if(btn_12.getText().toString().equals("")){
                    if(chance==0){

                        chance=1;
                        btn_12.setText("0");
                        scoreResults();
                    }else {

                        chance=1;
                        btn_12.setText("X");
                        scoreResults();
                    }
                }

                break;
            case R.id.btnbtn_13:
                if(btn_13.getText().toString().equals("")){
                    if(chance==0){

                        chance=1;
                        btn_13.setText("0");
                        scoreResults();
                    }else {

                        chance=1;
                        btn_13.setText("X");
                        scoreResults();
                    }
                }

                break;
            case R.id.btnbtn_14:
                if(btn_14.getText().toString().equals("")){
                    if(chance==0){

                        chance=1;
                        btn_14.setText("0");
                        scoreResults();
                    }else {

                        chance=1;
                        btn_14.setText("X");
                        scoreResults();
                    }
                }

                break;
            case R.id.btnbtn_15:
                if(btn_15.getText().toString().equals("")){
                    if(chance==0){

                        chance=1;
                        btn_15.setText("0");
                        scoreResults();
                    }else {

                        chance=1;
                        btn_15.setText("X");
                        scoreResults();
                    }
                }

                break;
            case R.id.btnbtn_16:
                if(btn_16.getText().toString().equals("")){
                    if(chance==0){

                        chance=1;
                        btn_16.setText("0");
                        scoreResults();
                    }else {

                        chance=1;
                        btn_16.setText("X");
                        scoreResults();
                    }
                }

                break;
            case R.id.btnbtn_17:
                if(btn_17.getText().toString().equals("")){
                    if(chance==0){

                        chance=1;
                        btn_17.setText("0");
                        scoreResults();
                    }else {

                        chance=1;
                        btn_17.setText("X");
                        scoreResults();
                    }
                }
            case R.id.btnbtn_18:
                if(btn_18.getText().toString().equals("")){
                    if(chance==0){

                        chance=1;
                        btn_18.setText("0");
                        scoreResults();
                    }else {

                        chance=1;
                        btn_18.setText("X");
                        scoreResults();
                    }
                }

                break;
            case R.id.btnbtn_19:
                if(btn_19.getText().toString().equals("")){
                    if(chance==0){

                        chance=1;
                        btn_19.setText("0");
                        scoreResults();
                    }else {

                        chance=1;
                        btn_19.setText("X");
                        scoreResults();
                    }
                }

                break;
            case R.id.btnbtn_20:
                if(btn_20.getText().toString().equals("")){
                    if(chance==0){

                        chance=1;
                        btn_20.setText("0");
                        scoreResults();
                    }else {

                        chance=1;
                        btn_20.setText("X");
                        scoreResults();
                    }
                }

                break;
            case R.id.btnbtn_21:
                if(btn_21.getText().toString().equals("")){
                    if(chance==0){

                        chance=1;
                        btn_21.setText("0");
                        scoreResults();
                    }else {

                        chance=1;
                        btn_21.setText("X");
                        scoreResults();
                    }
                }

                break;
            case R.id.btnbtn_22:
                if(btn_22.getText().toString().equals("")){
                    if(chance==0){

                        chance=1;
                        btn_22.setText("0");
                        scoreResults();
                    }else {

                        chance=1;
                        btn_22.setText("X");
                        scoreResults();
                    }
                }

                break;
            case R.id.btnbtn_23:
                if(btn_23.getText().toString().equals("")){
                    if(chance==0){

                        chance=1;
                        btn_23.setText("0");
                        scoreResults();
                    }else {

                        chance=1;
                        btn_23.setText("X");
                        scoreResults();
                    }
                }

                break;
            case R.id.btnbtn_24:
                if(btn_24.getText().toString().equals("")){
                    if(chance==0){

                        chance=1;
                        btn_24.setText("0");
                        scoreResults();
                    }else {

                        chance=1;
                        btn_24.setText("X");
                        scoreResults();
                    }
                }

                break;
            case R.id.btnbtn_25:
                if(btn_25.getText().toString().equals("")){
                    if(chance==0){

                        chance=1;
                        btn_25.setText("0");
                        scoreResults();
                    }else {

                        chance=1;
                        btn_25.setText("X");
                        scoreResults();
                    }
                }
        }


    }

    //this ,method awards scores as the game continues
    private void scoreResults() {
        if (btn_1.getText().toString().equals("X")
                &&btn_2.getText().toString().equals("X")
                &&btn_3.getText().toString().equals("X")){
            Toast.makeText(this,"Is a Win",Toast.LENGTH_SHORT).show();
        }else if (btn_4.getText().toString().equals("X")
                &&btn_5.getText().toString().equals("X")
                &&btn_6.getText().toString().equals("X")){
            Toast.makeText(this,"Is a Win",Toast.LENGTH_SHORT).show();
        }else if (btn_7.getText().toString().equals("X")
                &&btn_8.getText().toString().equals("X")
                &&btn_9.getText().toString().equals("X")){
            Toast.makeText(this,"Is a Win",Toast.LENGTH_SHORT).show();
        }else if (btn_1.getText().toString().equals("0")
                &&btn_2.getText().toString().equals("0")
                &&btn_3.getText().toString().equals("0")){
            Toast.makeText(this,"Is a Win",Toast.LENGTH_SHORT).show();
        }else if (btn_4.getText().toString().equals("0")
                &&btn_5.getText().toString().equals("0")
                &&btn_6.getText().toString().equals("0")){
            Toast.makeText(this,"Is a Win",Toast.LENGTH_SHORT).show();
        }else if (btn_7.getText().toString().equals("0")
                &&btn_8.getText().toString().equals("0")
                &&btn_9.getText().toString().equals("0")){
            Toast.makeText(this,"Is a Win",Toast.LENGTH_SHORT).show();
        }
    }
}
