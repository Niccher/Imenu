package com.example.nicch.gvn49;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class Hotels extends AppCompatActivity {

    private RecyclerView rcVw;
    private  RecyclerView.Adapter RcVwAd;

    private List<List4> listITs;


    public Hotels() {
        // Required empty public constructor
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hotels);

        rcVw =(RecyclerView) findViewById(R.id.MyDropa);
        rcVw.setHasFixedSize(true);
        rcVw.setLayoutManager(new LinearLayoutManager(getApplicationContext()));

        listITs=new ArrayList<>();

        for (int i=0;i<=20;i++){
            List4 lit=new List4(
                    "Date () "+ (i+1),
                    "Category ()",
                    "Message Header Here ()","True"
            );

            listITs.add(lit);
            RcVwAd =new Adpta(listITs,getApplicationContext());
            rcVw.setAdapter(RcVwAd);
        }

        rcVw.setAdapter(RcVwAd);
        RcVwAd =new Adpta(listITs,getApplicationContext());

    }
}
