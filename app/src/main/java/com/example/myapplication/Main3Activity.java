package com.example.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Main3Activity extends AppCompatActivity implements View.OnClickListener {

    private Button hasildag;
    private EditText dag;
    private TextView mdag;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        hasildag = findViewById(R.id.idhasildag);
        dag = findViewById(R.id.dag);
        mdag = findViewById(R.id.mdag);
        hasildag.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        int rumus = 100;
        if (v.getId() == R.id.idhasildag) {

            String total = dag.getText().toString().trim();

            boolean isInvalidFields = false;

            int hl = toInt(total);

            if (total == null) {
                isInvalidFields = true;
                dag.setError("Tidak Boleh Kosong!");
            }
            if (!isInvalidFields) {

                int hasil = hl * rumus;
                mdag.setText("Total Berat\n"+String.valueOf(hasil));

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