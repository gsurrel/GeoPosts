package org.surrel.geoposts;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class MyGeoposts extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_my_geoposts);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.my_geoposts, menu);
		return true;
	}

}