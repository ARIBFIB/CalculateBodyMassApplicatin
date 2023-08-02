package com.example.calculatebodymassapplicatin;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    Button button01;

    EditText editText01_weight, editText02_height, editText03_inches, editText04_result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button01 = findViewById(R.id.button);

        editText02_height = findViewById(R.id.et_height);
        editText03_inches = findViewById(R.id.et_inches);
        editText01_weight = findViewById(R.id.et_weight);

        editText04_result = findViewById(R.id.et_result);

        button01.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                {
                    // Get weight and height from EditText fields
                    String weightStr = editText01_weight.getText().toString();
                    String heightStr = editText02_height.getText().toString();

                    if (weightStr.isEmpty() || heightStr.isEmpty()) {
                        editText04_result.setText("Please enter your weight and height.");
                        return;
                    }

                    // Convert weight and height strings to float values
                    float weight = Float.parseFloat(weightStr);
                    float height = Float.parseFloat(heightStr) / 100; // Convert height to meters

                    // Calculate BMI
                    float bmi = weight / (height * height);

                    // Display the result
                    String resultText = "Your BMI: " + String.format("%.2f", bmi);
                    editText04_result.setText(resultText);
                }
            }
        });







    }
}







