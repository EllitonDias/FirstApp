package br.com.ufc.firstapp.activity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import br.com.ufc.firstapp.R;
import br.com.ufc.firstapp.model.Cliente;

public class ListV extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view);
        setTitle("List Clients");
        longC();

        ListView list = findViewById(R.id.list_view_Lista);
        List<Cliente> client = clients();
        ArrayAdapter<Cliente> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1,client);
        list.setAdapter(adapter);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.acitivity_menu_lv,menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
            case R.id.activity_menulv_Sim:
                Toast.makeText(this,"Você clicou no sim",Toast.LENGTH_LONG).show();
                break;
            case R.id.activity_menulv_Nao:
                Toast.makeText(this,"Você clicou no Não",Toast.LENGTH_LONG).show();
                break;
            case R.id.activity_menulv_Talvez:
                Toast.makeText(this,"Você clicou no Talvez",Toast.LENGTH_LONG).show();
                break;
        }
        return super.onOptionsItemSelected(item);
    }

    private void longC() {
        TextView txt = findViewById(R.id.activity_list_view_long);

        txt.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {
                Toast.makeText(getApplicationContext(), "Você apertou longamente",Toast.LENGTH_LONG).show();
                return true;
            }
        });
    }

    private List<Cliente> clients() {
        return new ArrayList<>(Arrays.asList(
                new Cliente("josé",18,"1111222"),
                new Cliente("Maria",20,"22221111"),
                new Cliente("Chico",21,"333331111")));
    }
}