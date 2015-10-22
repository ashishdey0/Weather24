package com.bokaromart.weather24;

import android.app.Activity;
import android.content.Intent;
import android.os.StrictMode;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;


import com.bokaromart.weather24.utils.Constants;
import com.bokaromart.weather24.utils.InternetConnectionHandler;
import com.bokaromart.weather24.utils.RssFeedsReader;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;

public class HeadlinesActivity extends Activity {
    List headlines;
    List links;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        StrictMode.enableDefaults();
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setTitle("Categories");
        Intent intent = getIntent();
        String urlString = intent.getStringExtra(Constants.FEEDS_URL);
        URL url = null;
        try {
            url = new URL(urlString);
        }
        catch(Exception e){
            e.printStackTrace();
        }
        RssFeedsReader rssFeedsReader = new RssFeedsReader();
        rssFeedsReader.setUrl(url);
        headlines= new ArrayList();
        links = new ArrayList();
        rssFeedsReader.read(headlines,links);
        ListView list = (ListView)findViewById(R.id.list);
        SpecialAdapter adapter = new SpecialAdapter(this, headlines);
        list.setAdapter(adapter);

        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if(InternetConnectionHandler.checkInternetOnResume(HeadlinesActivity.this))
                    invokeNewActivity(links.get(position).toString());
            }
        });
    }

    public void invokeNewActivity(String url){
        Intent intent = new Intent(HeadlinesActivity.this, FullStoryWebViewActivity.class);
        intent.putExtra(Constants.WEB_URL, url);
        startActivity(intent);

    }

    @Override
    protected void onResume(){
        super.onResume();
        if(!InternetConnectionHandler.isCheckPerformed) {
            InternetConnectionHandler.checkInternetOnResume(this);
        }
    }
}
