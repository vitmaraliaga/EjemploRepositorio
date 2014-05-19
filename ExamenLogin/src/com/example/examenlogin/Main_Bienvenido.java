package com.example.examenlogin;

import android.R.string;
import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.widget.TextView;

public class Main_Bienvenido extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		Bundle extras= getIntent().getExtras();
		String usu = extras.getString("nombreUsuario");	
		
		TextView textView= new TextView(getApplicationContext());
		textView.setText("Bienvenido : "+ usu);
		
		
		setContentView(textView);
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main__bienvenido, menu);
		return true;
	}

}
