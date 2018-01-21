package com.ehb.tobias.werkstuk;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import com.orm.SugarContext;

public class SettingsActivity extends AppCompatActivity {

    private ATM[] ATMArray;
    private HttpURLConnectionAPI call = new HttpURLConnectionAPI();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);
        android.support.v7.widget.Toolbar myToolbar = findViewById(R.id.toolbar);
        setSupportActionBar(myToolbar);




        final Button button = findViewById(R.id.syncButton);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                initDB();
                ATM_DB2.deleteAll(ATM_DB2.class);
                try {
                    ATMArray = call.sendGet();
                } catch (Exception e) {
                    e.printStackTrace();
                }
                for (int i = 0; i < ATMArray.length; i++) {
                    ATM_DB2 newATM = new ATM_DB2();
                    newATM.setLatitude(ATMArray[i].getCoord()[0]);
                    newATM.setLongitude(ATMArray[i].getCoord()[1]);
                    newATM.setWhat(ATMArray[i].getWhat());
                    newATM.setWat(ATMArray[i].getWat());
                    newATM.setQuoi(ATMArray[i].getQuoi());
                    newATM.setAgen(ATMArray[i].getAgen());
                    newATM.setAdresse(ATMArray[i].getAdresse());
                    newATM.setAdress(ATMArray[i].getAdress());
                    newATM.save();
                }
                SugarContext.terminate();
            }
        });
    }
        @Override
        public boolean onCreateOptionsMenu (Menu menu){
            MenuInflater findMenuItems = getMenuInflater();
            findMenuItems.inflate(R.menu.menu, menu);
            return super.onCreateOptionsMenu(menu);
        }
        @Override
        public boolean onOptionsItemSelected (MenuItem item){
            switch (item.getItemId()) {
                case R.id.action_settings:
                    return true;
                case R.id.action_map:
                    Intent myIntent = new Intent(this, MainActivity.class);
                    startActivity(myIntent);
                    return true;

                default:
                    return super.onOptionsItemSelected(item);

            }
        }
        public void initDB(){
            SugarContext.init(this);
        }
    }
