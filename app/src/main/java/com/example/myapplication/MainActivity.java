package com.example.myapplication;

import android.content.Intent;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private TextView f;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button kghg =findViewById(R.id.kg_hg);
        kghg.setOnClickListener(this);

        Button kgdag =findViewById(R.id.kg_dag);
        kgdag.setOnClickListener(this);
        this.setTitle("Uji Intent");




    }

    @Override
    public void onClick(View v) {


            switch (v.getId()){
                case R.id.kg_hg :
                    Intent kgdg = new Intent(this, Main2Activity.class);
                    startActivityForResult(kgdg, 1);
                    break;

                case R.id.kg_dag :
                    Intent kgdag = new Intent(this, Main3Activity.class);
                    startActivityForResult(kgdag, 2);
                    break;
            }



    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        if (requestCode == 1||requestCode == 2){
            if (resultCode == RESULT_OK){
                TextView f = findViewById(R.id.returndata);
                f.setText(data.getData().toString());
            }
        }
    }
}
