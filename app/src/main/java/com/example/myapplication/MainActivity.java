package com.example.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

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
                    startActivity(kgdg);
                    break;

                case R.id.kg_dag :
                    Intent kgdag = new Intent(this, Main3Activity.class);
                    startActivity(kgdag);
                    break;
            }



    }
}
