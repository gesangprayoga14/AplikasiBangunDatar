package com.prayoga.gproyog.kalkulatordatarbangun;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Main6Activity extends AppCompatActivity implements View.OnClickListener {
    EditText editTextDiagonal1;
    EditText editTextDiagonal2;
    Button buttonHitung;
    TextView textViewResult;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main6);

        editTextDiagonal1 = findViewById(R.id.diagonal1);
        editTextDiagonal2 = findViewById(R.id.diagonal2);

        buttonHitung = findViewById(R.id.hitung);
        buttonHitung.setOnClickListener(this);

        textViewResult = findViewById(R.id.hasil);
    }

    @Override
    public void onClick(View v) {

        if (v.getId() == R.id.hitung) {

            String inputDiagonal1 = editTextDiagonal1.getText().toString().trim();
            String inputDiagonal2 = editTextDiagonal2.getText().toString().trim();

            boolean isEmptyFields  = false;
            boolean isInvalidDouble = false;

            if (TextUtils.isEmpty(inputDiagonal1)) {
                editTextDiagonal1.setError("Isian tidak boleh kosong");
                isEmptyFields = true;
            }

            if (TextUtils.isEmpty(inputDiagonal2)) {
                editTextDiagonal2.setError("Isian ini tidak boleh kosong");
                isEmptyFields = true;
            }

            Double diagonal1 =  toDouble(inputDiagonal1);
            Double diagonal2 = toDouble(inputDiagonal2);

            if (diagonal1 == null) {
                editTextDiagonal1.setError("Angka yang dimasukkan harus valid");
                isInvalidDouble = true;
            }

            if (diagonal2 == null) {
                editTextDiagonal2.setError("Angka yang dimasukkan harus valid");
                isInvalidDouble = true;
            }

            if (!isEmptyFields && !isInvalidDouble) {
                BelahKetupat hitungBelahKetupat = new BelahKetupat();
                hitungBelahKetupat.setDiaoganal1(diagonal1);
                hitungBelahKetupat.setDiagonal2(diagonal2);

                Double hasil = hitungBelahKetupat.luas();

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
