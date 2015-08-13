package me.lancie.myappportfolio;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;


public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button1 = (Button) findViewById(R.id.button1);
        Button button2 = (Button) findViewById(R.id.button2);
        Button button3 = (Button) findViewById(R.id.button3);
        Button button4 = (Button) findViewById(R.id.button4);
        Button button5 = (Button) findViewById(R.id.button5);
        Button button6 = (Button) findViewById(R.id.button6);



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


    public void launchApp (View view) {
        switch (view.getId()) {
            case R.id.button1:
                displayToast(getString(R.string.app1));
                break;
            case R.id.button2:
                displayToast(getString(R.string.app2));
                break;
            case R.id.button3:
                displayToast(getString(R.string.app3));
                break;
            case R.id.button4:
                displayToast(getString(R.string.app4));
                break;
            case R.id.button5:
                displayToast(getString(R.string.app5));
                break;
            case R.id.button6:
                displayToast(getString(R.string.app6));
                break;
            default:
                displayToast("This shouldn't be happening");
                break;
        }
    }

    public void displayToast(CharSequence text) {
        text = "This button will launch " + text;
        Toast.makeText(getApplicationContext(), text, Toast.LENGTH_SHORT).show();
    }
}
