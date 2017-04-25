package com.myapplicationdev.android.tw_listview;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class SecondActivity extends AppCompatActivity {

    ListView lv;
    TextView tvYear;
    ArrayAdapter aa;
    ArrayList<Module> module;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        lv = (ListView) this.findViewById(R.id.lvModules);
        tvYear = (TextView) findViewById(R.id.tvYear);

        Intent i = getIntent();
        String year = i.getStringExtra("year");
        tvYear.setText(year);

        module = new ArrayList<Module>();
        if(year.equalsIgnoreCase("Year 2")) {
            module.add(new Module("C208", true));
            module.add(new Module("C200", false));
            module.add(new Module("C346", true));

        }else if(year.equalsIgnoreCase("Year 1")){
            module.add(new Module("C105 Programming", true));
        }




        aa = new ModuleAdapter(this, R.layout.module, module);
        lv.setAdapter(aa);




    }



}
