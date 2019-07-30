package com.example.myapplication;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Main4Activity extends AppCompatActivity implements View.OnClickListener {

    private Button pencet;
    private EditText text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4);

        Button pencet = findViewById(R.id.btnresultdata);
        pencet.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent Data = new Intent();
        EditText txtnama = findViewById(R.id.name);

        Data.setData(Uri.parse(txtnama.getText().toString()));
        setResult(RESULT_OK, Data);

        finish();
    }
}
