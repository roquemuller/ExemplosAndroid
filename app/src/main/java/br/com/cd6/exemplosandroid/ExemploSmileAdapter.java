package br.com.cd6.exemplosandroid;

import android.app.ListActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

/**
 * Exemplo de um Adapter customizado, exibindo imagens
 * 
 * @author Roque Junior
 *
 */
public class ExemploSmileAdapter extends ListActivity {

	@Override
	public void onCreate(Bundle icicle) {
		super.onCreate(icicle);

		ArrayList<Smile> list = new ArrayList<Smile>();

		list.add(new Smile("Feliz", Smile.FELIZ));
		list.add(new Smile("Triste", Smile.TRISTE));
		list.add(new Smile("Louco", Smile.LOUCO));

		// Adaptador de lista customizado para cada linha
		setListAdapter(new SmileAdapter(this, list));
	}

	@Override
	protected void onListItemClick(ListView l, View v, int position, long id) {
		super.onListItemClick(l, v, position, id);

		// Pega o Smile naquela posição
		Smile smile = (Smile) this.getListAdapter().getItem(position);

		// Exibe um alerta
		Toast.makeText(this, "Você selecionou o Smile: " + smile.nome, Toast.LENGTH_SHORT).show();
	}
}
