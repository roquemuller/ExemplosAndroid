package br.com.cd6.exemplosandroid;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

/**
 * Exemplos simples que gera logs nos métodos de ciclo de vida da Activity
 * 
 * Este exemplo demonstra a navegação entre as telas, e logs são impressos para monitorar os métodos chamados
 * 
 * @author Roque Junior
 *
 */
public class ExemploCicloVidaAbrirTela extends ExemploCicloVida implements OnClickListener {
	public void onCreate(Bundle icicle) {
		super.onCreate(icicle);

		Button b = new Button(this);
		b.setText("Clique aqui para abrir a tela.");
		b.setOnClickListener(this);

		setContentView(b);
	}
	public void onClick(View v) {
//		Intent it = new Intent(this,Tela2.class);
//		Bundle params = new Bundle();
//		params.putString("msg", "Ol�");
//		it.putExtras(params);
//		startActivity(it);
		
		Intent it = new Intent(this,Tela2.class);
		it.putExtra("msg", "Ol�");
		startActivity(it);
	}
}
