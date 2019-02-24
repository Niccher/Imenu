package com.example.nicch.gvn49;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

import static java.lang.Integer.parseInt;

public class Restaurants extends AppCompatActivity {

    TextView Nm,Eml,Phon,Loc,Desc,Abt,Spe;

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        //Toast.makeText(this, "On-Backed 2", Toast.LENGTH_SHORT).show();
        finish();
        startActivity(new Intent(Restaurants.this, AboutusGrid.class));
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_restaurants);

        Intent intent = getIntent();
        String pas=intent.getStringExtra("Counta");
        int count = parseInt(pas);

        //Toast.makeText(this, "Passed -> "+count, Toast.LENGTH_SHORT).show();

        Nm= (TextView) findViewById(R.id.nam);
        Eml= (TextView) findViewById(R.id.Eml);
        Phon= (TextView) findViewById(R.id.Phon);
        Loc= (TextView) findViewById(R.id.Loc);
        Desc= (TextView) findViewById(R.id.Desc);
        Abt= (TextView) findViewById(R.id.Abt);
        Spe= (TextView) findViewById(R.id.Spe);

        String nam[] ={"Restaurant 1", "Restaurant 2", "Restaurant 3", "Restaurant 4", "Restaurant 5", "Restaurant 6", "Restaurant 7", "Restaurant 8"};
        String eml[] ={"Restaurant1@sensationaltech.com", "Restaurant2@sensationaltech.com", "Restaurant3@sensationaltech.com","Restaurant4@sensationaltech.com", "Restaurant5@sensationaltech.com", "Restaurant6@sensationaltech.com", "Restaurant7@sensationaltech.com", "Restaurant8@sensationaltech.com"};
        String phon[] ={"+2547 12456789", "+2547 12456789", "+2547 12456789", "+2547 12456789", "+2547 12456789", "+2547 12456789", "+2547 12456789", "+2547 12456789"};
        String loc[] ={"Thika", "Githurai", "Zimmerman", "RoySambu", "AllSops", "Ruiru", "Juja", "Kahawa"};
        String des[] ={"Organic Food Colours", "Kienyenji Only", "Green Housed", "Red Volcanic Soils", "New Recipes", "Somali camels", "Lean Meats", "Italian and Chinese"};
        String abt[] ={"Best Chefs", "Kienyenji Only", "Ripened by sun", "Natural From Forest", "Unique Flavors", "Camel and Goat", "Massai And Zebu Meats", "World Class Chefs"};
        String spe[] ={"Pizzas", "Chicken", "Fruits", "Tubers", "Ice-Cream", "Milk Products", "Beef Products", "Exotic Cuisines"};

        if(count>0 && count<9){
            //Toast.makeText(this, "Value Parsed -> "+count, Toast.LENGTH_SHORT).show();

            if (count==1){
                Nm.setText(nam[0]);
                Eml.setText("Email -> "+eml[0]);
                Phon.setText("Phone -> "+phon[0]);
                Loc.setText("Location -> "+loc[0]);
                Desc.setText("Description -> "+des[0]);
                Abt.setText("About -> "+abt[0]);
                Spe.setText("Speciality -> "+spe[0]);
            }

            if (count==2){
                Nm.setText(nam[1]);
                Eml.setText("Email -> "+eml[1]);
                Phon.setText("Phone -> "+phon[1]);
                Loc.setText("Location -> "+loc[1]);
                Desc.setText("Description -> "+des[1]);
                Abt.setText("About -> "+abt[1]);
                Spe.setText("Speciality -> "+spe[1]);
            }

            if (count==3){
                Nm.setText(nam[2]);
                Eml.setText("Email -> "+eml[2]);
                Phon.setText("Phone -> "+phon[2]);
                Loc.setText("Location -> "+loc[2]);
                Desc.setText("Description -> "+des[2]);
                Abt.setText("About -> "+abt[2]);
                Spe.setText("Speciality -> "+spe[2]);
            }

            if (count==4){
                Nm.setText(nam[3]);
                Eml.setText("Email -> "+eml[3]);
                Phon.setText("Phone -> "+phon[3]);
                Loc.setText("Location -> "+loc[3]);
                Desc.setText("Description -> "+des[3]);
                Abt.setText("About -> "+abt[3]);
                Spe.setText("Speciality -> "+spe[3]);
            }

            if (count==5){
                Nm.setText(nam[4]);
                Eml.setText("Email -> "+eml[4]);
                Phon.setText("Phone -> "+phon[4]);
                Loc.setText("Location -> "+loc[4]);
                Desc.setText("Description -> "+des[4]);
                Abt.setText("About -> "+abt[4]);
                Spe.setText("Speciality -> "+spe[4]);
            }

            if (count==6){
                Nm.setText(nam[5]);
                Eml.setText("Email -> "+eml[5]);
                Phon.setText("Phone -> "+phon[5]);
                Loc.setText("Location -> "+loc[5]);
                Desc.setText("Description -> "+des[5]);
                Abt.setText("About -> "+abt[5]);
                Spe.setText("Speciality -> "+spe[5]);
            }

            if (count==7){
                Nm.setText(nam[6]);
                Eml.setText("Email -> "+eml[6]);
                Phon.setText("Phone -> "+phon[6]);
                Loc.setText("Location -> "+loc[6]);
                Desc.setText("Description -> "+des[6]);
                Abt.setText("About -> "+abt[6]);
                Spe.setText("Speciality -> "+spe[6]);
            }

            if (count==8){
                Nm.setText(nam[7]);
                Eml.setText("Email -> "+eml[7]);
                Phon.setText("Phone -> "+phon[7]);
                Loc.setText("Location -> "+loc[7]);
                Desc.setText("Description -> "+des[7]);
                Abt.setText("About -> "+abt[7]);
                Spe.setText("Speciality -> "+spe[7]);
            }

        }
        else {
            startActivity(new Intent(Restaurants.this,AboutusGrid.class));
        }


    }
}
