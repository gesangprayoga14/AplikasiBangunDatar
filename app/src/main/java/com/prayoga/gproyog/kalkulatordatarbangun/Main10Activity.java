package com.prayoga.gproyog.kalkulatordatarbangun;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Main10Activity extends AppCompatActivity implements View.OnClickListener {

    EditText editTextAlas;
    EditText editTextTinggi;
    Button buttonHitung;
    TextView textViewResult;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main10);

        editTextAlas = findViewById(R.id.alas);
        editTextTinggi = findViewById(R.id.tinggi);

        buttonHitung = findViewById(R.id.hitung);
        buttonHitung.setOnClickListener(this);

        textViewResult = findViewById(R.id.hasil);
    }


    @Override
    public void onClick(View v) {

        if (v.getId() == R.id.hitung) {

            String inputAlas = editTextAlas.getText().toString().trim();
            String inputTinggi = editTextTinggi.getText().toString().trim();

            boolean isEmptyFields  = false;
            boolean isInvalidDouble = false;

            if (TextUtils.isEmpty(inputAlas)) {
                editTextAlas.setError("Isian tidak boleh kosong");
                isEmptyFields = true;
            }

            if (TextUtils.isEmpty(inputTinggi)) {
                editTextTinggi.setError("Isian ini tidak boleh kosong");
                isEmptyFields = true;
            }

            Double alas =  toDouble(inputAlas);
            Double tinggi = toDouble(inputTinggi);

            if (alas == null) {
                editTextAlas.setError("Angka yang dimasukkan harus valid");
                isInvalidDouble = true;
            }

            if (tinggi == null) {
                editTextTinggi.setError("Angka yang dimasukkan harus valid");
                isInvalidDouble = true;
            }

            if (!isEmptyFields && !isInvalidDouble) {
                SegitigaSikusiku hitungSegitigaSikusiku = new SegitigaSikusiku();
                hitungSegitigaSikusiku.setAlas(alas);
                hitungSegitigaSikusiku.setTinggi(tinggi);

                Double hasil = hitungSegitigaSikusiku.luas();

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
