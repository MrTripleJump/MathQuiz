package edu.desu.mathquiz;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    int answer = 9;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * This method is called when submit answer button is clicked
     */
    public void submit (View view) {
        EditText myAnswer = (EditText) findViewById(R.id.myAnswer);
        int number= Integer.parseInt(myAnswer.getText().toString());

        if (number == 9){
            Toast.makeText(MainActivity.this, "Correct!", Toast.LENGTH_SHORT).show();
            return;
        }
        else{
            Toast.makeText(MainActivity.this, "Try Again", Toast.LENGTH_SHORT).show();
        }
    }

}
