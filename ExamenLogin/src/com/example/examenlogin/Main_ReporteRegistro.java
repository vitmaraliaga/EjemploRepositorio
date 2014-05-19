package com.example.examenlogin;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.widget.EditText;
import android.widget.TextView;

public class Main_ReporteRegistro extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main__reporte_registro);
		
		Bundle extras= getIntent().getExtras();
		String nom = extras.getString("nombreUsuario");	
		String ema = extras.getString("email");	
		
		TextView TextView1= (TextView) findViewById(R.id.textView2);;
		TextView1.setText("Nombre : "+nom);
	
		//TextView1.setText("Email : "+ ema);
		
		setContentView(TextView1);
		
		//setContentView(TextView1, "TextView1");
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main__reporte_registro, menu);
		return true;
	}

}
