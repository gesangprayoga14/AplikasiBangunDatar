package com.prayoga.gproyog.kalkulatordatarbangun;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Main9Activity extends AppCompatActivity implements View.OnClickListener {
    EditText editTextRuas;
    Button buttonHitung;
    TextView textViewResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main9);

        editTextRuas = findViewById(R.id.ruas);

        buttonHitung = findViewById(R.id.hitung);
        buttonHitung.setOnClickListener(this);

        textViewResult = findViewById(R.id.hasil);
    }

    @Override
    public void onClick(View v) {

        if (v.getId() == R.id.hitung) {

            String inputRuas = editTextRuas.getText().toString().trim();


            boolean isEmptyFields = false;
            boolean isInvalidDouble = false;

            if (TextUtils.isEmpty(inputRuas)) {
                editTextRuas.setError("Isian tidak boleh kosong");
                isEmptyFields = true;
            }

            Double ruas = toDouble(inputRuas);


            if (ruas == null) {
                editTextRuas.setError("Angka yang dimasukkan harus valid");
                isInvalidDouble = true;
            }


            if (!isEmptyFields && !isInvalidDouble) {
                Lingkaran hitungLingkaran = new Lingkaran();
                hitungLingkaran.setRuas(ruas);
                Double hasil = hitungLingkaran.luas();
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
