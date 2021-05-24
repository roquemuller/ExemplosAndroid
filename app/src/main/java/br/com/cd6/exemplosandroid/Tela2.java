package br.com.cd6.exemplosandroid;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

/**
 * Simples activity que loga
 * 
 * @author Roque Junior
 *
 */
public class Tela2 extends ExemploCicloVida {

	@Override
	public void onCreate(Bundle icicle) {
		super.onCreate(icicle);

		TextView view = new TextView(this);
		view.setText("Esta é a tela 2");
		setContentView(view);

//		Intent it = getIntent();
//		if(it != null){
//			Bundle params = it.getExtras();
//			if (params != null) {
//				String msg = params.getString("msg");
//				Log.i(CATEGORIA, "Mensagem: " + msg);
//			}
//		}

		Intent it = getIntent();
		if(it != null){
			String msg = it.getStringExtra("msg");
			if (msg != null) {
				Log.i(CATEGORIA, "Mensagem: " + msg);
			}
		}
	}
}
