package com.example.googlehack;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

public class SearchActivity extends Activity {

	
	Intent intent; 
	Context context; 
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_search);
	}
	
	 public void searchMatches(View v){
	    	Log.i("GOT HERE: ", "YAAP"); 
	    	context = getApplicationContext(); 
	    	Log.i("GOT CONTEXT: ", "WORK PLEASE");
			intent = new Intent(this.context, ConnectActivity.class);
	    	Log.i("GOT INTENT: ", "WORK PLEASE");
			startActivity(intent);        	
	    }
}
