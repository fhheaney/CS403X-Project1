package com.heaney.fiona.screen4;


import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTheme(android.R.style.Theme_Holo_Light_DarkActionBar);

        final EditText et1 = (EditText) findViewById(R.id.editText1);
        final EditText et2 = (EditText) findViewById(R.id.editText2);
        final EditText et3 = (EditText) findViewById(R.id.editText3);
        final EditText et4 = (EditText) findViewById(R.id.editText4);
        final EditText et5 = (EditText) findViewById(R.id.editText5);

        et1.setBackgroundResource(R.drawable.edit_text_border);
        et2.setBackgroundResource(R.drawable.edit_text_border);
        et3.setBackgroundResource(R.drawable.edit_text_border);
        et4.setBackgroundResource(R.drawable.edit_text_border);
        et5.setBackgroundResource(R.drawable.edit_text_border);


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
}

