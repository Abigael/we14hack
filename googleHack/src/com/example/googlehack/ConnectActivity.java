package com.example.googlehack;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;

public class ConnectActivity extends Activity {
	Intent intent;
	Context context;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_connect);
		context = getApplicationContext(); 
	     new Handler().postDelayed(new Runnable() {
	            @Override
	            public void run() {
	                setContentView(R.layout.activity_confirm); //where <next> is you target      activity :)
	                }
	            }, 3000);  
	     
	     	intent = new Intent(this.context, ConfirmActivity.class);
	    	//Log.i("GOT INTENT: ", "WORK PLEASE");
			startActivity(intent);   
	}
	
}

