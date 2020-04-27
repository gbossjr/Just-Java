package android.example.justjava;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    int quantity = 2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * This method is called when the order button is clicked.
     */
    public void submitOrder(View view) {
       int price = calculatePrice();
       displayMessage(createOrderSummary(price));


    }


    /**
     * Calculates the price of the order.
     *
     * @param quantity is the number of cups of coffee ordered
     */
    private int calculatePrice() {
        return quantity * 5;

    }

    private String createOrderSummary(int price) {
        String priceMessage = "Name: Kaptain Kumal";
        priceMessage += "\nQuantity: " + quantity;
        priceMessage += "\nTotal: $" + price;
        priceMessage += "\nThank You!";

        return priceMessage;
    }

    /**
     * This method displays the given quantity value on the screen.
     */
    private void displayQuantity(int value) {
        TextView quantityTextView = (TextView) findViewById(R.id.quantity_text_view);
        quantityTextView.setText("" + value);
    }

    public void incrememt(View view) {
        quantity = quantity + 1;
        displayQuantity(quantity);
    }

    public void decrement(View view) {
        quantity = quantity - 1;
        displayQuantity(quantity);
    }

    /**
     * This method displays the given text on the screen.
     */
    private void displayMessage(String message) {
        TextView priceTextView = (TextView) findViewById(R.id.price_text_view);
        priceTextView.setText(message);
    }

}
