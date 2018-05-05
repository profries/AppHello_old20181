package com.example.iossenac.apphello;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void tratarOK(View v){
        Log.i("mensagem", "Hello World");
        EditText editTextNome = (EditText) findViewById(R.id.editTextNome);
        String nome = editTextNome.getText().toString();
        Log.i("mensagem","Hello "+nome);

        TextView textViewHello = (TextView) findViewById(R.id.textViewHello);
        textViewHello.setText("Hello "+nome);
    }

}
