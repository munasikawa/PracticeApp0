package com.pensievedesigns.practiceapp0;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    // When Ahoy button is clicked, to show Log info and Toast
    public void clickAhoyBtn(View v){
        EditText myTextField = findViewById(R.id.myTextField);

        Log.i("Info", myTextField.getText().toString());

        Toast.makeText(this, myTextField.getText().toString(),
                Toast.LENGTH_LONG).show();


    }
}
