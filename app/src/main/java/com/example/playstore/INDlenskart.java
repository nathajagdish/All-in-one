package com.example.playstore;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class INDlenskart extends AppCompatActivity {
  private   WebView W;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_indlenskart);
        W=findViewById(R.id.w);
        W.loadUrl("https://www.lenskart.com/");
        WebSettings wb=W.getSettings();
        // wb.setJavaScriptCanOpenWindowsAutomatically(true);
        wb.setJavaScriptEnabled(true);
        W.setWebViewClient(new WebViewClient());
    }

    @Override
    public void onBackPressed() {
        if(W.canGoBack()){
            W.goBack();}
        else
        {
            super.onBackPressed();
        }
    }}
