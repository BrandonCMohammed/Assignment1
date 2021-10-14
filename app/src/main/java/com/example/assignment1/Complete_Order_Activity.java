package com.example.assignment1;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;


public class Complete_Order_Activity extends AppCompatActivity {

    Button btn;
    TextView txt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_product_specification_activiy);
    }

    public void completeOrder(View view){
        //print product list here
    }

    public void sendOrder(View view){
        //send order to whatsapp here

    }


}
