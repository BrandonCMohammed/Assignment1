package com.example.assignment1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.ToggleButton;

public class Product_Specification_Activity extends AppCompatActivity {

    public static final String productChoice = "Product";
    String product = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_product_specification_activiy);

        ImageView imageview = (ImageView) findViewById(R.id.logo);
        imageview.setImageAlpha(100);

        Intent intent = getIntent();
        TextView textview = (TextView) findViewById(R.id.Choice);
        product = intent.getStringExtra(productChoice) + "\n";
        textview.setText(product);
    }

    public void goBack(View view){

        Intent intent = new Intent(this, Product_Ordering_Activity.class);
        startActivity(intent);
    }

    public void addItem(View view){

        RadioGroup radioGroup = (RadioGroup) findViewById(R.id.radioGroupRolls);
        int id = radioGroup.getCheckedRadioButtonId();
        String choice = "";
        String toggleButtonOption = "";
        String toSendBack = " ";

        RadioButton radioButton = findViewById(id);
        switch (id){

            case R.id.chocSyrup:
                choice = radioButton.getText().toString();
                break;
            case R.id.caramelSyrup:
                choice = radioButton.getText().toString();
                break;
            case R.id.StrawberrySyrup:
                choice = radioButton.getText().toString();
                break;
        }

        ToggleButton toggleButton = (ToggleButton) findViewById(R.id.amount);
        boolean toggle = toggleButton.isChecked();

        if(toggle){
            toggleButtonOption = toggleButton.getText().toString();
        }



        Intent intent = new Intent(this, Product_Ordering_Activity.class);
        toSendBack = product + " " + choice + "\n" + toggleButtonOption;
        intent.putExtra(Product_Ordering_Activity.specifications,toSendBack);
        startActivity(intent);


    }
}