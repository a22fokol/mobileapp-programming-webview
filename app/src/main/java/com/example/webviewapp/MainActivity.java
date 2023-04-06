package com.example.webviewapp;

import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

public class MainActivity extends AppCompatActivity {

    public void showExternalWebPage(){
        myWebWiew.loadUrl("https://www.youtube.com/watch?v=YA_sNH6wFA0");
        // TODO: Add your code for showing external web page here
    }

    public void showInternalWebPage(){
        myWebWiew.loadUrl("file:///android_asset/Bonjour.html");
        // TODO: Add your code for showing internal web page here

    }

    private WebView myWebWiew;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        myWebWiew=(WebView) findViewById(R.id.my_webview);
        myWebWiew.setWebViewClient(new WebViewClient());
        myWebWiew.getSettings().setJavaScriptEnabled(true);



    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_external_web) {
            showExternalWebPage();
            Log.d("==>","showExternalWebPage()");
            return true;
        }

        if (id == R.id.action_internal_web) {
            showInternalWebPage();
            Log.d("==>","showInternalWebPage()");
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
