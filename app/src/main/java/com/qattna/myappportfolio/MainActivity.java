package com.qattna.myappportfolio;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void openApp(View view) {
        Toast message;
        String messageMainPart = "This button will launch ";
        switch (view.getId()){
            case R.id.spotifyAppButton:
                Button app1 = (Button) findViewById(view.getId());
                message = Toast.makeText(getApplicationContext(),messageMainPart+app1.getText() , Toast.LENGTH_LONG);
                message.show();
                break;

            case R.id.scoresAppButton:
                Button app2 = (Button) findViewById(view.getId());
                message = Toast.makeText(getApplicationContext(),messageMainPart+app2.getText() , Toast.LENGTH_LONG);
                message.show();
                break;

            case R.id.libraryAppButton:
                Button app3 = (Button) findViewById(view.getId());
                message = Toast.makeText(getApplicationContext(),messageMainPart+app3.getText() , Toast.LENGTH_LONG);
                message.show();
                break;

            case R.id.buildItBiggerAppButton:
                Button app4 = (Button) findViewById(view.getId());
                message = Toast.makeText(getApplicationContext(),messageMainPart+app4.getText() , Toast.LENGTH_LONG);
                message.show();
                break;

            case R.id.readerAppButton:
                Button app5 = (Button) findViewById(view.getId());
                message = Toast.makeText(getApplicationContext(),messageMainPart+app5.getText() , Toast.LENGTH_LONG);
                message.show();
                break;

            case R.id.myOwnAppButton:
                Button app6 = (Button) findViewById(view.getId());
                message = Toast.makeText(getApplicationContext(),messageMainPart+app6.getText() , Toast.LENGTH_LONG);
                message.show();
                break;
        }

    }
}
