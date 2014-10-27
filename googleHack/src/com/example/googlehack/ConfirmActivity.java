package com.example.googlehack;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class ConfirmActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

		setContentView(R.layout.activity_confirm);
	}
	public void sentRequest(View v){
		Button request = (Button)(findViewById(R.id.confirm)); 
		request.setText("Request sent!");
	}
}
