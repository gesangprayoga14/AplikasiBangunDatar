package com.prayoga.gproyog.kalkulatordatarbangun;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Main3Activity extends AppCompatActivity implements View.OnClickListener{

    EditText editTextSisi;
    Button buttonHitung;
    TextView textViewResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        editTextSisi = findViewById(R.id.sisi);

        buttonHitung = findViewById(R.id.hitung);
        buttonHitung.setOnClickListener(this);

        textViewResult = findViewById(R.id.hasil);
    }
    @Override
    public void onClick(View v) {

        if (v.getId() == R.id.hitung) {

            String inputSisi = editTextSisi.getText().toString().trim();


            boolean isEmptyFields  = false;
            boolean isInvalidDouble = false;

            if (TextUtils.isEmpty(inputSisi)) {
                editTextSisi.setError("Isian tidak boleh kosong");
                isEmptyFields = true;
            }

            Double sisi =  toDouble(inputSisi);


            if (sisi == null) {
                editTextSisi.setError("Angka yang dimasukkan harus valid");
                isInvalidDouble = true;
            }


            if (!isEmptyFields && !isInvalidDouble) {
                Persegi hitungPersegi = new Persegi();
                hitungPersegi.setSisi(sisi);

                Double hasil = hitungPersegi.luas();

                textViewResult.setText(String.valueOf(hasil));
            }
        }
    }
    private Double toDouble(String str) {
        try {
            return Double.valueOf(str);
        } catch (NumberFormatException e) {
            return null;
        }
    }
}
