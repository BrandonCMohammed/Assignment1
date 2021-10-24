package com.example.assignment1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class Complete_Activity_Order3 extends AppCompatActivity {

    public static final String CompleteOrders = "Complete";
    ArrayList<String> completeOrdersList = new ArrayList<String>();
    public static String productListingSting = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_complete_order3);

        if (getIntent() != null && getIntent().getExtras() != null) {
            Intent intent = getIntent();
            completeOrdersList = (ArrayList<String>) intent.getSerializableExtra(CompleteOrders);

            for(String a : completeOrdersList){
                productListingSting = productListingSting + a;
            }

            //  orderHistory= orderHistory + productListingSting + "\n \n";

            TextView textview = findViewById(R.id.textView2);
            textview.setText(productListingSting);

        }


    }
}