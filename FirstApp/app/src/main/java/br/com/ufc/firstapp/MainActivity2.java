package br.com.ufc.firstapp;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.TextView;
import android.widget.ToggleButton;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity2 extends AppCompatActivity {

    MediaPlayer Morena;
    ToggleButton verificar;
    TextView resNomeMusica;
    AutoCompleteTextView auto;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Morena = MediaPlayer.create(this,R.raw.Morena);
        resNomeMusica = findViewById(R.id.activity_main_resMusica);
        verificar = findViewById(R.id.toggleButton);

        String str[]={"Sim","Não"};
        auto = findViewById(R.id.activity_main_autoCompleteTextView);
        ArrayAdapter adp = new ArrayAdapter<String>(this,android.R.layout.simple_dropdown_item_1line,str);
        auto.setThreshold( 1 );
        auto.setAdapter(adp);
    }@Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_menu, menu);
        return true;
    }
    public void PlayMusica(View view) {
        Morena.start();
    }
    private void nomeMusica(View v){

        if(verificar.isChecked()){
            resNomeMusica.setText("Morena");
        }else{

        }

    }

}