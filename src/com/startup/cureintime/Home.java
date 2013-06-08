package com.startup.cureintime;

import android.app.ActionBar;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentTabHost;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;

public class Home extends FragmentActivity {
	
	private FragmentTabHost mTabHost;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.home);
		setup();
	}

	private void setup() {
		// TODO Auto-generated method stub
		
		// Setup Action Bar
		ActionBar actionbar = getActionBar();
		actionbar.setTitle("Cure In Time");
		actionbar.setIcon(R.drawable.logo);
		actionbar.show();
		
		// Setup tabs
		mTabHost = (FragmentTabHost) findViewById(android.R.id.tabhost);
        mTabHost.setup(this, getSupportFragmentManager(), R.id.realtabcontent);
        mTabHost.addTab(mTabHost.newTabSpec("illnesses").setIndicator("Illnesses"), Illnesses.class, null);
        mTabHost.addTab(mTabHost.newTabSpec("feeds").setIndicator("Feeds"), Feeds.class, null);
        mTabHost.addTab(mTabHost.newTabSpec("listings").setIndicator("Listings"), Listings.class, null);
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		MenuInflater inflater = getMenuInflater();
		inflater.inflate(R.menu.activity_start, menu);
		return true;
	}

	@Override
    public boolean onOptionsItemSelected(MenuItem item) {
    	// TODO Auto-generated method stub
    	switch (item.getItemId()) {
	        case R.id.action_location:
	        	Toast.makeText(this, "Find Nearest Pharmacy", Toast.LENGTH_SHORT).show();
	        	break;
	        case R.id.action_mycart:
	        	Toast.makeText(this, "Go to my cart", Toast.LENGTH_SHORT).show();
	        	break;
        }
    	return true;
    }

}
