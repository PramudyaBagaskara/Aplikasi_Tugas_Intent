package com.example.myapplication;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity implements View.OnClickListener {

    private Button hasilhg;
    private EditText nilaiX;
    private TextView result;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        hasilhg = findViewById(R.id.idhasilhg);
        nilaiX = findViewById(R.id.rhg);
        result = findViewById(R.id.mhg);
        hasilhg.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {

        int rumus = 10;
        if (v.getId() == R.id.idhasilhg) {

            String nilai = nilaiX.getText().toString().trim();

            boolean isInvalidFields = false;

            int hsl = toInt(nilai);

            if (nilai == null) {
                isInvalidFields = true;
                nilaiX.setError("Tidak Boleh Kosong!");
            }
            if (!isInvalidFields) {

                int hasil = hsl * rumus;
                result.setText("Total Berat\n"+String.valueOf(hasil));
                Intent Data = new Intent();
                Data.setData(Uri.parse(String.valueOf(hasil)));
                setResult(RESULT_OK, Data);


                finish();

            }
        }


    }

    private Integer toInt(String str) {
        try {
            return Integer.valueOf(str);
        }catch (Exception ae){
            return null;
        }
    }
}
