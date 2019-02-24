package com.example.nicch.gvn49;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Toast;

public class Browsa extends AppCompatActivity {

    WebView webv;

    @Override
    public void onBackPressed() {
        if (webv.canGoBack()){
            webv.goBack();
        }else {
            super.onBackPressed();
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_browsa);

        Intent intent = getIntent();
        String linka=intent.getStringExtra("Path");

        Toast.makeText(this, "Opening -> "+linka, Toast.LENGTH_SHORT).show();

        webv= (WebView) findViewById(R.id.renda);
        WebSettings webs=webv.getSettings();
        webs.setJavaScriptEnabled(true);
        webv.loadUrl(linka);
        webv.setWebViewClient(new WebViewClient());
    }
}
