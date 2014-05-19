package com.example.examenlogin;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	public void ingresar(View view) {
		
		EditText usuario = (EditText) findViewById(R.id.editText1);
		
		Intent i = new Intent(getApplicationContext(), Main_Bienvenido.class);
		i.putExtra("nombreUsuario", usuario.getText().toString());
		startActivity(i); 
		
		usuario.setText(text)

	}

	public void registrarse(View view) {
		Log.e("ERRor", "registrarse");
		Intent i = new Intent(getApplicationContext(), Main_Registro.class);
		// inten para que exista comunicasion entre las actividades
		startActivity(i);
	}

}
