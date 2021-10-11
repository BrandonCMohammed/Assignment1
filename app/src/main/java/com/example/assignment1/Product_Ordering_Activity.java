package com.example.assignment1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;


public class Product_Ordering_Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.product_ordering);
    }

    public void addItem(View view){
        TextView textview = (TextView) findViewById(R.id.ProductListing);
        textview.setText("Welcome Casidy");

    }

    public void completeOrder(View view){
        Intent intent = new Intent(this, Product_Specification_Activity.class);
        startActivity(intent);


    }

}