package com.example.kalkulator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText    angka_pertama, angka_kedua, operasi;
    Button      hitung;
    TextView    hasil;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        angka_pertama   = (EditText)findViewById(R.id.angka_pertama);
        angka_kedua     = (EditText)findViewById(R.id.angka_kedua);
        operasi         = (EditText)findViewById(R.id.operasi);
        hasil           = (TextView)findViewById(R.id.hasil);
        hitung          = findViewById(R.id.hitung);
        }
    public void Hitung(View view){
      int angka1    =Integer.parseInt(angka_pertama.getText().toString());
      int angka2    = Integer.parseInt(angka_kedua.getText().toString());
      String Hitung = operasi.getText().toString();

      switch (Hitung){
          case "+" :
              int adalah = angka1 + angka2;
              hasil.setText(String.valueOf(adalah));
              break;

          case "-" :
              int adalah2 = angka1 - angka2;
              hasil.setText(String.valueOf(adalah2));
              break;

          case "*" :
              int adalah3 = angka1 * angka2;
              hasil.setText(String.valueOf(adalah3));
              break;

          case "/" :
              int adalah4 = angka1 / angka2;
              hasil.setText(String.valueOf(adalah4));
              break;

          default:
              hasil.setText("OPERASI ARITMATIK TIDAK SESUAI");
      }
    }
}