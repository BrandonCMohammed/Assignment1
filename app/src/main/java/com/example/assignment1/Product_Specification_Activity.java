package com.example.assignment1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class Product_Specification_Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_product_specification_activiy);
    }

    public void goBack(View view){

        Intent intent = new Intent(this, Product_Ordering_Activity.class);
        startActivity(intent);
    }

    public void configureOrder(View view){
        Intent intent= new Intent(this, Product_Ordering_Activity.class);
        startActivity(intent);
    }
}