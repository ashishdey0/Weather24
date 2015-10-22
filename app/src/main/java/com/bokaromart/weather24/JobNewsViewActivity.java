package com.bokaromart.weather24;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;

import com.bokaromart.weather24.utils.Constants;
import com.bokaromart.weather24.utils.ImageAdapter;
import com.bokaromart.weather24.utils.InternetConnectionHandler;
import com.bokaromart.weather24.utils.NewsCategory;
import com.bokaromart.weather24.utils.NewsUrls;
import com.bokaromart.weather24.utils.UrlListKeys;

import java.util.List;
import java.util.Map;

public class JobNewsViewActivity extends AppCompatActivity {

    private Integer[] mThumbIds = {
            R.drawable.category_sports, R.drawable.category_sports,
            R.drawable.category_sports, R.drawable.category_sports,
            R.drawable.category_sports, R.drawable.category_business,
            R.drawable.category_cricket, R.drawable.category_sports,
            R.drawable.category_science, R.drawable.category_environment,
            R.drawable.category_technology, R.drawable.category_education,
            R.drawable.category_entertainment, R.drawable.category_lifestyle,
            R.drawable.category_sports, R.drawable.category_cricket,
            R.drawable.category_sports, R.drawable.category_cricket,
            R.drawable.category_sports, R.drawable.category_cricket,
            R.drawable.category_sports, R.drawable.category_cricket,
            R.drawable.category_sports, R.drawable.category_cricket
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grid_view_handler);
        setTitle("Categories");
        GridView gridview = (GridView) findViewById(R.id.gridview);
        ImageAdapter imageAdapter = new ImageAdapter(this);
        imageAdapter.setmThumbIds(mThumbIds);
        gridview.setAdapter(imageAdapter);
        NewsUrls urls = new NewsUrls();
        final Map<NewsCategory,String> feedsList = urls.getUlrList().get(UrlListKeys.JOB_NEWS);


        gridview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> parent, View v,
                                    int position, long id) {
                //Toast.makeText(DailyNewsViewActivity.this, "" + position,
                //        Toast.LENGTH_SHORT).show();
                if (InternetConnectionHandler.checkInternetOnResume(JobNewsViewActivity.this))
                {
                    Intent intent = new Intent(JobNewsViewActivity.this, HeadlinesActivity.class);
                    if (position < feedsList.size()) {
                        intent.putExtra(Constants.FEEDS_URL, feedsList.get(position));
                    } else
                        intent.putExtra(Constants.FEEDS_URL, "http://timesofindia.feedsportal.com/c/33039/f/533965/index.rss");
                    startActivity(intent);
                }
            }
        });

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_grid_view_handler, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    protected void onResume(){
        super.onResume();
        if(!InternetConnectionHandler.isCheckPerformed) {
            InternetConnectionHandler.checkInternetOnResume(this);
        }
    }
}
