package com.example.tom.guessthenumber;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class SaveActivity extends ActionBarActivity {

    EditText emailInput;
    TextView emailText;
    MyDBHandler dbHandler;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_save);
        emailText = (TextView) findViewById(R.id.emailText);
        emailInput = (EditText) findViewById(R.id.emailInput);
        dbHandler = new MyDBHandler(this, null, null, 1);
        printDatabase();
    }

    //Add a product to the database
    public void addButtonClicked(View view){
        Products products = new Products(emailInput.getText().toString());
        dbHandler.addProduct(products);
        printDatabase();
        //print prototype message
        Toast.makeText(SaveActivity.this,
        "This is a prototype, users email will not display in final release", Toast.LENGTH_LONG)
        .show();
    }

    //Delete items
    public void deleteButtonClicked(View view){
        String inputText = emailInput.getText().toString();
        dbHandler.deleteProduct(inputText);
        printDatabase();
        //print prototype message
        Toast.makeText(SaveActivity.this,
                "This is a prototype, delete button will not be available in final release", Toast.LENGTH_LONG)
                .show();
    }

    //Print the database
    public void printDatabase(){
        String dbString = dbHandler.databaseToString();
        emailText.setText(dbString);
        emailInput.setText("");
    }

}