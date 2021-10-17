package com.example.assignment1;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.widget.Toast;


public class Complete_Order_Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_product_specification_activiy);
    }

    public void completeOrder(View view){
        //print product list here
        System.out.print("Your complete order is: ");

    }

    //@SuppressLint("QueryPermissionsNeeded")
    private void sendOrder(View view)
    {
        Intent intent = new Intent(Intent.ACTION_SEND);
        intent.setPackage("com.whatsapp");

        if (intent.resolveActivity(getPackageManager()) == null) {
            Toast.makeText(this, "Please install whatsapp first.", Toast.LENGTH_SHORT).show();
            return;
        }

        //sending order to whatsapp here
        // Starting Whatsapp
        startActivity(intent);
    }


}
