package com.example.nicch.gvn49;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class AboutusGrid extends AppCompatActivity {

    Button b1,b2,b3,b4,b5,b6,b7,b8;

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        //Toast.makeText(this, "On-Backed 1", Toast.LENGTH_SHORT).show();
        finish();
        startActivity(new Intent(AboutusGrid.this, Basement.class));
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aboutus_grid);

        b1= (Button) findViewById(R.id.button);
        b2= (Button) findViewById(R.id.button1);
        b3= (Button) findViewById(R.id.button2);
        b4= (Button) findViewById(R.id.button3);
        b5= (Button) findViewById(R.id.button4);
        b6= (Button) findViewById(R.id.button5);
        b7= (Button) findViewById(R.id.button6);
        b8= (Button) findViewById(R.id.button7);

        /*String eml,pho,loc,des,abt,spec;
        int coun;*/

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(AboutusGrid.this, Restaurants.class);
                intent.putExtra("Counta", "1");
                startActivity(intent);
            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //startActivity(new Intent(AboutusGrid.this, Restaurants.class));
                Intent intent = new Intent(AboutusGrid.this, Restaurants.class);
                intent.putExtra("Counta", "2");
                startActivity(intent);
            }
        });

        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //startActivity(new Intent(AboutusGrid.this, Restaurants.class));
                Intent intent = new Intent(AboutusGrid.this, Restaurants.class);
                intent.putExtra("Counta", "3");
                startActivity(intent);
            }
        });

        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //startActivity(new Intent(AboutusGrid.this, Restaurants.class));
                Intent intent = new Intent(AboutusGrid.this, Restaurants.class);
                intent.putExtra("Counta", "4");
                startActivity(intent);
            }
        });

        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //startActivity(new Intent(AboutusGrid.this, Restaurants.class));
                Intent intent = new Intent(AboutusGrid.this, Restaurants.class);
                intent.putExtra("Counta", "5");
                startActivity(intent);
            }
        });

        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //startActivity(new Intent(AboutusGrid.this, Restaurants.class));
                Intent intent = new Intent(AboutusGrid.this, Restaurants.class);
                intent.putExtra("Counta", "6");
                startActivity(intent);
            }
        });

        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //startActivity(new Intent(AboutusGrid.this, Restaurants.class));
                Intent intent = new Intent(AboutusGrid.this, Restaurants.class);
                intent.putExtra("Counta", "7");
                startActivity(intent);
            }
        });

        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //startActivity(new Intent(AboutusGrid.this, Restaurants.class));
                Intent intent = new Intent(AboutusGrid.this, Restaurants.class);
                intent.putExtra("Counta", "8");
                startActivity(intent);
            }
        });

        /*GridView gridView =(GridView)findViewById(R.id.gridView);
        gridView.setAdapter(new GridAdapter(AboutusGrid.this));*/
    }
}

/*class GridAdapter extends BaseAdapter{
    Context context;
    String string="123456789";

    public GridAdapter(Context c){
        context = c;
    }

    @Override
    public int getCount() {
        return string.length();
    }

    @Override
    public Object getItem(int position) {
        return string.charAt(position);
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int position, View view, ViewGroup viewGroup) {
        TextView textView = new TextView(context);
        textView.setText(String.valueOf(string.charAt(position)));
        return textView;
    }
}*/