package com.example.android.javeapp;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

/**
 * This app displays an order form to order coffee.
 */
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * This method is called when the order button is clicked.
     */
    int quantityOfCofee = 0;

    public void submitOrder(View view) {
        display(quantityOfCofee);
        String priceMessege = "Total $" + quantityOfCofee*5;
        priceMessege = priceMessege + "\nThank You!";
        displayPrice(priceMessege);
    }

    /**
     * This method is called when the plus button is clicked.
     */
    public void increment(View view) {
        display(quantityOfCofee+=1);
    }
    /**
     * This method is called when the miuns button is clicked.
     */
    public void decrement(View view) {
        display(quantityOfCofee-=1);
    }

    /**
     * This method displays the given quantity value on the screen.
     */
    private void display(int number) {
        TextView quantityTextView = (TextView) findViewById(R.id.quantity_text_view);
        quantityTextView.setText("" + number);
    }

    /**
     * This method displays the given price on the screen.
     */
    private void displayPrice(String string) {
        TextView priceTextView = (TextView) findViewById(R.id.price_text_view);
        priceTextView.setText(string);
    }
}