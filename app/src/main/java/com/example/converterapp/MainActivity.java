package com.example.converterapp;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    //Declaring widgetsEditText editText;
    TextView textView,textView2,valueinCM,editText;
    View button;


    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Instantiate Widget

        textView =findViewById(R.id.textView);
        textView2 =findViewById(R.id.textView2);
        editText = findViewById(R.id.editText);
        valueinCM =findViewById(R.id.valueInCM);
        button=findViewById(R.id.button);

        // Adding A Click event for button (Executing the convert method when clicked
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Calling ConvertFromCMToMetres

                ConvertFromMetresToCM();
                {

                }
            }



        });
    }

    @SuppressLint("SetTextI18n")
    private void ConvertFromMetresToCM() {
        //Convert Values entered in editText
        //From Metres to CentiMetres

        String valueInMetres = editText.getText().toString();

        //Convert string to Number
        double Metres= Double.parseDouble(valueInMetres);

        //Convert Number to Metres
        double CentiMetres= Metres*100;

        //Display the results

        valueinCM.setText(" " + CentiMetres);

    }



}