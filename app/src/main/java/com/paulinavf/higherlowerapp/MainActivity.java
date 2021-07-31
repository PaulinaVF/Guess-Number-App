package com.paulinavf.higherlowerapp;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends Activity {

    int myNumber;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Random rand = new Random();
        myNumber = rand.nextInt(20)+1;
    }

    public void makeToast(String string){
        Toast.makeText(MainActivity.this, string, Toast.LENGTH_SHORT).show();
    }

    public void guessedCheck (View view){
        EditText edt_toGuess = (EditText) findViewById(R.id.edtNumber);
        String str_toGuess = edt_toGuess.getText().toString();
        int toGuess = Integer.parseInt(str_toGuess);
        if(toGuess==myNumber){
            makeToast("You guessed it!");
            Random rand = new Random();
            myNumber = rand.nextInt(20)+1;
        }else if(toGuess<myNumber){
            makeToast("Higher!");
        }else{
            makeToast("Lower!");
        }
    }
}