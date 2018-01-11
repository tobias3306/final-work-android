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
import com.orm.SugarRecord;

public class SettingsActivity extends AppCompatActivity {

    private ATM[] ATMArray;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);
        android.support.v7.widget.Toolbar myToolbar = findViewById(R.id.toolbar);
        setSupportActionBar(myToolbar);

        SugarContext.init(this);
    }

        final Button button = findViewById(R.id.syncButton);
        /*button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                ATM_DB.deleteAll(ATM_DB.class);
                HttpURLConnectionAPI call = new HttpURLConnectionAPI();
                try {
                    ATMArray = call.sendGet();
                } catch (Exception e) {
                    e.printStackTrace();
                }
                for (int i = 0; i < ATMArray.length; i++) {
                    ATM_DB newATM = new ATM_DB();
                    newATM.setAdress(ATMArray[i].getFields().getAdress());
                    newATM.setAdresse(ATMArray[i].getFields().getAdresse());
                    newATM.setAgen(ATMArray[i].getFields().getAgen());
                    newATM.setLatitude(ATMArray[i].getFields().getCoord_wgs84()[0]);
                    newATM.setLongitude(ATMArray[i].getFields().getCoord_wgs84()[1]);
                    newATM.setDatasetid(ATMArray[i].getDatasetid());
                    newATM.setQuoi(ATMArray[i].getFields().getQuoi());
                    newATM.setRecordid(ATMArray[i].getRecordid());
                    newATM.setRecord_timestamp(ATMArray[i].getRecord_timestamp());
                    newATM.setWat(ATMArray[i].getFields().getWat());
                    newATM.setWhat(ATMArray[i].getFields().getWhat());
                    newATM.save();
                }
            }
        });*/
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
    }
