package com.example.assignment1;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;


public class Product_Ordering_Activity extends AppCompatActivity {

    ArrayList<String> flavors = new ArrayList<String>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.product_ordering);
        ImageView imageview = (ImageView) findViewById(R.id.logo);
        imageview.setImageAlpha(100);
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