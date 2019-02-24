package com.example.nicch.gvn49;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.hardware.Camera;
import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraManager;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Process;
import android.provider.Settings;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import com.google.zxing.integration.android.IntentIntegrator;
import com.google.zxing.integration.android.IntentResult;

public class Basement extends AppCompatActivity {
    Button lg,camvw;
    TextView Bout,ansa;
    EditText usr,pwd;
    AlertDialog.Builder builder,builde;
    Context cnt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_basement);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        camvw= (Button) findViewById(R.id.btn_camvw);

        final Activity activity = this;

        camvw.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(final View view) {

                IntentIntegrator integrator = new IntentIntegrator(activity);
                integrator.setDesiredBarcodeFormats(IntentIntegrator.QR_CODE_TYPES);
                //integrator.setPrompt("Scanning For I-menu");
                integrator.setPrompt("Press Vol-UP and Vol-DOWN To toggle flashlight");
                integrator.setCameraId(0);
                integrator.setBeepEnabled(true);
                integrator.setBarcodeImageEnabled(false);
                integrator.initiateScan();

                /*CameraManager camma= (CameraManager) getSystemService(Context.CAMERA_SERVICE);
                String camid=null;
                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
                    try {
                        //camid=camma.getCameraIdList(0);
                        camid=camma.getCameraIdList()[0];
                        camma.setTorchMode(camid,true);
                    }catch (CameraAccessException ex){
                        Toast.makeText(activity, "Error--> "+ex.getMessage(), Toast.LENGTH_SHORT).show();
                    }
                }*/
            }
        });

    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        final IntentResult result = IntentIntegrator.parseActivityResult(requestCode, resultCode, data);
        if(result != null){
            if(result.getContents()==null){
                Toast.makeText(this, "You cancelled the scanning", Toast.LENGTH_LONG).show();
            }
            else {
                //Toast.makeText(this, result.getContents(),Toast.LENGTH_LONG).show();
                //final String pars=String.valueOf(result.getContents());

                Intent intent = new Intent(Basement.this, Browsa.class);
                intent.putExtra("Path", String.valueOf(result.getContents()));
                startActivity(intent);
                    /*builder = new android.app.AlertDialog.Builder(Basement.this);
                    builder.setTitle("QR Contents...");
                    builder.setMessage(result.getContents());
                    builder.setPositiveButton("Open Link", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialogInterface, int i) {
                            dialogInterface.dismiss();
                            /*try {
                                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse(result.getContents()));
                                startActivity(browserIntent);
                            } catch (Exception ex){
                                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://"+result.getContents()));
                                Toast.makeText(Basement.this, "Error ->"+ex.getMessage(), Toast.LENGTH_SHORT).show();
                                startActivity(browserIntent);
                            }

                            Intent intent = new Intent(Basement.this, Browsa.class);
                            intent.putExtra("Path", String.valueOf(result.getContents()));
                            startActivity(intent);

                        }
                    });

                builder.setNegativeButton("Dissmis", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        dialogInterface.dismiss();
                    }
                });
                    android.app.AlertDialog alertdialog = builder.create();
                    alertdialog.show();*/

            }
        }
        else {
            super.onActivityResult(requestCode, resultCode, data);
        }
    }

    public void onNothingSelected(AdapterView arg0) {
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.basement, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_About) {
            startActivity(new Intent(Basement.this, Aboutus.class));
            return true;
        }

        if (id == R.id.action_Other) {
            startActivity(new Intent(Basement.this, AboutusGrid.class));
            return true;
        }

        if (id == R.id.action_Share) {
            try {
                ClipboardManager clipman= (ClipboardManager) cnt.getSystemService(CLIPBOARD_SERVICE);
                //clipman.setText("only dummy Link WAS PROVIDED");
                String lin="only dummy Link WAS PROVIDED";
                ClipData clipda=ClipData.newPlainText(lin,"11111");
                clipman.setPrimaryClip(clipda);
                Toast.makeText(Basement.this, "Link succesfully Copied to Clipboard", Toast.LENGTH_LONG).show();
            }
            catch (Exception ex){
                Toast.makeText(Basement.this, "Link No Longer Works", Toast.LENGTH_SHORT).show();
            }
            return true;
        }

        if (id == R.id.action_Quit) {
            builder = new android.app.AlertDialog.Builder(Basement.this);
            builder.setTitle("Quit App");
            builder.setMessage("You Sure You want to exit");
            builder.setPositiveButton("Proceed", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialogInterface, int i) {
                    dialogInterface.dismiss();
                    //Process.killProcess(Process.myPid());
                    //Basement.super.onDestroy();

                    Intent intt=new Intent(Intent.ACTION_MAIN);
                    intt.addCategory(Intent.CATEGORY_HOME);
                    intt.setFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                    startActivity(intt);

                    finish();
                    System.exit(0);
                }
            });

            builder.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
                @Override
                public void onClick(DialogInterface dialogInterface, int i) {
                    dialogInterface.dismiss();
                }
            });
            android.app.AlertDialog alertdialog = builder.create();
            alertdialog.show();
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    //@Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        /*DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);*/
        return true;
    }
}
