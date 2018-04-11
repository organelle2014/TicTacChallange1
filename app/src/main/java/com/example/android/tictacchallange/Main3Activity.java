package com.example.android.tictacchallange;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Main3Activity extends AppCompatActivity implements View.OnClickListener {

    //variable declaration
    private Button nextButton, clearButton ;
    private Button btn_1, btn_2, btn_3, btn_4, btn_5, btn_6, btn_7,btn_8, btn_9;
    int chance=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

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

        //locate the button
        nextButton=findViewById(R.id.btn_next);
        //capture the button On Click
        nextButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Main3Activity.this, MainActivity.class);
                startActivity(intent);
            }
        });
        //though unethical, the clear button in both one user 3 by 3 reopen the activity as a way of resetting the buttons
        clearButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Main3Activity.this, Main3Activity.class);
                startActivity(intent);
            }
        });
    }

    //method that implements the on click of each button at the end of the day
    @Override
    public void onClick(View view) {

        switch (view.getId()){
            case R.id.btnbtn_1:
                if(btn_1.getText().toString().equals("")){
                    if(chance==0){

                        chance=1;
                        btn_1.setText("0");
                        scoreResults();
                    }else {

                        chance=1;
                        btn_1.setText("X");
                        scoreResults();
                    }
                }

                //button 2
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
        }
    }

    public void scoreResults(){
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
        }
    }
}
