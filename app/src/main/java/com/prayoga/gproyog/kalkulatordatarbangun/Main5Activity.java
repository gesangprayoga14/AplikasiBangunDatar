package com.prayoga.gproyog.kalkulatordatarbangun;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Main5Activity extends AppCompatActivity implements View.OnClickListener {

    EditText editTextJmrusuksejajar;
    EditText editTextTinggi;
    Button buttonHitung;
    TextView textViewResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);

        editTextJmrusuksejajar = findViewById(R.id.jmrusuksejajar);
        editTextTinggi = findViewById(R.id.tinggi);

        buttonHitung = findViewById(R.id.hitung);
        buttonHitung.setOnClickListener(this);

        textViewResult = findViewById(R.id.hasil);
    }
    @Override
    public void onClick(View v) {

        if (v.getId() == R.id.hitung) {

            String inputJmrusuksejajar = editTextJmrusuksejajar.getText().toString().trim();
            String inputTinggi = editTextTinggi.getText().toString().trim();

            boolean isEmptyFields  = false;
            boolean isInvalidDouble = false;

            if (TextUtils.isEmpty(inputJmrusuksejajar)) {
                editTextJmrusuksejajar.setError("Isian tidak boleh kosong");
                isEmptyFields = true;
            }

            if (TextUtils.isEmpty(inputTinggi)) {
                editTextTinggi.setError("Isian ini tidak boleh kosong");
                isEmptyFields = true;
            }

            Double jmrusuksejajar =  toDouble(inputJmrusuksejajar);
            Double tinggi = toDouble(inputTinggi);

            if (jmrusuksejajar == null) {
                editTextJmrusuksejajar.setError("Angka yang dimasukkan harus valid");
                isInvalidDouble = true;
            }

            if (tinggi == null) {
                editTextTinggi.setError("Angka yang dimasukkan harus valid");
                isInvalidDouble = true;
            }

            if (!isEmptyFields && !isInvalidDouble) {
                Trapesium hitungTrapesium = new Trapesium();
                hitungTrapesium.setJmrusuksejajar(jmrusuksejajar);
                hitungTrapesium.setTinggi(tinggi);

                Double hasil = hitungTrapesium.luas();

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
