package com.example.assignment1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class Complete_Order_Activity2 extends AppCompatActivity {

    public static final String CompleteOrders = "Complete";
    ArrayList<String> completeOrdersList = new ArrayList<String>();
    public static String productListingSting = "";
    public String orderHistory= " ";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_complete_order2);

        ImageView imageview = (ImageView) findViewById(R.id.logo);
        imageview.setImageAlpha(60);


        if (getIntent() != null && getIntent().getExtras() != null) {
            Intent intent = getIntent();
            completeOrdersList = (ArrayList<String>) intent.getSerializableExtra(CompleteOrders);

            for(String a : completeOrdersList){
                productListingSting = productListingSting + a;
            }

            orderHistory= orderHistory + productListingSting + "\n \n";

            TextView textview = findViewById(R.id.textView2);
            textview.setText(productListingSting);

        }
    }

    public void sendOrder(View view)
    {
        Intent intent = new Intent();
        intent.setAction(Intent.ACTION_SEND);
        //intent.putExtra(Intent.EXTRA_TEXT, "Your order is:  \n" + completeOrdersList);
        intent.setType("text/plain");

        intent.setPackage("com.whatsapp");
        if (intent.resolveActivity(getPackageManager()) == null) {
            Toast.makeText(this, "Please install whatsapp first.", Toast.LENGTH_SHORT).show();
            return;
        }
        // Starting Whatsapp
        startActivity(intent);
    }

    public void displayOrder(View view)
    {
        //orderHistory=orderHistory + productListingSting + "\n";
        TextView textview = findViewById(R.id.textView3);
        textview.setText(orderHistory);
    }

}