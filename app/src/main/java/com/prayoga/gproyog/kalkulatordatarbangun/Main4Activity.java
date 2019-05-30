package com.prayoga.gproyog.kalkulatordatarbangun;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Main4Activity extends AppCompatActivity implements View.OnClickListener{

    EditText editTextPanjang;
    EditText editTextLebar;
    Button buttonHitung;
    TextView textViewResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);

        editTextPanjang = findViewById(R.id.panjang);
        editTextLebar = findViewById(R.id.lebar);

        buttonHitung = findViewById(R.id.hitung);
        buttonHitung.setOnClickListener(this);

        textViewResult = findViewById(R.id.hasil);
    }


    @Override
    public void onClick(View v) {

        if (v.getId() == R.id.hitung) {

            String inputPanjang = editTextPanjang.getText().toString().trim();
            String inputLebar = editTextLebar.getText().toString().trim();

            boolean isEmptyFields = false;
            boolean isInvalidDouble = false;

            if (TextUtils.isEmpty(inputPanjang)) {
                editTextPanjang.setError("Isian tidak boleh kosong");
                isEmptyFields = true;
            }

            if (TextUtils.isEmpty(inputLebar)) {
                editTextLebar.setError("Isian ini tidak boleh kosong");
                isEmptyFields = true;
            }

            Double panjang = toDouble(inputPanjang);
            Double lebar = toDouble(inputLebar);

            if (panjang == null) {
                editTextPanjang.setError("Angka yang dimasukkan harus valid");
                isInvalidDouble = true;
            }

            if (lebar == null) {
                editTextLebar.setError("Angka yang dimasukkan harus valid");
                isInvalidDouble = true;
            }

            if (!isEmptyFields && !isInvalidDouble) {
                PersegiPanjang hitungPersegiPanjang = new PersegiPanjang();
                hitungPersegiPanjang.setPanjang(panjang);
                hitungPersegiPanjang.setLebar(lebar);

                Double hasil = hitungPersegiPanjang.luas();

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
