package com.example.student.db020402;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;
import android.widget.SimpleAdapter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ArrayList<Map<String, String>> mylist = new ArrayList<>();
        HashMap<String, String> m1 = new HashMap<>();
        m1.put("city", "台北");
        m1.put("code", "02");
        mylist.add(m1);
        HashMap<String, String> m2 = new HashMap<>();
        m2.put("city", "台中");
        m2.put("code", "04");
        mylist.add(m2);
        HashMap<String, String> m3 = new HashMap<>();
        m3.put("city", "高雄");
        m3.put("code", "07");
        mylist.add(m3);

        SimpleAdapter sa = new SimpleAdapter(this,
                mylist,
                android.R.layout.simple_list_item_2,
                new String[] {"city", "code"},
                new int[] {android.R.id.text1, android.R.id.text2});
        ListView lv = (ListView) findViewById(R.id.listView);

        lv.setAdapter(sa);
    }
}