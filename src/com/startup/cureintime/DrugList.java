package com.startup.cureintime;

import android.app.ActionBar;
import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.ListView;

public class DrugList extends Activity {

	ListView lvDrugList;
	DrugListAdapter adapter;
	String[] dummy = new String[] { "Neozep", "Oraxyl", "Ornex", "Peracon",
			"Pharmachem", "Robitussin", "Rondec", "Salvotran", "Sinecod",
			"Solmux", "Trimulex", "Tuseran", "Tussicon", "ZyMeltic" };

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.druglist);
		setup();
	}

	private void setup() {
		// Setup Action Bar
		ActionBar actionbar = getActionBar();
		actionbar.setTitle("Recommended Drug List");
		actionbar.setIcon(R.drawable.logo);
		actionbar.setDisplayHomeAsUpEnabled(true);
		actionbar.show();
		
		// Setup Druglist Listview
		lvDrugList = (ListView)findViewById(R.id.lvDrugList);
		adapter = new DrugListAdapter(DrugList.this, dummy);
		lvDrugList.setAdapter(adapter);
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		MenuInflater inflater = getMenuInflater();
		inflater.inflate(R.menu.plain_actionbar, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// TODO Auto-generated method stub
		switch (item.getItemId()) {
		case android.R.id.home:
			finish();
			break;
		}
		return true;
	}

}
