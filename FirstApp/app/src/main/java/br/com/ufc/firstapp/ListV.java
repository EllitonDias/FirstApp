package br.com.ufc.firstapp;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.List;

public class ListV extends AppCompatActivity {
    ListView listView;
    EditText nome;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_view);
        listView = findViewById(R.id.list_view_Lista);
        nome = findViewById(R.id.editTextTextPersonName);

        String editName = nome.getText().toString();
        List<String> nome = new ArrayList<>();
        nome.add(editName);
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1,nome);
        listView.setAdapter(adapter);
    }


}