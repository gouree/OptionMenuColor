package com.example.gouree.optionmenucolor;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.TextView;
import android.widget.Toast;

import java.util.zip.Inflater;

public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    @Override
    // method for creating an inflator object
    public boolean onCreateOptionsMenu(Menu menu) {


        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu_main,menu);

        return true;
    }


    @Override
    //method to perform operations on click of menu items
    public boolean onOptionsItemSelected(MenuItem item) {

        //textview object
        TextView t1= (TextView)findViewById(R.id.textView);

        //depending on the item selected we need to perform operations
        //item.getitemid fetches id of the selected menu item
        switch(item.getItemId())
        {
            // if selected item is red execute this case
                case R.id.redid:
                    //change the text and text color also make a toast
                    t1.setText("You selected red color");
                    t1.setTextColor(this.getResources().getColor(R.color.red));
                    Toast.makeText(getBaseContext(),"You selected red color",Toast.LENGTH_SHORT).show();
                break;

            // if selected item is green execute this case
            case R.id.greenid:
                // //change the text and text color also make a toast
                t1.setText("You selected green color");
                t1.setTextColor(this.getResources().getColor(R.color.green));
                Toast.makeText(getBaseContext(),"You selected green color",Toast.LENGTH_SHORT).show();
                break;

            //// if selected item is blue execute this case
            case R.id.blueid:
                //change the text and text color also make a toast
                t1.setText("You selected blue color");
                t1.setTextColor(this.getResources().getColor(R.color.colorPrimaryDark));
                Toast.makeText(getBaseContext(),"You selected blue color",Toast.LENGTH_SHORT).show();
                break;
        }
        return super.onOptionsItemSelected(item);
    }
}
