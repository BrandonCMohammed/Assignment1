package com.example.assignment1;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;


public class Product_Ordering_Activity extends AppCompatActivity {

    ArrayList<String> flavors = new ArrayList<String>();
    public static final String specifications = "choice";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.product_ordering);

        ImageView imageview = (ImageView) findViewById(R.id.logo);
        imageview.setImageAlpha(100);

        TextView textview = (TextView) findViewById(R.id.ProductListing);

        Intent intent = getIntent();
        String totalSpecifications = intent.getStringExtra(specifications);
        if ( totalSpecifications == ""){
            textview.setText("Products selected will be shown here:");
        }else{
            textview.setText(totalSpecifications);
        }

    }

    public void onCheckboxClicked(View view){

        CheckBox checkbox = (CheckBox)view;
        boolean checked = checkbox.isChecked();
        String product = "";

        switch (view.getId()){

            case R.id.Product1:
                if(checked){
                    product = checkbox.getText().toString();
                }
                break;
            case R.id.Product2:
                if(checked) {
                    product = checkbox.getText().toString();
                }

            case R.id.Product3:
                if(checked){
                    product = checkbox.getText().toString();
                }
        }

        Intent intent = new Intent(this, Product_Specification_Activity.class);

        if(checked){
            intent.putExtra(Product_Specification_Activity.productChoice, product);
        }
        startActivity(intent);

    }



    public void completeOrder(View view){



    }

}