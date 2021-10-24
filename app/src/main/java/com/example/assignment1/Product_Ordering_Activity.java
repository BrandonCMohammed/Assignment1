package com.example.assignment1;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;


public class Product_Ordering_Activity<intent> extends AppCompatActivity {

    ArrayList<String> orders = new ArrayList<String>();
    ArrayList<String> totalSpecifications = new ArrayList<String>();
    public static final String specifications = "choice";
    String productListingSting = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.product_ordering);

        ImageView imageview = (ImageView) findViewById(R.id.logo);
        imageview.setImageAlpha(60);

        TextView textview = (TextView) findViewById(R.id.ProductListing);


        if (getIntent() != null && getIntent().getExtras() != null){
            Intent intent = getIntent();
            totalSpecifications = (ArrayList<String>) intent.getSerializableExtra(specifications);
            orders = totalSpecifications;
            for(String a : totalSpecifications){
                productListingSting = productListingSting + a;
            }
            textview.setText(productListingSting);
        }else{
            textview.setText("Products selected will be shown here:");

        }

        /*Button button = (Button) findViewById(R.id.completeOrder);
        button.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v){
                Intent intent= new Intent(Product_Ordering_Activity.this,Complete_Order_Activity2.class);
                intent.putExtra(Complete_Order_Activity2.CompleteOrders, orders);
                startActivity(intent);
            }

        });

         */


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
        orders.add(product);
        Intent intent = new Intent(this, Product_Specification_Activity.class);

        if(checked){
            intent.putExtra(Product_Specification_Activity.productChoice, orders);
        }
        startActivity(intent);

    }

    public void completeOrder(View view) {

        Intent intent= new Intent(Product_Ordering_Activity.this,Complete_Order_Activity2.class);

        intent.putExtra(Complete_Order_Activity2.CompleteOrders, orders);

        startActivity(intent);

    }

}