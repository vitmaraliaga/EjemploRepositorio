package com.example.examenlogin;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.EditText;

public class Main_Registro extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main__registro);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main__registro, menu);
		return true;
	}
	
	public void reportar(View view) {
		
		EditText nombre = (EditText) findViewById(R.id.editText1);
		EditText email = (EditText) findViewById(R.id.editText2);

		Intent n = new Intent(getApplicationContext(), Main_ReporteRegistro.class);
		n.putExtra("nombreUsuario", nombre.getText().toString());
		n.putExtra("email", email.getText().toString());
		startActivity(n);
		

	}

}
